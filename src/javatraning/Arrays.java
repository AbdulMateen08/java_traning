package javatraning;

public class Arrays {

	public static void main(String[] args) {
		int row=4;
		int col=4;
		int val=1;
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=val;
				val++;
			}
		}
		System.out.println("the array is ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
