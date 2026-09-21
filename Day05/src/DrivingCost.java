import java.util.Scanner;

public class DrivingCost {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double miles = sc.nextDouble();

        System.out.print("Enter cost per gallon: ");
        double costPerGallon = sc.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = sc.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parking = sc.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = sc.nextDouble();

        double gallonsUsed = miles / milesPerGallon;

        double fuelCost = gallonsUsed * costPerGallon;

        double totalCost = fuelCost + parking + tolls;

        System.out.println("Daily driving cost: " + totalCost);

        sc.close();
    }
}