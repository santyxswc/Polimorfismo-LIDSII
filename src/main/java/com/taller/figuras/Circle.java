package com.taller.figuras;

/**
 * Representa un círculo. Hereda de Figure e implementa
 * su propia forma de calcular área y perímetro.
 */
public class Circle extends Figure {

    private float radius;

    public Circle(float radius) {
        super();
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
