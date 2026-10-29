package com.houarizegai.calculator.ui.button;

import javax.swing.JButton;
import java.awt.Font;

/**
 * Concrete creator for the scientific keys (sqrt, pow, ln).
 * These keys use a smaller font and are hidden until the user
 * switches the calculator type to "Scientific".
 */
public class ScientificButtonCreator extends ButtonCreator {

    @Override
    protected JButton createButton(String label) {
        JButton btn = new JButton(label);
        btn.setFont(new Font(FONT_NAME, Font.PLAIN, 24));
        btn.setVisible(false);
        return btn;
    }
}
