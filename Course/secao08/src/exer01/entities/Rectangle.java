package exer01.entities;

public class Rectangle {
    public double width;
    public double heigth;

    public double Area() { return width * heigth; }

    public double Perimeter() { return 2 * (width + heigth); }

    public double Diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
    }
}
