import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static boolean doesNumbersAddUpToK(int[] nums, int K) {
		Set<Integer> numsSet = new HashSet<>();
		for(int num : nums) {
			if (numsSet.contains(num)) {
				return true;
			}
			
			numsSet.add(K - num);
		}
		return false;
	}
	
	public static void main(String[] args) {
		// Case 1: returns true
		System.out.println(doesNumbersAddUpToK(new int[]{ 10, 15, 3, 7 }, 17));
		    
	  // Case 2: return false
	  System.out.println(doesNumbersAddUpToK(new int[]{ 10, 15, 3, 8 }, 17));
	}
}
