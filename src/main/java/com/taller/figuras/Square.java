package com.taller.figuras;

/**
 * Representa un cuadrado. Hereda de Figure e implementa
 * su propia forma de calcular área y perímetro.
 */
public class Square extends Figure {

    private double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
