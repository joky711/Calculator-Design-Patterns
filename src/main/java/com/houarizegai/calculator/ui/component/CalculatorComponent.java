package com.houarizegai.calculator.ui.component;

import com.houarizegai.calculator.theme.ColorScheme;

/**
 * Composite pattern (Structural) - the "Component".
 * Common interface for a single UI element (leaf) and for a group of
 * elements (composite), so the UI can treat both the same way.
 */
public interface CalculatorComponent {

    void applyColors(ColorScheme colors);

    void setVisible(boolean visible);
}
