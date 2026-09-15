import java.util.*;
public class Program {
	public static void  main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number: ");
		Integer num;
		num=sc.nextInt();
		String a,b,c;
		a=num.toBinaryString(num);
		System.out.println("A: "+a);
		b=num.toOctalString(num);
		System.out.println("B: "+b);
		c=num.toHexString(num);
		System.out.println("C: "+c);
		
	}
	
}