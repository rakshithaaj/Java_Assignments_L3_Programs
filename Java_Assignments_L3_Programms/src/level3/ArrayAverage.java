package level3;

public class ArrayAverage {
	
	

	    public static double calculateAverage(int[] arr) {
	        if (arr.length == 0) {
	            return 0; // Return 0 for an empty array to avoid division by zero
	        }

	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }

	        return (double) sum / arr.length;
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 10, 15, 20, 25};

	        double average = calculateAverage(array);

	        System.out.println("Average of the array: " + average);
	    }
	}


