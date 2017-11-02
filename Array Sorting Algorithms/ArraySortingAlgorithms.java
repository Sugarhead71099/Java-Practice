import java.util.Arrays;
import java.util.Random;

public class ArraySortingAlgorithms {
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		int randomArr[] = new int[random.nextInt(20) + 1];
		createRandomArr(randomArr);
		System.out.println("Random array:\t");
		for(int i : randomArr)
			System.out.print(i + " ");
		
		// Insert call on desired method(s) here
		int randomNumber = random.nextInt(20) + 1;
		bubbleSort(randomArr);
		System.out.println("\n\n" + randomNumber + " is found at index: \n\t" + binarySearch(randomArr, randomNumber) + "\n\n");

		System.out.println("Sorted array:\t");
		for(int i : randomArr)
			System.out.print(i + " ");
	}
	
	
	public static int linearSearch(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++)
			if(arr[i] == target)
				return i;
		return -1;
	}
	
	public static void createRandomArr(int[] randomArr) {
		for(int i = 0; i < randomArr.length; i++)
			randomArr[i] = random.nextInt(20) + 1;
	}
	
	// This takes a specific value and efficiently searches the given array for the index of it
	public static int binarySearch(int[] arr, int value) {
		int min = 0, max = arr.length - 1, middle = 0;
		while(min <= max) {			// run until min and max values meet (make sure they don't cross)
			middle = min + (max - min) / 2;
			if(arr[middle] == value)			// if middle value = wanted value - stop and return
				return middle;
			else if(arr[middle] < value)
				min = middle + 1;
			else if(arr[middle] > value)
				max = middle - 1;
		}
		return -1;
	}
	
	// This checks values 1-2, 3-4, 5-6, etc... and swaps them depending on which is smaller/larger
		// This runs until no swaps have occurred, meaning that the array is in the proper sorted order
	public static int[] bubbleSort(int[] array) {	
		boolean swapped = true;			// set swapped to true to begin first pass
		int j = 0;
		int temp;			// holding variable
		while(swapped) {
			swapped = false;			// set flag to false awaiting a possible swap
			j++;
			for(int i = 0; i < array.length - j; i++) {
				if(array[i] > array[i + 1]) {			// change to > for ascending sort
					temp = array[i];			// swap elements
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;			// shows a swap has occured
				}
			}
		}
		return array;
	}
	
	/*public static void selectionSort(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length; i++) {
			temp = arr[i];
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < temp) {
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}*/
	
	public static int[] selectionSort(int[] arr) {
	    int min;
	    for (int i = 0; i < arr.length; i++) {
	        min = i;
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[j] < arr[min]) {
	                min = j;
	
	            }
	        }
	        if (min != i) {
	            final int temp = arr[i];
	            arr[i] = arr[min];
	            arr[min] = temp;
	        }
	    }
	    return arr;
	}
	
	public static int[] insertionSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
	}
	
}
