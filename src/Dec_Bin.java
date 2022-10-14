import java.util.Scanner;

// PROGRAM 18
public class Dec_Bin {
	int n;
	int s;
	int i;

	Dec_Bin() {
		n = 0;
		s = 0;
		i = 0;
	}

	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = sc.nextInt();
	}

	void recursive(int dec) {
		if (dec != 0) {
			recursive(dec/2);
			s = s * 10 + (dec % 2);
		}
	}

	void putdata() {
		System.out.println("Number: " + n);
		System.out.println("Binary equivalent: " + s);
	}

	public static void main(String[] args) {
		Dec_Bin obj = new Dec_Bin();
		obj.getdata();
		obj.recursive(obj.n);
		obj.putdata();
	}
}
