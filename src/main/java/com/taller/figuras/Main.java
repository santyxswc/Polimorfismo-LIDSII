package com.taller.figuras;

import java.util.ArrayList;
import java.util.List;

/**
 * Aplicación cliente que demuestra el polimorfismo:
 * se guardan objetos de distintas subclases en una lista de Figure
 * y, al llamar a los mismos métodos (calculateArea/calculatePerimeter),
 * cada objeto se comporta según su propia implementación.
 */
public class Main {

    public static void main(String[] args) {

        Figure fig1 = new Circle(1.0f);        // radio
        Figure fig2 = new Square(2.3);         // lado
        Figure fig3 = new Triangle(4.2, 4.5);  // base y altura

        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);

        for (Figure fig : figures) {
            System.out.println(fig.getClass().getSimpleName());
            System.out.println("  Area: " + fig.calculateArea());
            System.out.println("  Perimeter: " + fig.calculatePerimeter());
        }
    }
}
