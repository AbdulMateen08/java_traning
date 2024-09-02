package javatraning;
import java.util.Scanner;
public class divisiblity_check {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    
    		String result = (number % 2 == 0 && number % 3 == 0) 
 					? "The number " + number + " is divisible by both 2 and 3."
 					: "The number " + number + " is not divisible by both 2 and 3.";
		    System.out.println(result);
		        
		    }
		
	}


