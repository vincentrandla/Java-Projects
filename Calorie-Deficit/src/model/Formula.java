package model;

public class Formula {
    private double weight = 92;
    private int height = 170;
    private int age = 28;

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getAge() {
        return age;
    }


    public double CalculateMaleDeficit(Exercise exercise) {
        double BMR = (9.99 * getWeight()) + (6.25 * getHeight()) - (4.92 * getAge()) + 5;
        System.out.println("BMR on " + BMR);
        return CalculateDeficit(exercise, BMR);
    }

    public double CalculateFemaleDeficit(Exercise exercise) {
        double BMR = (9.99 * weight) + (6.25 * height) - (4.92 * age) - 161;
        return CalculateDeficit(exercise, BMR);
    }

    private double CalculateDeficit(Exercise exercise, double BMR) {
        int deficitGoal = 500;
        double TDEE = 0;
        switch (exercise) {
            case SEDENTARY -> {
                TDEE = BMR * 1.2 - deficitGoal;
            }
            case VERY_ACTIVE -> {
                TDEE = BMR * 1.375 - deficitGoal;
            }
            case LIGHTLY_ACTIVE -> {
                TDEE = BMR * 1.55 - deficitGoal;
            }
            case EXTREMELY_ACTIVE -> {
                TDEE = BMR * 1.725 - deficitGoal;
            }
            case MODERATELY_ACTIVE -> {
                TDEE = BMR * 1.9 - deficitGoal;
            }
        }
        System.out.println("TDEE on " + TDEE);
        return TDEE;
    }



// 1
// BMR
// male formula --> (9.99 x weight) + (6.25 x height) - (4.92 x age) + 5
// female formula --> (9.99 x weight) + (6.25 x height) - (4.92 x age) - 161

// 2
// use BMR to find TDEE

// TDEE
// Multiply BMR with TDEE
// Sedentary: 1.2
//Lightly active (exercise 1 to 3 times per week): 1.375
//Moderately active (exercise 3 to 5 times per week): 1.55
//Very active (hard exercise 6 to 7 times per week): 1.725
//Extremely active (hard daily exercise and a physical job): 1.9

// 3
//Subtract Weight-Loss Calories

//From there, subtract your daily calorie deficit goal of 500 to 1,000
// to calculate how many calories you should eat per day for weight loss.

}
