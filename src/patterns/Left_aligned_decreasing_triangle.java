package patterns;

public class Left_aligned_decreasing_triangle {
	public static void main(String[] args) {
		int n = 4;

		for (int i = 1; i <= n; i++) {
			for(int j = 0;j<i;j++) {
				System.out.print("  ");
			}

			for (int k = n; k >= i; k--) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}
}