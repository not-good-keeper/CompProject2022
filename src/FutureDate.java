import java.util.Scanner;

// PROGRAM 14
public class FutureDate {
	public static void main(String[] args) {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] leapMonthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner sc = new Scanner(System.in);
		System.out.print("Day Number: ");
		int day = sc.nextInt();
		if (day < 1 || day > 366) {
			System.out.println("Invalid day number");
			return;
		}
		System.out.print("Year: ");
		int year = sc.nextInt();
		System.out.print("Days after: ");
		int daysAfter = sc.nextInt();
		int total = day + daysAfter;
		while (total > 366) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				total -= 366;
			} else {
				total -= 365;
			}
			year++;
		}
		int month = 0;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			while (total > leapMonthDays[month]) {
				total -= leapMonthDays[month];
				month++;
			}
		} else {
			while (total > monthDays[month]) {
				total -= monthDays[month];
				month++;
			}
		}
		System.out.println("Date after " + daysAfter + " days: " + total + " " + months[month] + ", " + year);
	}
}
