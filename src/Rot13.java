import java.util.Scanner;

// PROGRAM 5

/*
Question 5
Caesar Cipher is an encryption technique which is implemented as ROT 13(Rotate by 13 place). It is simple letter substitution cipher that replaces a letter with the letter 13 places after it in the alphabets, with the other characters remaining unchanged.

                                           ROT 13

A/a	B/b	C/c	D/d	E/e	F/f	G/g	H/h	I/i	J/j	K/k	L/l	M/m
↕	↕	↕	↕	↕	↕	↕	↕	↕	↕	↕	↕	↕
N/n	O/o	P/p	Q/q	R/r	S/s	T/t	U/u	V/v	W/w	X/x	Y/y	Z/z


Write a program to accept a plain text of length L, where L must be greater than 3 and less than 100.
Encrypt the text if valid as per the Caesar Cipher. 
Test your program with the sample data and some random data:

Example 1:
 Input:         Hello! How are you?
Output:         The cipher text is:
                Uryyb! Ubj ner Ibh?

Example 2:
Input:           Encryption helps to secure data.
Output:          The cipher text is:
                 Rapelegvba urycf gb frpher gngn.

Example 3

Input:          Yes
Output:         Invalid Length



Algorithm:
1. Start
2. Input a string
3. If the string length is less than 3 or more than 100, print invalid and skip to step 8
4. Iterate over each character
5. Add 13 to each alphabet's ascii value
6. If it's ascii value is greater than that of z, subtract 26
7. Print the resulting characters
8. End
 */
public class Rot13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		if (s.length() < 3 || s.length() > 100) {
			System.out.println("Invalid Length");
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c = (char) (c + 13);
				if (c > 'z') {
					c = (char) (c - 26);
				}
			} else if (c >= 'A' && c <= 'Z') {
				c = (char) (c + 13);
				if (c > 'Z') {
					c = (char) (c - 26);
				}
			}
			System.out.print(c);
		}
	}
}
