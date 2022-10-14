import java.util.Scanner;

// PROGRAM 8
public class Distance extends P0int {
	double midx, midy;

	void readPoint() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x1: ");
		x1 = sc.nextDouble();
		System.out.print("Enter the value of x2: ");
		x2 = sc.nextDouble();
		System.out.print("Enter the value of y1: ");
		y1 = sc.nextDouble();
		System.out.print("Enter the value of y2: ");
		y2 = sc.nextDouble();
	}

	void FindDistance() {
		this.dis = Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));
		this.midx = (this.x1 + this.x2) / 2;
		this.midy = (this.y1 + this.y2) / 2;
	}

	void Show() {
		super.show();
		System.out.println("Distance: " + this.dis);
		System.out.println("Midpoint: (" + this.midx + ", " + this.midy + ")");
	}

	public static void main(String[] args) {
		Distance d = new Distance();
		d.readPoint();
		d.FindDistance();
		d.Show();
	}
}

abstract class P0int {
	double x1, y1, x2, y2;
	double dis;

	P0int() {
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
	}

	abstract void readPoint();

	abstract void FindDistance();

	void show() {
		System.out.println("x1: " + this.x1);
		System.out.println("y1: " + this.y1);
		System.out.println("x2: " + this.x2);
		System.out.println("y2: " + this.y2);
	}
}
