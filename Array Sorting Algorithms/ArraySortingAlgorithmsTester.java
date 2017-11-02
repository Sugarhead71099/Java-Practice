public class ArraySortingAlgorithmsTester {
	public static void main(String[] args) 
	{
		int[] values = {-3, -1, 4, 6, 11, 16, 22, 42, 50, 51, 61, 75, 80, 89, 203, 514, 719, 1012};
		int[] needsSorting1 = {100, 78, 76, 75, 45, 34, 30, 29, 25, 11, 8, 6, -3, -9};
		int[] needsSorting2 = {3, 6, 34, 2, 11, 15, -3, 0, 8, 4, 9, 10, -5, -71, 71, 27, 54, 1, 11, 111};
		int[] needsSorting3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		System.out.println("3 tests for linear search:");
		System.out.print((ArraySortingAlgorithms.linearSearch(values, 42) == 7) + ", "); 
		System.out.print((ArraySortingAlgorithms.linearSearch(values, -1)==1) + ", ");
		System.out.print(ArraySortingAlgorithms.linearSearch(values, 53)==-1);//53 is not in the array, so linearSearch should return -1
		System.out.println();
		
		System.out.println("3 tests for binary search:");
		System.out.print((ArraySortingAlgorithms.binarySearch(values, 203)==14) + ", ");
		System.out.print((ArraySortingAlgorithms.binarySearch(values, -3)==0) + ", ");
		System.out.print(ArraySortingAlgorithms.binarySearch(values, 1013)==-1); //1013 is not in the array, so linearSearch should return -1
		System.out.println();
		
		System.out.println("4 tests for bubble sort:");
		System.out.print(isSorted(ArraySortingAlgorithms.bubbleSort(values)) + ", "); //should return true
		System.out.print(isSorted(needsSorting1) + ", ");//should return false
		System.out.print(isSorted(ArraySortingAlgorithms.bubbleSort(needsSorting1)) + ", ");//should return true
		System.out.print(isSorted(needsSorting2) + ", ");//should return false
		System.out.print(isSorted(ArraySortingAlgorithms.bubbleSort(needsSorting2)) + ", ");//should return true
		System.out.print(isSorted(needsSorting3) + ", "); //should return false
		System.out.print(isSorted(ArraySortingAlgorithms.bubbleSort(needsSorting3)));//should return true
		System.out.println();
		
		int[] needsSorting4 = {100, 78, 76, 75, 45, 34, 30, 29, 25, 11, 8, 6, -3, -9};
		int[] needsSorting5 = {3, 6, 34, 2, 11, 15, -3, 0, 8, 4, 9, 10, -5, -71, 71, 27, 54, 1, 11, 111};
		int[] needsSorting6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		System.out.println("4 tests for selection sort:");
		System.out.print(isSorted(ArraySortingAlgorithms.selectionSort(values)) + ", "); //should return true
		System.out.print(isSorted(needsSorting4) + ", ");//should return false
		System.out.print(isSorted(ArraySortingAlgorithms.selectionSort(needsSorting4)) + ", ");//should return true
		System.out.print(isSorted(needsSorting5) + ", ");//should return false
		System.out.print(isSorted(ArraySortingAlgorithms.selectionSort(needsSorting5)) + ", ");//should return true
		System.out.print(isSorted(needsSorting6) + ", "); //should return false
		System.out.print(isSorted(ArraySortingAlgorithms.selectionSort(needsSorting6)));//should return true
		System.out.println();
		
		int[] needsSorting7 = {100, 78, 76, 75, 45, 34, 30, 29, 25, 11, 8, 6, -3, -9};
		int[] needsSorting8 = {3, 6, 34, 2, 11, 15, -3, 0, 8, 4, 9, 10, -5, -71, 71, 27, 54, 1, 11, 111};
		int[] needsSorting9 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		System.out.println("4 tests for insertion sort:");
		System.out.print(isSorted(ArraySortingAlgorithms.insertionSort(values)) + ", "); //should return true
		System.out.print(isSorted(needsSorting7) + ", ");//should return false
		System.out.print(isSorted(ArraySortingAlgorithms.insertionSort(needsSorting7)) + ", ");//should return true
		System.out.print(isSorted(needsSorting8) + ", ");//should return false
		System.out.print(isSorted(ArraySortingAlgorithms.insertionSort(needsSorting8)) + ", ");//should return true
		System.out.print(isSorted(needsSorting9) + ", "); //should return false
		System.out.print(isSorted(ArraySortingAlgorithms.insertionSort(needsSorting9)));//should return true
		System.out.println();
		
	}

	private static boolean isSorted(int[] values)
	{
		for(int i = 0; i < values.length - 1; i++)
		{
			if(values[i] > values[i + 1])
			{
				return false;
			}
		}
		
		return true;
	}
	
	//you can use this method to help if you are stuck and can't figure out what your mistake is
	private static String display(int[] values)
	{
		String result = "";
		for(int i = 0; i < values.length; i++)
		{
			result = result + "subscript[" + i + "] = " + values[i] + "\n";
		}
		
		return result;
	}
}
