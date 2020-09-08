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

	/** Q2 - takes a string as input and "rotates" it by a set
	 * amount. "Rotating" a string is moving a set number of characters
	 * from the end back to the beginning of the string.
	 *
	 * @param s - the string to be rotated
	 * @param r - the number of characters to be rotated
	 * @return - the string post-rotation
	 */
	public static String rotateString(String s, int r) {
		/* newFirstPiece = the substring from the END of String s that
		has been moved to the beginning. */
		String newFirstPiece = s.substring(s.length() - r % s.length(), s.length());
		/* newSecondPiece = the substring from the BEGINNING of String s that
		has now been pushed to the end. */
		String newSecondPiece = s.substring(0, s.length() - r % s.length());
		return newFirstPiece + newSecondPiece;
	}

	/** Main method
	 *
	 * @param args - command line arguments (unused)
	 */
	public static void main(String[] args) {
		arrayAboveBelow(new int[]{1, 5, 2, 1, 10}, 6);
		System.out.println(rotateString("MyString", 10));
	}
}

