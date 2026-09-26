package ak;
import java.util.Scanner;

public class akm {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.print("Enter X coordinate: ");
			double x = sc.nextDouble();
			System.out.print("Enter y coordinate: ");
			double y = sc.nextDouble();
			System.out.print("Enter diameter: ");
			double diameter = sc.nextDouble();
			
			Circle c = new Circle(x,y,diameter);
			System.out.println("X= "+c.getMyX());
			System.out.println("Y = " + c.getMyY());
	        System.out.println("Diameter = " + c.getMyDiameter());
		}catch(NegativeDiameterException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
