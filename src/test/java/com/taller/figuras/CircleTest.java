package com.taller.figuras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    private static final double DELTA = 0.0001;

    @Test
    void testCalculateArea() {
        Circle circle = new Circle(2.0f);
        double expected = Math.PI * 2.0 * 2.0;
        assertEquals(expected, circle.calculateArea(), DELTA);
    }

    @Test
    void testCalculatePerimeter() {
        Circle circle = new Circle(2.0f);
        double expected = 2 * Math.PI * 2.0;
        assertEquals(expected, circle.calculatePerimeter(), DELTA);
    }

    @Test
    void testGetRadius() {
        Circle circle = new Circle(3.5f);
        assertEquals(3.5f, circle.getRadius(), DELTA);
    }
}
