import java.util.Scanner;
import java.util.StringTokenizer;

// PROGRAM 4

/*
Question 4
A string is said to be valid if it contains pair of parenthesis having text/alphabet such as (TY) and the string is said to be invalid if it contains nested parenthesis such as
(Y (UP)).
 For example: SUN (A(X) RISE) BEGINS FROM (RT) EAST is an "Invalid" string because in this string nested parenthesis are present, but SUN (A) RISE BEGINS FROM (RT) EAST is a "Valid" string because there is no nested parenthesis.

Write a program to:
 (a) Read a string/sentence and convert in capitals. 
(b)Check the validity of the given string
(c) If the string is valid, output the given string omitting the portion enclosed in brackets otherwise, output a message "Sorry, and invalid string".

Test your program for the given sample data and also some other random data:
Sample Data:

Input:    SUN (A) RISE BEGINS FROM (RT) EAST
Output: SUN RISE BEGINS FROM EAST
Input:    SUN (A (X) RISE) BEGINS FROM (RT) EAST
Output: Sorry, an invalid string
Input:    COM (IPX) PUTER IS (MY) JUNK (GOOD) SYSTEM COMPUTER IS JUNK SYSTEM
Output: COMPUTER IS JUNK SYSTEM

Algorithm:
1. Start
2. Input a string
3. Convert it to uppercase
4. If the string has brackets within brackets, print invalid string and skip to step 7
5. Convert the string to words
6. Print all the words that are not surrounded by brackets
7. End
 */
public class Parentheses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine().toUpperCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				count++;
				if (count > 1) {
					System.out.println("Sorry, an invalid string");
					return;
				}
			} else if (s.charAt(i) == ')') {
				count--;
			}
		}
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if (token.charAt(0) != '(' && token.charAt(token.length() - 1) != ')') {
				System.out.print(token + " ");
			}
		}
		System.out.println();
	}
}
