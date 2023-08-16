package level3;


	import java.util.Arrays;
	public class InsertElementatEnd {

	

	    public static int[] insertAtEnd(int[] arr, int element) {
	        int[] newArray = Arrays.copyOf(arr, arr.length + 1);
	        newArray[newArray.length - 1] = element;
	        return newArray;
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 10, 15, 20, 25};
	        int newElement = 30;

	        System.out.println("Original array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

	        int[] newArray = insertAtEnd(array, newElement);

	        System.out.println("\nArray after inserting " + newElement + " at the end:");
	        for (int num : newArray) {
	            System.out.print(num + " ");
	        }
	    }
	}

