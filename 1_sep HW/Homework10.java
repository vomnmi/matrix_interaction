public class Homework10 {
	public static void main(String args[]) {

		int [][] matrix = {{1, 2, 3, 4},
                    		{4, 5, 6, 7},
                    		{7, 8, 9, 3},
                    		{1, 2, 3, 4}};

        int sum = 0;           		

		  for(int i = 0; i < matrix.length; ++i) {
		  	for (int j = 0; j < matrix.length; ++j) {
		  		if(i + j >= matrix.length) {
		  			sum += matrix[i][j];
		  		}
		  	}
		}
			 	System.out.println(sum);
	}
}	