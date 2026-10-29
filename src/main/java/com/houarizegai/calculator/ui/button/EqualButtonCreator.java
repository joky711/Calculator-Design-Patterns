package com.houarizegai.calculator.ui.button;

import javax.swing.JButton;
import java.awt.Font;

/** Concrete creator for the "=" key, which is two columns wide. */
public class EqualButtonCreator extends ButtonCreator {

    @Override
    protected JButton createButton(String label) {
        JButton btn = new JButton(label);
        btn.setFont(new Font(FONT_NAME, Font.BOLD, 28));
        return btn;
    }

    @Override
    protected int getButtonWidth() {
        return 2 * BUTTON_WIDTH + 10;
    }
}
