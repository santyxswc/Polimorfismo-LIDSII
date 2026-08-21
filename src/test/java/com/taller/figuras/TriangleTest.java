package com.taller.figuras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    private static final double DELTA = 0.0001;

    @Test
    void testCalculateArea() {
        Triangle triangle = new Triangle(4.0, 5.0);
        assertEquals(10.0, triangle.calculateArea(), DELTA);
    }

    @Test
    void testCalculatePerimeter() {
        // Con la simplificación de triángulo equilátero: perímetro = 3 * base
        Triangle triangle = new Triangle(4.0, 5.0);
        assertEquals(12.0, triangle.calculatePerimeter(), DELTA);
    }

    @Test
    void testGetBaseAndHeight() {
        Triangle triangle = new Triangle(4.2, 4.5);
        assertEquals(4.2, triangle.getBase(), DELTA);
        assertEquals(4.5, triangle.getHeight(), DELTA);
    }
}
