public class ArrayMethods2D {
	public static void main(String[] args) {
		fillTo9();
		System.out.println("");
		int arr[][] = randomInsertion();
		print2dArr(arr);
		System.out.println("");
		greaterThan75(arr);
		System.out.println("\n");
		equals1(arr);
	}
	
	// Declare and initialize a 3x3 tow--dimensional array that has the numbers 1--9
	public static void fillTo9() {
		int counter = 0;
		int arr[][] = new int[3][3];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				counter++;
				arr[i][j] = counter;
			}
		}
		print2dArr(arr);
	}
	
	// Declare and initialize a 4x10 two--dimensional array. Then set each element to some random whole number between 50 and 100 (inclusive)
	public static int[][] randomInsertion() {
		int arr[][] = new int[4][10];
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[i].length; j++)
				arr[i][j] = (int) ((Math.random() * 100) + 50);
		return arr;
	}

	// On the array you declared in #2, write the code to count and print the number of elements that are greater than 75
	public static void greaterThan75(int[][] arr) {
		for(int[] arrRow : arr)
			for(int i : arrRow)
				if(i > 75)
					System.out.print(i + " ");
	}
	
	//
	public static void equals1(int[][] arr) {
		int[][] arr2 = new int[arr.length][arr[0].length];
		int counter = 9;
		for(int i = 0; i < arr.length; i++) {
			arr2[i][i] = 1;
			arr2[i][counter] = 1;
			counter--;
		}
		print2dArr(arr2);
	}

	public static void print2dArr(int[][] arr) {
		for(int[] rowArr : arr) {
			for(int i : rowArr)
				System.out.print(i + " ");
			System.out.println("");
		}
	}
}
