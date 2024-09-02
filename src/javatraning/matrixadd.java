package javatraning;
import java.util.*;

public class matrixadd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row value ");
		int row=sc.nextInt();
		System.out.println("enter the colume value ");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		int arr2[][]=new int[row][col];
		int res[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("enter the arrays next elemnt");
				arr[i][j]=sc.nextInt();
				System.out.println("enter the sec arrays next elemnt");
				
				arr2[i][j]=sc.nextInt();
				res[i][j]=arr[i][j]+arr2[i][j];
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(res[i][j]+" ");
				
			}
			System.out.println();
		}
		
		

	}

}
