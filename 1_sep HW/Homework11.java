public class Homework11 {
	public static void main(String args[]) {

		int arr[] = {6, 1, 1, 2, 2};
		int num = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = (i + 1); j < arr.length; j++) {
				if (arr[i] != arr[j]) {
					num = arr[i];
					}
					
					
			}
		}
		System.out.print(num);
	}
}