import model.Exercise;
import model.Formula;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        Formula formula = new Formula(weight, height, age);

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
                    result = formula.CalculateMaleDeficit(Exercise.SEDENTARY);
                    System.out.println("You should eat less than " + result + " calories");
                } else {
                    result = formula.CalculateFemaleDeficit(Exercise.SEDENTARY);
                    System.out.println("You should eat less than " + result + " calories");
                }
            }
            case 2 -> {
                if (Objects.equals(gender, "male")) {
                    result = formula.CalculateMaleDeficit(Exercise.VERY_ACTIVE);
                    System.out.println("You should eat less than " + result + " calories");
                } else {
                    result = formula.CalculateFemaleDeficit(Exercise.VERY_ACTIVE);
                    System.out.println("You should eat less than " + result + " calories");
                }
            }
            case 3 -> {
                if (Objects.equals(gender, "male")) {
                    result = formula.CalculateMaleDeficit(Exercise.LIGHTLY_ACTIVE);
                    System.out.println("You should eat less than " + result + " calories");
                } else {
                    result = formula.CalculateFemaleDeficit(Exercise.LIGHTLY_ACTIVE);
                    System.out.println("You should eat less than " + result + " calories");
                }
            }
            case 4 -> {
                if (Objects.equals(gender, "male")) {
                    result = formula.CalculateMaleDeficit(Exercise.EXTREMELY_ACTIVE);
                    System.out.println("You should eat less than " + result + " calories");
                } else {
                    result = formula.CalculateFemaleDeficit(Exercise.EXTREMELY_ACTIVE);
                    System.out.println("You should eat less than " + result + " calories");
                }
            }
            case 5 -> {
                if (Objects.equals(gender, "male")) {
                    result = formula.CalculateMaleDeficit(Exercise.MODERATELY_ACTIVE);
                    System.out.println("You should eat less than " + result + " calories");
                } else {
                    result = formula.CalculateFemaleDeficit(Exercise.MODERATELY_ACTIVE);
                    System.out.println("You should eat less than " + result + " calories");
                }
            }
        }
    }
}