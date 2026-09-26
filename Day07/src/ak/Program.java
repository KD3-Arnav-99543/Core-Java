package ak;

import java.util.Scanner;

public class Program {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();

        System.out.println("Length = " + length);

        try {

            if (length > 80) {
                throw new ExceptionLineTooLong("The strings is too long");
            }

            System.out.println("String is valid.");

        } catch (ExceptionLineTooLong e) {

            System.out.println(e.getMessage());
        }
    }
}