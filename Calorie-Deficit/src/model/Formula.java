package model;

public class Formula {
    private int weight;
    private int height;
    private int age;


    public Formula(int weight, int height, int age) {
    this.weight = weight;
    this.height = height;
    this.age = age;
    }

    public int getWeight() {
    return weight;
    }

    public int getHeight() {
    return height;
    }

    public int getAge() {
    return age;
    }

    public double CalculateMaleDeficit(Formula formula) {
        double BMR = (9.99 * getWeight()) + (6.25 * getHeight()) - (4.92 * getAge()) + 5;
        String excercise;
        double TDEE;
        return 0;
    }

    public double CalculateFemaleDeficit(Formula formula) {
        double BMR = (9.99 * getWeight()) + (6.25 * getHeight()) - (4.92 * getAge()) - 161;
        String excercise;
        double TDEE;
        return 0;
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
