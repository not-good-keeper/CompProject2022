import java.util.Scanner;

// PROGRAM 16
public class Collection {
	int len;
	int[] arr;

	Collection() {
	}

	Collection(int len) {
		this.len = len;
		this.arr = new int[len];
	}

	void inparr() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < this.len; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			this.arr[i] = sc.nextInt();
		}
	}

	Collection common(Collection c) {
		Collection c1 = new Collection();
		int count = 0;
		for (int i = 0; i < this.len; i++) {
			for (int j = 0; j < c.len; j++) {
				if (this.arr[i] == c.arr[j]) {
					count++;
				}
			}
		}
		c1.len = count;
		c1.arr = new int[count];
		count = 0;
		for (int i = 0; i < this.len; i++) {
			for (int j = 0; j < c.len; j++) {
				if (this.arr[i] == c.arr[j]) {
					c1.arr[count] = this.arr[i];
					count++;
				}
			}
		}
		return c1;
	}

	void arrange() {
		for (int i = 1; i < this.len; i++) {
			int j = i - 1;
			int temp = this.arr[i];
			while (j >= 0 && this.arr[j] > temp) {
				this.arr[j + 1] = this.arr[j];
				j--;
			}
			this.arr[j + 1] = temp;
		}
	}

	void display() {
		for (int i = 0; i < this.len; i++) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the first array: ");
		int len1 = sc.nextInt();
		Collection c1 = new Collection(len1);
		c1.inparr();
		System.out.print("Enter the length of the second array: ");
		int len2 = sc.nextInt();
		Collection c2 = new Collection(len2);
		c2.inparr();
		Collection c3 = c1.common(c2);
		c3.arrange();
		System.out.println("Common");
		c3.display();
	}
}
