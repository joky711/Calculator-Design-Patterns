package com.houarizegai.calculator.ui.component;

import com.houarizegai.calculator.theme.ColorScheme;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite pattern (Structural) - the "Composite".
 * A group holds leaves or other groups. Calling a method on the group
 * passes the call down to every child, so a whole tree of components is
 * themed (or shown/hidden) with one call.
 */
public class ComponentGroup implements CalculatorComponent {

    private final String name;
    private final List<CalculatorComponent> children = new ArrayList<>();

    public ComponentGroup(String name) {
        this.name = name;
    }

    public void add(CalculatorComponent component) {
        children.add(component);
    }

    public void remove(CalculatorComponent component) {
        children.remove(component);
    }

    public List<CalculatorComponent> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    @Override
    public void applyColors(ColorScheme colors) {
        for (CalculatorComponent child : children) {
            child.applyColors(colors);
        }
    }

    @Override
    public void setVisible(boolean visible) {
        for (CalculatorComponent child : children) {
            child.setVisible(visible);
        }
    }
}
