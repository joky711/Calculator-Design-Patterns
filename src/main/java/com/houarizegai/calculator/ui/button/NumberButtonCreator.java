package com.houarizegai.calculator.ui.button;

import javax.swing.JButton;
import java.awt.Font;

/** Concrete creator for the digit keys (0-9) and the decimal point. */
public class NumberButtonCreator extends ButtonCreator {

    @Override
    protected JButton createButton(String label) {
        JButton btn = new JButton(label);
        btn.setFont(new Font(FONT_NAME, Font.PLAIN, 28));
        return btn;
    }
}
