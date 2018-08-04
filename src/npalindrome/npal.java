//program about palindrome
package npalindrome;

import java.util.Scanner;

public class npal // class palindrome
{
	Scanner sc = new Scanner(System.in);
	String[] str = new String[10];
	String[] rev = new String[10];
	int loc[] = new int[10];
	int size[] = new int[10];
	int id = 0;
	int temp=0;

	for(
	int k = 0;k<10;k++)
	{ // for loop
		System.out.println("Enter a string");
		str[k] = sc.nextLine();
		rev[k] = "";
		for (int j = str[k].length() - 1; j >= 0; j--) {
			rev[k] = rev[k] + str[k].charAt(j);
		}
	}for(
	int k = 0;k<10;k++)
	{
		if (str[k].equals(rev[k])) { // logic
			loc[id] = 1;
			id += 1;
		}
	}for(
	int i = 0;i<id;i++)
	{
		size[i] = str[loc[i]].length();
	}for(
	int i = 0;i<id;i++)
	{
		for (int j = 0; j < id - 1; j++) {
			if (size[j] < size[j + 1]) {
				temp = size[j];
				size[j] = size[j + 1];
				size[j + 1] = temp;
				temp = loc[j];
				loc[j] = loc[j + 1];
				loc[j + 1] = temp;
			}
		}
	}System.out.println("Palindrome Strings are");for(
	int i = 0;i<id;i++)
	{
		System.out.println(str[loc[i]]); // printing result
	}
}}
