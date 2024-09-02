package javatraning;
import java.util.*;
class Employee{
	public int id;
	public String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
		}
}
public class main {
	public static void  main(String[] args)
	{
		Employee em1=new Employee(23, "A");
		Employee em2=new Employee(34,"B");
		
		System.out.println(" Id " + em1.id + " Name "+ em1.name);
		System.out.println(" Id " + em2.id + " Name "+ em2.name);
		
	


}
}
