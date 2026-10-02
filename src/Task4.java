import java.util.Scanner;
import java.lang.Math;

public class Task4 {
    static void main(String[] args) {
        //Vars
        int randomNum = (int)(Math.random() * 16) + 20;
        int guess = 0;
        boolean check = false;
        Scanner scan = new Scanner(System.in);

        //Inputs
        do {
            System.out.println("Input guess between 20 and 35.");

            if (scan.hasNextInt()) {
                guess = scan.nextInt();

                if (guess >= 20 && guess <= 35) {
                    check = true;
                } else {
                    System.out.println("Invalid, try again.");
                }
            } else {
                System.out.println("Error, incorrect data type");
            }

            scan.nextLine();
        } while (!check);

        //Outputs
        System.out.println("Your guess was: " + guess);
        System.out.println("The real number was: " + randomNum);
        if (guess == randomNum) {
            System.out.println("Correct guess!");
        } else if (guess > randomNum) {
            System.out.println("Guess was too high.");
        } else {
            System.out.println("Guess was too low.");
        }
    }
}
