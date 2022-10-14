import java.util.Scanner;

// PROGRAM 24
public class CQueue {
	int[] ele;
	int cap;
	int front;
	int rear;

	CQueue(int max) {
		this.cap = max;
		this.ele = new int[max];
		this.front = -1;
		this.rear = -1;
	}

	void insert(int v) {
		if (front == 0 && rear == cap - 1 || front == rear + 1) {
			System.out.println("Full from rear");
			return;
		}
		if (front == -1) {
			front = 0;
			rear = 0;
		} else if (rear == cap - 1) {
			rear = 0;
		} else {
			rear++;
		}
		ele[rear] = v;
	}

	int delete() {
		if (front == -1) {
			return -999;
		}
		int v = ele[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (front == cap - 1) {
			front = 0;
		} else {
			front++;
		}
		return v;
	}

	void display() {
		if (front == -1) {
			System.out.println("Empty");
			return;
		}
		if (front <= rear) {
			for (int i = front; i <= rear; i++) {
				System.out.print(ele[i] + " ");
			}
		} else {
			for (int i = front; i < cap; i++) {
				System.out.print(ele[i] + " ");
			}
			for (int i = 0; i <= rear; i++) {
				System.out.print(ele[i] + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		CQueue q = new CQueue(n);
		while (true) {
			System.out.println("1 - Insert");
			System.out.println("2 - Delete");
			System.out.println("3 - Display");
			System.out.println("4 - Exit");
			System.out.print("Enter choice: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter value: ");
				int v = sc.nextInt();
				q.insert(v);
				break;
			case 2:
				int d = q.delete();
				if (d == -999) {
					System.out.println("Empty");
				} else {
					System.out.println("Deleted: " + d);
				}
				break;
			case 3:
				q.display();
				break;
			case 4:
				return;
			}
		}
	}
}
