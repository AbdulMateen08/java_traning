package javatraning;
import java.util.*;
public class swaping_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before swaping the numbers are " + x + " , " + y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swaping numbers are");
		System.out.println("First number " + x);
		System.out.println("Second number " + y);

	}

}
