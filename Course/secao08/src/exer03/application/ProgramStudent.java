package exer03.application;

import exer03.entities.Student;
import java.util.Scanner;
import java.util.Locale;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter your name: ");
        student.name = input.nextLine();

        System.out.println("Enter your points: ");
        student.nota01 = input.nextDouble();
        student.nota02 = input.nextDouble();
        student.nota03 = input.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.notaFinal());

        if (student.notaFinal() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        input.close();
    }
}
