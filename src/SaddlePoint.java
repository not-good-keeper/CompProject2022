import java.util.Scanner;

// PROGRAM 13
public class SaddlePoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = Integer.parseInt(sc.nextLine());
		int[][] matrix = new int[size][size];
		System.out.println("Enter elements: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		// Find saddle point (maximum in column and minimum in row)
		int saddlePoint = 0;
		boolean found = false;
		for (int i = 0; i < size; i++) {
			int min = matrix[i][0];
			int minIndex = 0;
			for (int j = 0; j < size; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					minIndex = j;
				}
			}
			int max = matrix[0][minIndex];
			for (int j = 0; j < size; j++) {
				if (matrix[j][minIndex] > max) {
					max = matrix[j][minIndex];
				}
			}
			if (min == max) {
				saddlePoint = min;
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No saddle point found");
		} else {
			System.out.println("Saddle point = " + saddlePoint);
		}
		for (int i = 1; i < size; i++) {
			int key = matrix[i][i];
			int j = i - 1;
			while (j >= 0 && matrix[j][j] > key) {
				matrix[j + 1][j + 1] = matrix[j][j];
				j--;
			}
			matrix[j + 1][j + 1] = key;
		}
		System.out.println("Matrix after sorting the Principal diagonal: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
