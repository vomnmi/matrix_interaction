public class Homework7 {

	public static void main(String args[]) {

		int [][] matrix = {{1, 2, 3, 4},
                    		{4, 5, 6, 7},
                    		{7, 8, 9, 3},
                    		{6, 4, 8, 3}};

          int counter = (matrix.length - 1);          		

		  for(int i = 0; i < matrix.length; ++i) {
		  	for (int j = 0; j < matrix[i].length; ++j) {
		  		if(i == j) {
		  			swap(i,j,counter,matrix);
		  			--counter;
		  		}
		  	}
		}
		for(int i = 0; i < matrix.length; ++i) {
			for(int j = 0; j < matrix[i].length; ++j) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	private static void swap(int i,int j,int counter,int[][] matrix) {
				int tmp = matrix[i][j];
		  		matrix[i][j] = matrix[i][counter];
		  		matrix[i][counter] = tmp;
	}
}