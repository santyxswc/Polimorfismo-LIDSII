package com.taller.figuras;

/**
 * Representa un triángulo. Hereda de Figure e implementa
 * su propia forma de calcular área y perímetro.
 *
 * NOTA: la guía del taller solo pide base y altura en el constructor
 * (ver código cliente: new Triangle(4.2, 4.5)). Con solo esos dos datos
 * NO es posible calcular el perímetro real de un triángulo cualquiera
 * (para eso se necesitan los 3 lados). Aquí se asume, como simplificación,
 * un triángulo equilátero donde cada lado mide lo mismo que la base.
 * Si tu triángulo no es equilátero, lo correcto sería recibir los 3 lados
 * en el constructor en lugar de (base, altura).
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
