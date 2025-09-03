package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter your product data: ");
        System.out.print("Name: ");
        product.name = input.nextLine();

        System.out.print("Price: ");
        product.price = input.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = input.nextInt();

        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed from stock: ");
        int removeQuantity = input.nextInt();
        product.removeProducts(removeQuantity);

        System.out.print("Updated data: " + product);

        input.close();
    }
}