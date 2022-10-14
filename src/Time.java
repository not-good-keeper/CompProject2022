import java.util.Scanner;

// PROGRAM 15
public class Time {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter hours: ");
		int hour = input.nextInt();
		System.out.print("Enter minutes: ");
		int minute = input.nextInt();
		if (hour < 0 || hour > 12 || minute < 0 || minute > 59) {
			System.out.println("Invalid time");
			return;
		}
		String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty", "Twenty One", "Twenty Two", "Twenty Three", "Twenty Four", "Twenty Five", "Twenty Six", "Twenty Seven", "Twenty Eight", "Twenty Nine"};
		String time = hour + ":" + minute + " ";
		if (minute == 0) {
			time += words[hour] + " O'Clock";
		} else if (minute == 15) {
			time += "Quarter Past " + words[hour];
		} else if (minute == 30) {
			time += "Half Past " + words[hour];
		} else if (minute == 45) {
			time += "Quarter To " + words[hour + 1];
		} else if (minute < 30) {
			time += words[minute] + " Minutes Past " + words[hour];
		} else {
			time += words[60 - minute] + " Minutes To " + words[hour + 1];
		}
		System.out.println(time);
	}
}
