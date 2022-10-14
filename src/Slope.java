import java.util.Scanner;

// PROGRAM 7
public class Slope extends Point {
	double m1;
	double m2;

	void findSlope() {
		this.m1 = (this.y2 - this.y1) / (this.x2 - this.x1);
		this.m2 = (this.y4 - this.y3) / (this.x4 - this.x3);
	}

	void Display() {
		super.Show();
		System.out.println("Slope of line 1: " + this.m1);
		System.out.println("Slope of line 2: " + this.m2);
	}

	void Check() {
		if (this.m1 == this.m2) {
			System.out.println("Lines are parallel");
		} else if (-this.m1 == 1/this.m2) {
			System.out.println("Lines are perpendicular");
		} else {
			System.out.println("Lines are neither parallel nor perpendicular");
		}
	}

	public static void main(String[] args) {
		Slope s = new Slope();
		s.acceptPoint();
		s.findSlope();
		s.Display();
		s.Check();
	}
}

class Point {
	double x1, x2, x3, x4, y1, y2, y3, y4;
	double slope;

	void acceptPoint() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x1: ");
		x1 = sc.nextDouble();
		System.out.print("Enter the value of x2: ");
		x2 = sc.nextDouble();
		System.out.print("Enter the value of x3: ");
		x3 = sc.nextDouble();
		System.out.print("Enter the value of x4: ");
		x4 = sc.nextDouble();
		System.out.print("Enter the value of y1: ");
		y1 = sc.nextDouble();
		System.out.print("Enter the value of y2: ");
		y2 = sc.nextDouble();
		System.out.print("Enter the value of y3: ");
		y3 = sc.nextDouble();
		System.out.print("Enter the value of y4: ");
		y4 = sc.nextDouble();
	}

	void Show() {
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		System.out.println("x3 = " + x3);
		System.out.println("x4 = " + x4);
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
		System.out.println("y3 = " + y3);
		System.out.println("y4 = " + y4);
	}
}
