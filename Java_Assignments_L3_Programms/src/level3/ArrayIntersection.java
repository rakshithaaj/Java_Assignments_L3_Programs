package level3;


	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	public class ArrayIntersection {

	    public static int[] findIntersection(int[] arr1, int[] arr2) {
	        Set<Integer> set = new HashSet<>();
	        List<Integer> intersectionList = new ArrayList<>();

	        for (int num : arr1) {
	            set.add(num);
	        }

	        for (int num : arr2) {
	            if (set.contains(num)) {
	                intersectionList.add(num);
	                set.remove(num); // Remove to avoid duplicate entries
	            }
	        }

	        int[] intersectionArray = new int[intersectionList.size()];
	        for (int i = 0; i < intersectionList.size(); i++) {
	            intersectionArray[i] = intersectionList.get(i);
	        }

	        return intersectionArray;
	    }

	    public static void main(String[] args) {
	        int[] array1 = {1, 2, 4, 5, 7};
	        int[] array2 = {2, 3, 5, 6};

	        int[] intersection = findIntersection(array1, array2);

	        System.out.println("Intersection of the two arrays:");
	        for (int num : intersection) {
	            System.out.print(num + " ");
	        }
	    }
	}



