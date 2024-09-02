package javatraning;
import java.util.*;

public class ternary_operator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max;
		
		        
		        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		 
		        
		        System.out.println("Maximum number among " + a
		                           + ", " + b + " and " + c + " is "
		                           + max);
		    }
		

	}


