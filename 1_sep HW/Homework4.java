public class Homework4 {
	public static void main(String args[]) {

		int [][] matrix = {{1, 2, 3, 4},
                    		{4, 5, 6, 7},
                    		{7, 8, 9, 3},
                    		{1, 2, 3, 4}};

		  for(int i = 0; i < matrix.length; ++i) {
		  	for (int j = 0; j < matrix[i].length; ++j) {
		  		if(i == j) {
		  			matrix[i][j] = 0;
		  		}
		  		if(i + j == (matrix.length - 1)) {
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
