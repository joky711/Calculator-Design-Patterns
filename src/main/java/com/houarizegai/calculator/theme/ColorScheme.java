package com.houarizegai.calculator.theme;

import java.awt.Color;

/**
 * Adapter pattern (Structural) - the "Target" interface.
 * This is what the Swing user interface wants: ready java.awt.Color objects.
 */
public interface ColorScheme {

    Color getApplicationBackground();

    Color getTextColor();

    Color getEqualTextColor();

    Color getOperatorBackground();

    Color getNumbersBackground();

    Color getEqualBackground();
}
