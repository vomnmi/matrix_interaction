public class Homework1 {
	public static void main(String args[]) {

		int [][] matrix = {{1, 2, 3},
                    		{4, 34, 6},
                    		{7, 8, 9},
                    		{10, 11, 12}};
		
		int max = matrix[0][0];
		  for(int i = 0; i < matrix.length; ++i) {
		  	for (int j = 0; j < matrix[i].length; ++j) {
		  		if(matrix[i][j] > max) {
		  			max = matrix[i][j];
		  		}
		  	}
		 }
		 System.out.println("The maximum value is " + max);
    }
        
}
