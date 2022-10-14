import java.util.Scanner;

// PROGRAM 19
public class SquareMatrix {
	public static void main(String[] args) {
		System.out.print("Enter order of matrix: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 3 || n > 10) {
			System.out.println("Invalid order");
			return;
		}
		int[][] matrix = new int[n][n];
		System.out.println("Enter elements of matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
				if (matrix[i][j] < 0) {
					System.out.println("Invalid element");
					return;
				}
			}
		}
		// Sort non boundary elements in ascending order
		int s = (n - 2) * (n - 2);
		int[] nb = new int[s];
		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				nb[(i - 1) * (n - 2) + j - 1] = matrix[i][j];
			}
		}
		for (int i = 1; i < s; i++) {
			int j = i;
			while (j > 0 && nb[j] < nb[j - 1]) {
				int temp = nb[j];
				nb[j] = nb[j - 1];
				nb[j - 1] = temp;
				j--;
			}
		}
		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				matrix[i][j] = nb[(i - 1) * (n - 2) + j - 1];
			}
		}
		System.out.println("Rearranged matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Diagonal Elements: ");
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.print(matrix[i][j] + " ");
					sum += matrix[i][j];
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("Sum of diagonal elements: " + sum);
	}
}
