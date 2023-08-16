package level3;


	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	public class FindDuplicates {

	    public static List<Integer> findDuplicates(int[] arr) {
	        Map<Integer, Integer> frequency = new HashMap<>();
	        List<Integer> duplicates = new ArrayList<>();

	        for (int element : arr) {
	            if (frequency.containsKey(element)) {
	                frequency.put(element, frequency.get(element) + 1);
	                if (frequency.get(element) == 2) {
	                    duplicates.add(element);
	                }
	            } else {
	                frequency.put(element, 1);
	            }
	        }

	        return duplicates;
	    }

	    public static void main(String[] args) {
	        int[] inputArray = {1, 2, 3, 4, 3, 5, 6, 7, 8, 7, 9};
	        List<Integer> result = findDuplicates(inputArray);
	        System.out.println("Duplicate elements: " + result);
	    }
	}


