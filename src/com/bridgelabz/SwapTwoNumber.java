package com.bridgelabz;
import java.util.Scanner;
public class SwapTwoNumber {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number a: ");
		int a = input.nextInt();
		System.out.print("Enter number b: ");
		int b = input.nextInt();
		input.close();
		System.out.println("Value of a is " + a	+ " and Value of b is " + b + " before swapping.");
		swap(a, b);
	}

	static void swap(int x, int y)
	{
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Value of a is " + x	+ " and Value of b is " + y + " after swapping.");
	}
}
