package com.houarizegai.calculator.ui.component;

import com.houarizegai.calculator.theme.ColorScheme;

import javax.swing.JComponent;

/**
 * Composite pattern (Structural) - a "Leaf".
 * Wraps the display screen and the combo boxes. They all use the
 * application background with the normal text color.
 */
public class FieldComponent implements CalculatorComponent {

    private final JComponent field;

    public FieldComponent(JComponent field) {
        this.field = field;
    }

    @Override
    public void applyColors(ColorScheme colors) {
        field.setForeground(colors.getTextColor());
        field.setBackground(colors.getApplicationBackground());
    }

    @Override
    public void setVisible(boolean visible) {
        field.setVisible(visible);
    }
}
