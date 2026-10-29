package com.houarizegai.calculator.theme;

import com.houarizegai.calculator.theme.properties.Theme;

import java.awt.Color;

import static com.houarizegai.calculator.util.ColorUtil.hex2Color;

/**
 * Adapter pattern (Structural) - the "Adapter".
 * Theme (the "Adaptee") keeps its colors as hex strings read from the YAML
 * file, like "FF8C00". The UI needs Color objects. This class wraps a Theme
 * and converts every hex string to a Color, so the UI never deals with
 * strings or with ColorUtil directly.
 */
public class ThemeColorAdapter implements ColorScheme {

    private final Theme theme;

    public ThemeColorAdapter(Theme theme) {
        this.theme = theme;
    }

    @Override
    public Color getApplicationBackground() {
        return hex2Color(theme.getApplicationBackground());
    }

    @Override
    public Color getTextColor() {
        return hex2Color(theme.getTextColor());
    }

    @Override
    public Color getEqualTextColor() {
        return hex2Color(theme.getBtnEqualTextColor());
    }

    @Override
    public Color getOperatorBackground() {
        return hex2Color(theme.getOperatorBackground());
    }

    @Override
    public Color getNumbersBackground() {
        return hex2Color(theme.getNumbersBackground());
    }

    @Override
    public Color getEqualBackground() {
        return hex2Color(theme.getBtnEqualBackground());
    }
}
