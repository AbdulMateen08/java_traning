package javatraning;

public class Traning{
	
	
	int add(int x,int y) {
		return x+y;
		
		
	}
	int add(int x,int y,int z) {
		return x+y+z;
	}
	static void display1() {
		System.out.println("hello world");
	}
	  static void display1() {
		System.out.println("hooo");
		System.out.println("jfkd");
	}
	
	/*
	 * static int add (int x,int y, int z) { return x+y+z; }
	 */
	
	public static void main(String  Args[]) {
		
		
		Traning c1=new Traning();
		int c=c1.add(2,5);
		int a=c1.add(34,5,2);
		display1();
		
		
		System.out.println(c); 
		System.out.println(a);
	}
}

