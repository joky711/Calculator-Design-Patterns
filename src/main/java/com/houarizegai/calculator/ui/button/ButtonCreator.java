package com.houarizegai.calculator.ui.button;

import javax.swing.JButton;
import java.awt.Cursor;

/**
 * Factory Method pattern (Creational) - the "Creator".
 * create(...) holds the steps that are the same for every calculator button
 * (position, size, cursor, focus). The part that changes from one kind of
 * button to another is left to the factory method createButton(...),
 * which every subclass implements in its own way.
 */
public abstract class ButtonCreator {

    protected static final String FONT_NAME = "Comic Sans MS";
    protected static final int BUTTON_WIDTH = 80;
    protected static final int BUTTON_HEIGHT = 70;

    public JButton create(String label, int x, int y) {
        JButton btn = createButton(label);          // call the factory method
        btn.setBounds(x, y, getButtonWidth(), BUTTON_HEIGHT);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setFocusable(false);
        return btn;
    }

    /** The factory method: subclasses decide what button object to make. */
    protected abstract JButton createButton(String label);

    protected int getButtonWidth() {
        return BUTTON_WIDTH;
    }
}
