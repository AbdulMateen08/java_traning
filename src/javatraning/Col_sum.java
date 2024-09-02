package javatraning;

public class Col_sum {

	public static void main(String[] args) {
		int martix[][]= {
				{4,6,2},
				{5,6,4},
				{4,6,7}
		};
		
		for(int i=0;i<3;i++) {
			int sum=0;
			for(int j=0;j<3;j++) {
				sum+=martix[j][i];
				
			}
			System.out.println("colum sum is " + sum);
			
		}
			
	}



	}

