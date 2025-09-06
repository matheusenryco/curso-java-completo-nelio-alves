package exer03.entities;

public class Student {
    public String name;
    public double nota01;
    public double nota02;
    public double nota03;

    public double notaFinal() {
        return nota01 + nota02 + nota03;
    }

    public double missingPoints() {
        if (notaFinal() < 60.00) {
            return 60.00 - notaFinal();
        }
        else {
            return 0.00;
        }
    }
}
