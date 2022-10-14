import java.util.Scanner;

// PROGRAM 12
public class FillMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = Integer.parseInt(sc.nextLine());
		char[][] matrix = new char[size][size];
		System.out.print("First Character: ");
		char first = sc.nextLine().charAt(0);
		System.out.print("Second Character: ");
		char second = sc.nextLine().charAt(0);
		System.out.print("Third Character: ");
		char third = sc.nextLine().charAt(0);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j || i + j == size - 1) {
					matrix[i][j] = third;
				} else if (i < j && i + j < size - 1 || i > j && i + j > size - 1) {
					matrix[i][j] = first;
				} else {
					matrix[i][j] = second;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
