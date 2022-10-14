import java.util.Scanner;

// PROGRAM 22
public class Link {
	int[] lnk;
	int max;
	int begin = -1;
	int end = -1;

	Link(int mm) {
		this.max = mm;
		this.lnk = new int[mm];
	}

	void addlink(int v) {
		if (this.end + 1 == this.max) {
			System.out.println("OUT OF SIZE");
			return;
		}
		if (this.begin == -1) {
			this.begin = 0;
			this.end = 0;
			this.lnk[0] = v;
		} else {
			this.lnk[this.end++] = v;
		}
	}

	int delink() {
		if (this.begin == -1) {
			System.out.println("EMPTY");
			return -99;
		}
		int v = this.lnk[this.begin++];
		if (this.begin > this.end) {
			this.begin = -1;
			this.end = -1;
		}
		return v;
	}

	void display() {
		if (this.begin == -1) {
			System.out.println("EMPTY");
			return;
		}
		for (int i = this.begin; i <= this.end; i++) {
			System.out.print(this.lnk[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Link: ");
		int size = sc.nextInt();
		Link l = new Link(size);
		while (true) {
			System.out.println("1 - Enqueue");
			System.out.println("2 - Dequeue");
			System.out.println("3 - Display");
			System.out.println("4 - Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.print("Enter value: ");
					int v = sc.nextInt();
					l.addlink(v);
					break;
				case 2:
					System.out.println("Dequeued value: " + l.delink());
					break;
				case 3:
					l.display();
					break;
				case 4:
					return;
			}
		}
	}
}
