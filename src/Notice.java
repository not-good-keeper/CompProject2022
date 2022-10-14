import java.util.Scanner;

// PROGRAM 23
public class Notice {
	int[] DQ;
	int MaxSize;
	int front = -1;
	int rear = -1;

	Notice(int size) {
		this.MaxSize = size;
		this.DQ = new int[size];
	}

	void JoinRear(int ele) {
		if (this.rear + 1 == this.MaxSize) {
			System.out.println("The line is overflowing");
			return;
		}
		if (this.front == -1) {
			this.front = 0;
			this.rear = 0;
			this.DQ[0] = ele;
		} else {
			this.DQ[this.rear++] = ele;
		}
	}

	void JoinFront(int ele) {
		if (this.front == 0) {
			System.out.println("The line is overflowing");
			return;
		}
		if (this.front == -1) {
			this.front = 0;
			this.rear = 0;
			this.DQ[0] = ele;
		} else {
			this.DQ[--this.front] = ele;
		}
	}

	void FrontDelete() {
		if (this.front == -1) {
			System.out.println("The line is empty");
			return;
		}
		if (this.front > this.rear) {
			this.front = -1;
			this.rear = -1;
		}
	}

	void RearDelete() {
		if (this.front == -1) {
			System.out.println("The line is empty");
			return;
		}
		if (this.front > this.rear) {
			this.front = -1;
			this.rear = -1;
		}
	}

	void PrintLine() {
		if (this.front == -1) {
			System.out.println("The line is empty");
			return;
		}
		for (int i = this.front; i <= this.rear; i++) {
			System.out.print(this.DQ[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of line: ");
		int size = sc.nextInt();
		Notice n = new Notice(size);
		while (true) {
			System.out.println("1 - Join Rear");
			System.out.println("2 - Join Front");
			System.out.println("3 - Front Delete");
			System.out.println("4 - Rear Delete");
			System.out.println("5 - Print Line");
			System.out.println("6 - Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.print("Enter value: ");
					int v1 = sc.nextInt();
					n.JoinRear(v1);
					break;
				case 2:
					System.out.print("Enter value: ");
					int v2 = sc.nextInt();
					n.JoinFront(v2);
					break;
				case 3:
					n.FrontDelete();
					break;
				case 4:
					n.RearDelete();
					break;
				case 5:
					n.PrintLine();
					break;
				case 6:
					return;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}
