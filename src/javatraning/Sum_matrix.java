package javatraning;

public class Sum_matrix {

	public static void main(String[] args) {
		int matrix[][]= {
				{2,4,5},
				{5,6,2},
				{6,8,3}
		};
		int sum=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum+=matrix[i][j];
				}
		}
		System.out.println(sum);
	}

}
