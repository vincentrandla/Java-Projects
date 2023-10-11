import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        int compNumber = (int) (Math.random() * 15 + 1);
        int count = 1;

        System.out.println("Guess a number between 1 and 25! ");

        Scanner scanner = new Scanner(System.in);
        int answer;


        while (true) {
            try {
                answer = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
                continue;
            }

            if (answer < 1 || answer > 25) {
                System.out.println("Please enter a number between 1 and 25.");
            } else if (answer < compNumber) {
                System.out.println("Your guess is too low.");
            } else if (answer > compNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Grats! You guessed the correct number! It took you " + count + " tries.");
                break;
            }
            count++;
            if (count > 5) {
                System.out.println("Correct answer is " + compNumber + ". Sadly you lost. ");
            }
        }
        scanner.close();
    }
}