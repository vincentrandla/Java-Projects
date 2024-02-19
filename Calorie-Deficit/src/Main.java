import model.Exercise;
import model.Formula;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Formula formula = new Formula();
        Scanner scanner = new Scanner(System.in);
        int selection;


        System.out.println("Enter gender: male/female: ");
        String gender = scanner.nextLine();
        System.out.println("Enter your weight in kg's: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in cm's: ");
        int height = scanner.nextInt();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Please choose your activity level by typing the corresponding number");
        System.out.println("1) Sedentary");
        System.out.println("2) Lightly active (exercise 1 to 3 times per week)");
        System.out.println("3) Moderately active (exercise 3 to 5 times per week) choose your activity level");
        System.out.println("4) Very active (hard exercise 6 to 7 times per week)");
        System.out.println("5) Extremely active (hard daily exercise and a physical job)");
        selection = scanner.nextInt();
        double result;
        switch (selection) {
            case 1 -> {
                if (Objects.equals(gender, "male")) {
                    System.out.println(formula.CalculateMaleDeficit(Exercise.SEDENTARY));
                    formula.CalculateMaleDeficit(Exercise.SEDENTARY);
                } else {
                    formula.CalculateFemaleDeficit(Exercise.SEDENTARY);
                }
            }
            case 2 -> {
                if (Objects.equals(gender, "male")) {
                    formula.CalculateMaleDeficit(Exercise.VERY_ACTIVE);
                } else {
                    formula.CalculateFemaleDeficit(Exercise.VERY_ACTIVE);
                }
            }
            case 3 -> {
                if (Objects.equals(gender, "male")) {
                    formula.CalculateMaleDeficit(Exercise.LIGHTLY_ACTIVE);
                } else {
                    formula.CalculateFemaleDeficit(Exercise.LIGHTLY_ACTIVE);
                }
            }
            case 4 -> {
                if (Objects.equals(gender, "male")) {
                    formula.CalculateMaleDeficit(Exercise.EXTREMELY_ACTIVE);
                } else {
                    formula.CalculateFemaleDeficit(Exercise.EXTREMELY_ACTIVE);
                }
            }
            case 5 -> {
                if (Objects.equals(gender, "male")) {
                    formula.CalculateMaleDeficit(Exercise.MODERATELY_ACTIVE);
                } else {
                    formula.CalculateFemaleDeficit(Exercise.MODERATELY_ACTIVE);
                }
            }
        }
    }
}