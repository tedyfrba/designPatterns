package org.tadeo.patterns.plainImpl.structural.composite;

import org.tadeo.patterns.plainImpl.structural.composite.shape.Circle;
import org.tadeo.patterns.plainImpl.structural.composite.shape.CompoundShape;
import org.tadeo.patterns.plainImpl.structural.composite.shape.Dot;
import org.tadeo.patterns.plainImpl.structural.composite.shape.Rectangle;

import java.awt.*;

/**
 * https://refactoring.guru/design-patterns/composite
 *
 * allows composing objects into a tree-like structure and work with the it as if it was a singular object
 */
public class CompositeRun {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
