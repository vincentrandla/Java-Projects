import model.Formula;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter gender: male/female: ");
        String gender = scanner.nextLine();
        System.out.println("Enter your weight in kg's: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in cm's: ");
        int height = scanner.nextInt();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
    }
}