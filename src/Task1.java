import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {
        //Vars
        double distK = 0;
        double distM = 0;
        boolean distCheck = false;
        Scanner scan = new Scanner(System.in);

        //Inputs
        do {
            System.out.println("Enter distance in kilometers:");

            if (scan.hasNextDouble()) {
                distK = scan.nextDouble();

                if (distK < 0) {
                    System.out.println("Error.");
                } else {
                    distCheck = true;
                }
            } else {
                System.out.println("Error.");
                scan.nextLine();
            }
        } while (!distCheck);

        //Outputs
        distM = distK * 0.621371;
        System.out.printf("\n%-7.2fkm \n%-7.2fmi", distK, distM);
    }
}