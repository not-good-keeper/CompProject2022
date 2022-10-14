import java.util.Scanner;

// PROGRAM 10
public class Derive extends B4se {
	int hc, lc;

	void Swap() {
		if (n1 < n2) {
			n1 = n1 + n2;
			n2 = n1 - n2;
			n1 = n1 - n2;
		}
	}

	void findHcf() {
		this.Swap();
		int x = n1;
		int y = n2;
		while (y != 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		this.hc = x;
	}

	void findLcm() {
		this.Swap();
		int x = n1;
		int y = n2;
		while (y != 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		this.lc = (n1 * n2) / x;
	}

	void show() {
		super.display();
		System.out.println("HCF: " + this.hc);
		System.out.println("LCM: " + this.lc);
	}

	public static void main(String[] args) {
		Derive d = new Derive();
		d.accept();
		d.findHcf();
		d.findLcm();
		d.show();
	}
}

class B4se {
	int n1, n2;

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n1: ");
		this.n1 = sc.nextInt();
		System.out.print("Enter the value of n2: ");
		this.n2 = sc.nextInt();
	}

	void display() {
		System.out.println("n1: " + this.n1);
		System.out.println("n2: " + this.n2);
	}
}
