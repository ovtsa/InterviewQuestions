public class RTSLabs {
	
	/** Q1 - prints the number of entries in an array above
	 * and below a set target.
	 * 
	 * @param arr - the array of integers to be examined
	 * @param target - the cutoff value to be compared to arr
	 */
	public static void arrayAboveBelow(int[] arr, int target) {
		// if arr[i] == target, I will count it as "above."
		int below = 0;
		int above = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < target) below++;
			else above++;
		}
		System.out.printf("above: %d, below: %d\n", above, below);
	}

	/** Main method
	 *
	 * @param args - command line arguments (unused)
	 */
	public static void main(String[] args) {
		arrayAboveBelow(new int[]{1, 5, 2, 1, 10}, 6);
	}
}

