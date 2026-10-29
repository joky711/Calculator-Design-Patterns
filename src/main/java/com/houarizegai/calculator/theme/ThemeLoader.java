package com.houarizegai.calculator.theme;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.houarizegai.calculator.theme.properties.Theme;
import com.houarizegai.calculator.theme.properties.ThemeList;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/**
 * Singleton pattern (Creational).
 * Only one ThemeLoader exists in the whole application. The YAML file is
 * read one time and the themes are kept in memory, so any class that needs
 * the themes asks the same instance instead of reading the file again.
 */
public final class ThemeLoader {

    private static final String THEMES_FILE = "src/main/resources/application.yaml";

    // volatile so all threads see the object after it is fully created
    private static volatile ThemeLoader instance;

    private final Map<String, Theme> themes;

    // private constructor: nobody outside can call "new ThemeLoader()"
    private ThemeLoader() {
        themes = readThemesFromFile();
    }

    // global access point (lazy initialization + double-checked locking)
    public static ThemeLoader getInstance() {
        if (instance == null) {
            synchronized (ThemeLoader.class) {
                if (instance == null) {
                    instance = new ThemeLoader();
                }
            }
        }
        return instance;
    }

    public Map<String, Theme> getThemes() {
        return themes;
    }

    public Theme getTheme(String name) {
        return themes.get(name);
    }

    private Map<String, Theme> readThemesFromFile() {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
        try {
            ThemeList themeList = mapper.readValue(new File(THEMES_FILE), ThemeList.class);
            return themeList.getThemesAsMap();
        } catch (IOException e) {
            return Collections.emptyMap();
        }
    }
}
