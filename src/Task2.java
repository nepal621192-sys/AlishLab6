import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        //Vars
        double numCharge = 0;
        double runTime = 0;
        double costCharge = 0;
        boolean numCheck = false;
        boolean runCheck = false;
        boolean costCheck = false;
        double totalRunTime;
        double totalRunCost;
        Scanner scan = new Scanner(System.in);

        //Inputs
        do {
            System.out.println("Input number of full battery charges available:");

            if (scan.hasNextDouble()) {
                numCharge = scan.nextDouble();

                if (numCharge < 0) {
                    System.out.println("Error");
                } else {
                    numCheck = true;
                }
            } else {
                System.out.println("Error.");
            }

            scan.nextLine();
        } while(!numCheck);

        do {
            System.out.println("Input minutes of run time per full charge:");

            if (scan.hasNextDouble()) {
                runTime = scan.nextDouble();

                if (runTime < 0) {
                    System.out.println("Error");
                } else {
                    runCheck = true;
                }
            } else {
                System.out.println("Error.");
            }

            scan.nextLine();
        } while(!runCheck);

        do {
            System.out.println("Input cost in dollars to fully recharge a battery:");
            if (scan.hasNextDouble()) {
                costCharge = scan.nextDouble();

                if (costCharge < 0) {
                    System.out.println("Error");
                } else {
                    costCheck = true;
                }
            } else {
                System.out.println("Error.");
            }

            scan.nextLine();
        } while(!costCheck);

        //Outputs
        totalRunTime = numCharge * runTime;
        totalRunCost = (costCharge / runTime) * 60;

        System.out.printf("\n%10s%10.2f", "Total available minutes:", totalRunTime);
        System.out.printf("\n%10s%11.2f", "Cost to run for 60 min:", totalRunCost);
    }
}
