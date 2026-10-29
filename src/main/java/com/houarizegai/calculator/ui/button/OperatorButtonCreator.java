package com.houarizegai.calculator.ui.button;

import javax.swing.JButton;
import java.awt.Font;

/** Concrete creator for the operator keys (C, <-, %, /, *, -, +). */
public class OperatorButtonCreator extends ButtonCreator {

    @Override
    protected JButton createButton(String label) {
        JButton btn = new JButton(label);
        btn.setFont(new Font(FONT_NAME, Font.BOLD, 28));
        btn.setToolTipText("Operator " + label);
        return btn;
    }
}
