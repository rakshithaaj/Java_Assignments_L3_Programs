package level3;

public class ReverseArray {
	
	    public static void reverse(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;

	        while (start < end) {
	            // Swap elements at start and end indices
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;

	            // Move indices towards the center
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 10, 15, 20, 25};

	        System.out.println("Original array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

	        reverse(array);

	        System.out.println("\nReversed array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }
	


}
