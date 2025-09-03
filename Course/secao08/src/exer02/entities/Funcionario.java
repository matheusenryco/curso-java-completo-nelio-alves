package exer02.entities;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() { return grossSalary - tax; }

    public void increaseSalary(double percentage) {
        double increase = grossSalary * (percentage / 100.0);
        grossSalary += increase;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
