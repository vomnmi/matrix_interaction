public class Homework2 {
	public static void main(String args[]) {

		int [][] matrix = {{1, 2, 3},
                    		{4, 55, 6},
                    		{7, 8, -9},
                    		{10, 11, 12}};
		
		int min = matrix[0][0];
		int rowIndex = 0;
		int columnIndex = 0;

		  for(int i = 0; i < matrix.length; ++i) {
		  	for (int j = 0; j < matrix[i].length; ++j) {
		  		if(matrix[i][j] < min) {
		  			min = matrix[i][j];
		  			rowIndex = i;
		  			columnIndex = j;
		  		}
		  	}
		 }

		 System.out.println("Row " + rowIndex + " Column " + columnIndex);
    }
        
}
