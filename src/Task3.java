import java.util.Scanner;
import java.lang.Math;

public class Task3 {
    static void main(String[] args) {
        //Vars
        double side1 = 0;
        double side2 = 0;
        boolean side1Check = false;
        boolean side2Check = false;
        double area = 0;
        double perimeter = 0;
        double diag = 0;
        Scanner scan = new Scanner(System.in);

        //Inputs
        do {
            System.out.println("Enter side length 1:");

            if (scan.hasNextDouble()) {
                side1 = scan.nextDouble();

                if (side1 <= 0) {
                    System.out.println("Error.");
                } else {
                    side1Check = true;
                }
            } else {
                System.out.println("Error.");
                scan.nextLine();
            }
        } while (!side1Check);

        do {
            System.out.println("Enter side length 2:");

            if (scan.hasNextDouble()) {
                side2 = scan.nextDouble();

                if (side2 <= 0) {
                    System.out.println("Error.");
                } else {
                    side2Check = true;
                }
            } else {
                System.out.println("Error.");
                scan.nextLine();
            }
        } while (!side2Check);

        //Calculations
        area = (side1 * side2) / 2;
        diag = Math.hypot(side1, side2);
        perimeter = side1 + side2 + diag;

        //Outputs
        System.out.printf("\n%-10s%23.2f m²", "Area:", area);
        System.out.printf("\n%-10s%23.2f m", "Perimeter:", perimeter);
        System.out.printf("\n%-10s%10.2f m", "Straight-line distance:", diag);
    }
}
