package com.bridgelabz;
import java.util.Scanner;
public class FlipCoin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of tosses: ");
		int N = input.nextInt();
		input.close();

		int  counter = 1;
		double Result = 0.0;
		float numberOfHeads = 0,numberOfTails = 0;
		float headPercentage, tailPercentage;
		while(counter <= N)
		{
			Result = Math.random();
			System.out.print(counter + "\t" +Result);

			if(Result > .5)
			{
				numberOfHeads++;
				System.out.println("\t head");
			}
			else
			{
				numberOfTails++;
				System.out.println("\t tail");
			}
			counter++;


		}
		headPercentage = (numberOfHeads / N) * 100;
		tailPercentage = (numberOfTails / N) * 100;
		System.out.println("Percentage of Heads in " + N + " flips is " + headPercentage + "%.");
		System.out.println("Percentage of Tails in " + N + " flips is " + tailPercentage + "%.");
	}
}
