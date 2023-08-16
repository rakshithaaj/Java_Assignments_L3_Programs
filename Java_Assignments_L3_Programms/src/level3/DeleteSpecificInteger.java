package level3;

	import java.util.Arrays;

	public class DeleteSpecificInteger {

	    public static int[] deleteElement(int[] arr, int elementToDelete) {
	        int indexToDelete = -1;

	        // Find the index of the element to delete
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == elementToDelete) {
	                indexToDelete = i;
	                break;
	            }
	        }

	        if (indexToDelete == -1) {
	            return arr; // Element not found, return the original array
	        }

	        // Create a new array with one less element
	        int[] newArray = new int[arr.length - 1];

	        // Copy elements before the deleted element
	        System.arraycopy(arr, 0, newArray, 0, indexToDelete);

	        // Copy elements after the deleted element
	        System.arraycopy(arr, indexToDelete + 1, newArray, indexToDelete, newArray.length - indexToDelete);

	        return newArray;
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 10, 15, 20, 25};
	        int elementToDelete = 15;

	        System.out.println("Original array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

	        int[] newArray = deleteElement(array, elementToDelete);

	        System.out.println("\nArray after deleting " + elementToDelete + ":");
	        for (int num : newArray) {
	            System.out.print(num + " ");
	        }
	    }
	}


