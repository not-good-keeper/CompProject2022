import java.util.Scanner;

// PROGRAM 17
public class Sort {
	int[] ar;
	int item;

	void inpdata() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		if (n > 50) {
			System.out.println("Array size cannot be greater than 50");
			System.exit(0);
		}
		this.ar = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if (num == this.ar[j]) {
					System.out.println("Duplicate element found");
					System.exit(0);
				}
			}
			this.ar[i] = num;
		}
	}

	void bubsort() {
		for (int i = 0; i < this.ar.length; i++) {
			for (int j = 0; j < this.ar.length - i - 1; j++) {
				if (this.ar[j] > this.ar[j + 1]) {
					int temp = this.ar[j];
					this.ar[j] = this.ar[j + 1];
					this.ar[j + 1] = temp;
				}
			}
		}
		// Print
		System.out.println("Sorted array: ");
		for (int i = 0; i < this.ar.length; i++) {
			System.out.print(this.ar[i] + " ");
		}
		System.out.println();
	}

	void binsearch() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element to be searched: ");
		this.item = sc.nextInt();
		int beg = 0;
		int end = this.ar.length - 1;
		int mid = (beg + end) / 2;
		boolean found = false;
		while (beg <= end) {
			if (this.ar[mid] == this.item) {
				System.out.println("Element found at position " + (mid + 1));
				found = true;
				break;
			} else if (this.ar[mid] < this.item) {
				beg = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (beg + end) / 2;
		}
		if (!found) {
			System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {
		Sort s = new Sort();
		s.inpdata();
		s.bubsort();
		s.binsearch();
	}
}
