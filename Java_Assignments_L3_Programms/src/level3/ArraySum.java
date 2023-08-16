package level3;

public class ArraySum {
	
	    public static int calculateSum(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 10, 15, 20, 25};

	        int sum = calculateSum(array);

	        System.out.println("Sum of the elements in the array: " + sum);
	    }
	}


