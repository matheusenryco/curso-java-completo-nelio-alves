package exer01.application;

import exer01.entities.Rectangle;

import java.awt.geom.Area;
import java.util.Scanner;
import java.util.Locale;

public class ProgramRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and weigth: ");
        rectangle.width = input.nextDouble();
        rectangle.heigth = input.nextDouble();

        System.out.println("AREA = " + String.format("%.2f", rectangle.Area()));
        System.out.println("PERIMETER = " + String.format("%.2f", rectangle.Perimeter()));
        System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.Diagonal()));

        input.close();
    }
}
