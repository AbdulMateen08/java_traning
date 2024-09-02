package javatraning;

public class matrixproduct {

	public static void main(String[] args) {
		int row=3;
		int col=3;
		int matr1[][]=
			{
					{2,4,5},
					{3,4,5},
					{4,6,7},
			};
		int matr2[][]= 
			{
					{4,6,7},
					{1,5,6},
					{4,9,7},
					
			};
		int result[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0;k<3;k++) {
					result[i][j]+=matr1[i][k]*matr2[k][j];
				}
				
				
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(result[i][j] + " ");			
				}
			System.out.println();
		}
		
	}

}
