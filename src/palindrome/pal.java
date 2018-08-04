//program about palindrome
package palindrome;

import java.util.Scanner;

public class pal {
	public static void main(String args[]) { // main
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number"); // accepting input
		int number = sc.nextInt();

		int num = number;
		int sum = 0;

		while (num != 0) {
			int rem = num % 10;
			sum = (sum * 10) + rem; // logic
			num = num / 10;

		}
		if (sum == number)
			System.out.println("its a palindrome"); // printing values
		else
			System.out.println("its not a palindrome");
	}
}
