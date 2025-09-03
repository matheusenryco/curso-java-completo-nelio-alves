package exer02.application;

import exer02.entities.Funcionario;

import java.util.Scanner;
import java.util.Locale;

public class ProgramFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.name = input.nextLine();

        System.out.print("Gross salary: ");
        funcionario.grossSalary = input.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = input.nextDouble();

        System.out.println("\nEmployee: " + funcionario);

        System.out.print("\nWhich percentage to increase salary ? ");
        double percentage = input.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println("\nUpdated data: " + funcionario);

        input.close();
    }
}
