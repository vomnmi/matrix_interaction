public class Homework3 {
	public static void main(String args[]) {

		int [][] matrix = {{1, 2, 3},
                    		{4, 55, 6},
                    		{7, 8, -8},
                    		{10, 11, 12}};
		

		  for(int i = 0; i < matrix.length; ++i) {
		  	for (int j = 0; j < matrix[i].length; ++j) {
		  		if(matrix[i][j] > 0 && matrix[i][j] % 2 == 0) {
		  			matrix[i][j] = 0;
		  		}
		  	}
		 }

		 for(int i = 0; i < matrix.length; ++i) {
		  	for (int j = 0; j < matrix[i].length; ++j) {
		  		System.out.print(matrix[i][j] + " ");
		  	}
		  	System.out.println();
		 }

    }
        
}
