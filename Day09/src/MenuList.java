import java.util.*;

public class MenuList {

    public static Scanner sc = new Scanner(System.in);

    public static int menuList() {

        System.out.println("\n===== STUDENT MENU =====");
        System.out.println("0. Exit");
        System.out.println("1. Add Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Search Student by Roll No");
        System.out.println("4. Sort Students by Roll No");
        System.out.println("5. Sort Students by Name");
        System.out.println("6. Sort Students by Marks");

        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        return choice;
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        int choice;

        while ((choice = menuList()) != 0) {

            switch (choice) {

            case 1:

                System.out.print("Enter Roll No: ");
                int rollNo = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();

                Student s = new Student(rollNo, name, marks);

                students.add(s);

                System.out.println("Student added successfully.");

                break;

            case 2:

                if (students.isEmpty()) {
                    System.out.println("No students available.");
                    break;
                }

                Iterator<Student> itr = students.iterator();

                while (itr.hasNext()) {

                    Student student = itr.next();

                    System.out.println(student);
                }

                break;

            case 3:

                System.out.print("Enter Roll No to search: ");
                int searchRollNo = sc.nextInt();

                boolean found = false;

                for (Student student : students) {

                    if (student.getRollNo() == searchRollNo) {

                        System.out.println("Student Found:");
                        System.out.println(student);

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

                break;

            case 4:

                students.sort((s1, s2) ->
                        Integer.compare(s1.getRollNo(), s2.getRollNo()));

                System.out.println("Students sorted by Roll No.");

                break;

            case 5:

                students.sort((s1, s2) ->
                        s1.getName().compareTo(s2.getName()));

                System.out.println("Students sorted by Name.");

                break;

            case 6:

                students.sort((s1, s2) ->
                        Double.compare(s1.getMarks(), s2.getMarks()));

                System.out.println("Students sorted by Marks.");

                break;

            default:

                System.out.println("Invalid input.");
            }
        }

        System.out.println("Program Ended.");
    }
}