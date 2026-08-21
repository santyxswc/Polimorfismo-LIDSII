package com.taller.figuras;

/**
 * Clase abstracta que representa una figura geométrica genérica.
 * Define el "contrato" que todas las figuras hijas deben cumplir:
 * calcular su área y su perímetro.
 */
public abstract class Figure {

    private double x1;
    private double y1;

    public Figure() {
        this.x1 = 0;
        this.y1 = 0;
    }

    public Figure(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    /**
     * Cada figura hija DEBE implementar cómo calcula su área.
     */
    public abstract double calculateArea();

    /**
     * Cada figura hija DEBE implementar cómo calcula su perímetro.
     */
    public abstract double calculatePerimeter();
}
