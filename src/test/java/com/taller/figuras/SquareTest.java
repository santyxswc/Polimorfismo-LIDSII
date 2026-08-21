package com.taller.figuras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    private static final double DELTA = 0.0001;

    @Test
    void testCalculateArea() {
        Square square = new Square(3.0);
        assertEquals(9.0, square.calculateArea(), DELTA);
    }

    @Test
    void testCalculatePerimeter() {
        Square square = new Square(3.0);
        assertEquals(12.0, square.calculatePerimeter(), DELTA);
    }

    @Test
    void testGetSide() {
        Square square = new Square(5.5);
        assertEquals(5.5, square.getSide(), DELTA);
    }
}
