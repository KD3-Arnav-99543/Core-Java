import java.util.Scanner;

public class OK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int quantity;
        double total = 0;

        while (true) {

            System.out.println("\n===== FOOD MENU =====");
            System.out.println("1. Dosa      - Rs. 50");
            System.out.println("2. Samosa    - Rs. 20");
            System.out.println("3. Idli      - Rs. 40");
            System.out.println("4. Vada      - Rs. 30");
            System.out.println("5. Poha      - Rs. 30");
            System.out.println("6. Upma      - Rs. 35");
            System.out.println("7. Tea       - Rs. 15");
            System.out.println("8. Coffee    - Rs. 25");
            System.out.println("9. Sandwich  - Rs. 60");
            System.out.println("10. Generate Bill");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 10) {
                break;
            }

            double price = 0;

            switch (choice) {

            case 1:
                price = 50;
                break;

            case 2:
                price = 20;
                break;

            case 3:
                price = 40;
                break;

            case 4:
                price = 30;
                break;

            case 5:
                price = 30;
                break;

            case 6:
                price = 35;
                break;

            case 7:
                price = 15;
                break;

            case 8:
                price = 25;
                break;

            case 9:
                price = 60;
                break;

            default:
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();

            total = total + (price * quantity);

            System.out.println("Item added successfully.");
        }

        System.out.println("\n====================");
        System.out.println("Total Bill = Rs. " + total);
        System.out.println("Thank you!");
        System.out.println("====================");

        sc.close();
    }
}