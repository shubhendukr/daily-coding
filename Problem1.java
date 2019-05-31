package dailyCodingProblem;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17
 * @author shubhendukumar
 *
 */

public class Problem1 {
	public static boolean containsPairWithSum(int[] arr, int k) {
		Set<Integer> set = new HashSet<>();
		for(int a: arr) {
			if(set.contains(a)) {
				return true;
			}
			set.add(k - a);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 15, 3, 7};
		int k = 20;
		System.out.println(containsPairWithSum(arr, k));
	}
}
