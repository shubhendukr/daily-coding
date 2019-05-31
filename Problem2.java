package dailyCodingProblem;

/**
 * Given an array of integers, return a new array such that each element 
 * at index i of the new array is the product of all the numbers in the original array except the one at i.
 * 
 * If our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6]
 * @author shubhendukumar
 *
 */

public class Problem2 {
	static final double EPS = 1e-9;
	
	public static void calProdcutArray(int[] a) {
		int temp = 1, n = a.length;
		int prod[] = new int[n];
		
		for(int i=0; i<n; i++) {
			prod[i] = 1;
		}
		
		for(int i=0; i<n; i++) {
			prod[i] = temp;
			temp *= a[i];
		}
		
		temp = 1;
		for(int i=n-1; i>=0; i--) {
			prod[i] *= temp;
			temp *= a[i];
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(prod[i]+" ");
		}
	}
	
	/**
	 * x = a * b * c * d
     * log(x) = log(a * b * c * d)
	 * log(x) = log(a) + log(b) + log(c) + log(d)
     * x = antilog(log(a) + log(b) + log(c) + log(d))
     * x = 10 ^ (log(a) + log(b) + log(c) + log(d))
	 */
	public static void calcProdcutArrayWithLog(int[] a) {
		double sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += Math.log10(a[i]);
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print((int)(EPS + Math.pow(10.00, sum - Math.log10(a[i])))+" ");
		}
	}
	
	public static void main(String[] args) {
		int a[] = {10, 3, 5, 6, 2};
		System.out.println("The product array is: ");
		calProdcutArray(a);
		// calcProdcutArrayWithLog(a);
		
	}
}
