import java.util.Arrays;

public class ArrayMethods {
	public static void main(String[] args) {
		int[] array = {8,24,17,17,25,32,-3,52,52,36,16,24,43};
		
		System.out.println(Arrays.asList(array));
		System.out.println("Braijon Glover\n");
		System.out.println("The array is:\n"+display(array));
		System.out.println("The sum is:"+sum(array));
		System.out.println("The average is:"+average(array));
		System.out.println("The max value is:"+max(array));
		System.out.println("The max index is:"+maxIndex(array));
		System.out.println("The min value is:"+min(array));
		System.out.println("The min index is:"+minIndex(array));
		System.out.println("The number of 24 occurrnces is:"+occurrences(array, 24));
		System.out.println("The number of repeated adjacent numbers is:"+repeats(array));
		System.out.println("The largest gap is at index:"+largestGap(array));
		//System.out.println(display(loadArray(5, 30)));
	}

	// 1
	public static String display(int[] values) {
		String valuesString = "";
		for(int i = 0; i < values.length; i++)
			valuesString += "subscript[" + i + "] = " + values[i] + "\n";
		return valuesString;
	}
	
	// 2
	public static int sum(int[] values) {
		int sum = 0;
		for(int i : values)
			sum += i;
		return sum;
	}
	
	// 3
	public static double average(int[] values) {
		return (double) sum(values) / values.length;
	}
	
	// 4
	public static void loadArray(int[] values, int times) {
		int random = (int) (Math.random() * values.length - 1);
		for(int i = 0; i <= times; i++)
			values[random] = random;
	}
	
	// 5
	public static int max(int[] values) {
		int currentMax = 0;
		for(int i : values)
			currentMax = i > currentMax ? i : currentMax;
		return currentMax;
	}
	
	// 6
	public static int maxIndex(int[] values) {
		int max = max(values), indexOfMax = 0;
		for(int i = 0; i < values.length; i++)
			indexOfMax = values[i] == max ? i : indexOfMax;
		return indexOfMax;
	}
	
	// 7
	public static int min(int[] values) {
		int currentMin = 0;
		for(int i : values)
			currentMin = i < currentMin ? i : currentMin;
		return currentMin;
	}

	// 8
	public static int minIndex(int[] values) {
		int min = min(values), indexOfMin = 0;
		for(int i = 0; i < values.length; i++)
			indexOfMin = values[i] == min ? i : indexOfMin;
		return indexOfMin;
	}
	
	// 9
	public static int occurrences(int[] values, int target) {
		int occurences = 0;
		for(int i = 0; i < values.length; i++)
			if(target == values[i])
				occurences++;
		return occurences;
	}
	
	// 10
	public static int repeats(int[] values) {
		int repeats = 0, pairsCounter = 0;
		for(int i = 0; i < values.length; i++) {
			for(int j = i + 1; j < values.length; j++) {
				if(values[i] == values[j]) {
					if(pairsCounter % 2 == 0) {
						repeats++;
					}
					pairsCounter++;
				}
			}
		}
		return repeats + 1;
	}
	
	// 11
	public static int largestGap(int[] values) {
		int currentGap = 0, difference = 0;
		for(int i = 0; i < values.length - 1; i++) {
			if(Math.abs(values[i] - values[i + 1]) > difference) {
				difference = Math.abs(values[i] - values[i + 1]);
				currentGap = i;
			}
		}
		return currentGap;
	}
	
	//12
	public static double totalMiles(Cars[] lot) {
		return lot[0].getMiles();
	}
	
	// 13
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
}

class Cars {
	public String getMake() {
		return "Ford";
	}
	public String getModel() {
		return "45EZ";
	}
	public int getYear() {
		return 2001;
	}
	public double getMiles() {
		return 10.0;
	}
	Cars[] car = {new Cars()};
	
}
