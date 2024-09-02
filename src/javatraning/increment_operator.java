package javatraning;

public class increment_operator {

	public static void main(String[] args) {
	
		        int i = 10;

		        // Using prefix increment operator
		        System.out.println("Initial value of i: " + i);
		        System.out.println("Using prefix increment (++i): " + ++i); // i is incremented before use
		        System.out.println("Value of i after prefix increment: " + i);

		        // Resetting i for postfix demonstration
		        i = 10;
		        System.out.println("\nReset value of i: " + i);
		        System.out.println("Using postfix increment (i++): " + i++); // i is used before increment
		        System.out.println("Value of i after postfix increment: " + i);
		    }
		

	}


