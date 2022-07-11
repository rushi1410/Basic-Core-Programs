package com.bridgelabz;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = input.nextInt();
		input.close();
		if(a%2 == 0)
			System.out.println("The entered number is even.");
		else
			System.out.println("The entered number is odd.");
	}
}
