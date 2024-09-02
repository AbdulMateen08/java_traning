package javatraning;
import java.util.*;
public class calculate_float {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values ");
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		
		System.out.println("The Sum of two float values is  " + (x+y));
		System.out.println("The Difference of two float values is  " + (x-y));
		System.out.println("The Product of two float values is  " + (x*y));
		System.out.println("The Quotient of two float values is  " + (x/y));

	}

}
