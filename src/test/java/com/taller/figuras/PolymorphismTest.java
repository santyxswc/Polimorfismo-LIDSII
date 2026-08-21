package com.taller.figuras;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class PolymorphismTest {

    @Test
    void testPolymorphicBehaviorOverFigureList() {
        Figure fig1 = new Circle(1.0f);
        Figure fig2 = new Square(2.3);
        Figure fig3 = new Triangle(4.2, 4.5);

        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);

        assertEquals(3, figures.size());

        for (Figure fig : figures) {
            // Todas las figuras responden al mismo mensaje sin importar su tipo
            assertTrue(fig.calculateArea() > 0);
            assertTrue(fig.calculatePerimeter() > 0);
        }

        // Cada objeto conserva su tipo real en tiempo de ejecución
        assertTrue(figures.get(0) instanceof Circle);
        assertTrue(figures.get(1) instanceof Square);
        assertTrue(figures.get(2) instanceof Triangle);
    }
}
