public class Homework6 {
	public static void main(String args[]) {

		int [][] matrix = {{1, 2, 3, 4},
                    		{4, 5, 6, 7},
                    		{7, 8, 9, 3},
                    		{6, 4, 8, 3}};

        int[] arr = new int [matrix.length * matrix[0].length];       		

        int count = 0;

		  for(int i = 0; i < matrix.length; ++i) {
		  	for (int j = 0; j < matrix[i].length; ++j) {

		  		arr[count++] = matrix[i][j];
		  	}
		}
			 	for(int i = 0; i < arr.length; ++i) {
			 		System.out.print(arr[i] + " ");
			 	}
	}
}	
       
