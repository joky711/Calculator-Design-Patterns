package com.houarizegai.calculator.ui.component;

import com.houarizegai.calculator.theme.ColorScheme;

import javax.swing.JButton;

/**
 * Composite pattern (Structural) - a "Leaf".
 * Wraps one calculator key and knows which colors belong to its type.
 */
public class KeyComponent implements CalculatorComponent {

    private final JButton button;
    private final KeyType type;

    public KeyComponent(JButton button, KeyType type) {
        this.button = button;
        this.type = type;
    }

    @Override
    public void applyColors(ColorScheme colors) {
        switch (type) {
            case NUMBER:
                button.setForeground(colors.getTextColor());
                button.setBackground(colors.getNumbersBackground());
                break;
            case OPERATOR:
                button.setForeground(colors.getTextColor());
                button.setBackground(colors.getOperatorBackground());
                break;
            case EQUAL:
                button.setForeground(colors.getEqualTextColor());
                button.setBackground(colors.getEqualBackground());
                break;
        }
    }

    @Override
    public void setVisible(boolean visible) {
        button.setVisible(visible);
    }
}
