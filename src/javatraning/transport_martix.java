package javatraning;

public class transport_martix {

	public static void main(String[] args) {
		int mat[][]= {
				{1,4,7},
				{4,6,4},
				{5,6,3}
		};
		int result[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				result[i][j]=mat[j][i];
				
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(result[i][j] + " ");
				
			}
			System.out.println();
			
		}

	}

}
