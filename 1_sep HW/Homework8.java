public class Homework8 {
	public static void main(String args[]) {

		int [][] matrix = {{1, 2, 3, 4},
                    		{4, 5, 6, 7},
                    		{7, 8, 9, 3},
                    		{1, 2, 3, 4}};

        int sum = 0;           		

		  for(int i = 0; i < matrix.length; ++i) {
		  	for (int j = (matrix.length - 1); j > i; --j) {

		  		sum += matrix[i][j];
		  	}
		}
			 	System.out.println(sum);
	}
}	
       