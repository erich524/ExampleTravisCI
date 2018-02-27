
public class Homework1 {
	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3 };

		System.out.println(findLast(a, 3));

	}

	public static int findLast(int[] x, int y) {
		for (int i = x.length - 1; i > 0; i--) {
			if (x[i] = y) {
				return i;
			}
		}
		return -1;

	}
}
