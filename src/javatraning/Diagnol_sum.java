package javatraning;

public class Diagnol_sum {

	public static void main(String[] args) {
		int matrix[][]= {
				{3,5,3},
				{4,6,2},
				{3,7,2}
		};
		int sumr=0;
		int suml=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					sumr+=matrix[i][j];
				}
				if(i+j==2) {
					suml+=matrix[i][j];
				}
				
			}
		}
		System.out.println("The right side sum is " + sumr);
		System.out.println("The left side sum is " + suml);
	}

}
