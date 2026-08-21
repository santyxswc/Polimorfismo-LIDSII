package com.taller.figuras;

/**
 * Representa un triángulo. Hereda de Figure e implementa
 * su propia forma de calcular área y perímetro.
 */
public class Triangle extends Figure {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        // Simplificación: se asume triángulo equilátero (los 3 lados = base)
        return base * 3;
    }
}
