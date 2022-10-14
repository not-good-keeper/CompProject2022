import java.util.Scanner;

// PROGRAM 21
public class WordPile {
	char ch[];
	int capacity;
	int top;

	WordPile(int cap) {
		capacity = cap;
		ch = new char[capacity];
		top = -1;
	}

	void pushChar(char c) {
		if (top == capacity - 1) {
			System.out.println("WordPile is full");
			return;
		}
		top++;
		ch[top] = c;
	}

	char popchar() {
		if (top == -1) {
			System.out.println("WordPile is empty");
			return '\\';
		}
		return ch[top--];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter capacity of WordPile: ");
		int cap = sc.nextInt();
		if (cap > 20) {
			System.out.println("Invalid capacity");
			return;
		}
		WordPile wp = new WordPile(cap);
		while (true) {
			System.out.println("1 - Push");
			System.out.println("2 - Pop");
			System.out.println("3 - Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.print("Enter character: ");
					char c = sc.next().charAt(0);
					wp.pushChar(c);
					break;
				case 2:
					System.out.println("Popped character: " + wp.popchar());
					break;
				case 3:
					return;
			}
		}
	}
}
