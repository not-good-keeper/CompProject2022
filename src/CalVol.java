import java.util.Scanner;

// PROGRAM 9
public class CalVol extends Base implements Data {
	double ht;

	CalVol(double radius, double height) {
		super(radius);
		this.ht = height;
	}

	public double volume() {
		return (pi * this.rad * this.rad * this.ht);
	}

	void show() {
		super.show();
		System.out.println("Height: " + this.ht);
		System.out.println("Volume: " + this.volume());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of radius: ");
		double radius = sc.nextDouble();
		System.out.print("Enter the value of height: ");
		double height = sc.nextDouble();
		CalVol cv = new CalVol(radius, height);
		cv.show();
	}
}

class Base {
	double rad;

	Base(double rad) {
		this.rad = rad;
	}

	void show() {
		System.out.println("Radius: " + this.rad);
	}
}

interface Data {
	double pi = 3.142;

	double volume();
}
