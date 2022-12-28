/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * Dialog - Simulates a conversation with an AI
 */

import java.util.Scanner;

public class Dialog {
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Initializing variables
		final String TEXT_RED = "\u001B[31m"; 	// ANSI code for red.
		final String TEXT_RESET = "\033[0m";
		final String TEXT_YELLOW = "\033[0;33m";
		final String TEXT_BLUE = "\033[0;34m";
		final String TEXT_GREEN = "\033[0;32m";
		int UserWin = 0;
		int BotWin = 0;
		String Name = " ";
		String ComputerName = " ";
		String ChoiceString = " ";
		int ChoiceInt = 0;
		int Age = 0;
		String Y = "YES";
		String N = "NO";

		// Start of program.
		System.out.println("Hello, is anyone there? ");
		String Response = input.nextLine().toUpperCase();
		// Start of Loop
		boolean repeat = true;
		while (repeat)
		{
			if (Response.equals(Y))
			{
				System.out.println("What is your name? ");
				Name = input.nextLine();
				System.out.println("Hello " + Name + ", my name is Samantha.\n");
				ComputerName = "Samantha";
				System.out.println("How old are you " + Name + "? ");
				Age = Integer.parseInt(input.nextLine());
				if (Age >= 60)
				{
					System.out.println("So I guess you don't get the child discount at a movie theater anymore?\nJust a joke... Anyways!\n");
				}
				else if (Age >= 30 && Age < 60)
				{
					System.out.println("Okay so you're not that old and not that young.\n");

				}
				else if (Age >= 18 && Age < 30)
				{
					System.out.println("Okay so you're still pretty young.\n");

				}
				else
				{
					System.out.print("You are " + Age + "? ...Interesting.");
					System.out.println(" Anyways!\n");
				}
				System.out.println("Do you want to play a guessing game?");
				int MaxGuess = 5;
				ChoiceString = input.nextLine().toUpperCase();
				while (ChoiceString.equals(Y))
				{
					if (ChoiceString.equals(Y))
					{
						System.out.println("I'm thinking of a number between 1 and " + MaxGuess + ", guess it! ");
						ChoiceInt = Integer.parseInt(input.nextLine());
						int TempChoice = (int)(Math.random() * MaxGuess + 1);
						if (ChoiceInt == TempChoice)
						{
							System.out.println("You guessed " + ChoiceInt + " and the correct number was " + TempChoice + " so you were right!");
							UserWin += 1;
						}
						else
						{
							System.out.println("You guessed " + ChoiceInt + " and the correct number was " + TempChoice + " so you were wrong!");
							BotWin += 1;
						}
					}
					MaxGuess += 5;
					System.out.println("Do you want to play again, but do between 1 - " + MaxGuess + "?");;
					ChoiceString = input.nextLine().toUpperCase();
				}
			}
			else if (Response.equals(N))
			{
				System.out.println("Alright person who is not there.");
				Name = "nobody";
				System.out.println("What do you want to name me?");
				ComputerName = input.nextLine();
				System.out.println("Okay these are our new names " + TEXT_GREEN + ComputerName + TEXT_RESET + " & " + TEXT_RED + Name + TEXT_RESET + ".");
				System.out.println("Do you want to tell me your name now? :) Yes or No?");
				String TempResponse = input.nextLine().toUpperCase();
				switch (TempResponse)
				{
				case "YES":
					System.out.println("What is your name?");
					Name = input.nextLine();
					System.out.println("Nice to meet you " + Name + ", now my actual name is Samantha!");
					break;
				case "NO":
					System.out.println("Okay " + Name);
					break;
				default:
					System.out.println("I didn't recognize your input, but let's move forward!");	
				}
				System.out.println("How old are you " + Name + "? ");
				Age = Integer.parseInt(input.nextLine());
				if (Age >= 60)
				{
					System.out.println("So I guess you don't get the child discount at a movie theater anymore?\nJust a joke... Anyways!\n");
				}
				else if (Age >= 30 && Age < 60)
				{
					System.out.println("Okay so you're not that old and not that young.\n");

				}
				else if (Age >= 18 && Age < 30)
				{
					System.out.println("Okay so you're still pretty young.\n");

				}
				else
				{
					System.out.print("You are " + Age + "? ...Interesting.");
					System.out.println(" Anyways!\n");
				}
				System.out.println("Do you want to play a guessing game?");
				int MaxGuess = 5;
				ChoiceString = input.nextLine().toUpperCase();
				while (ChoiceString.equals(Y))
				{
					if (ChoiceString.equals(Y))
					{
						System.out.println("I'm thinking of a number between 1 and " + MaxGuess + ", guess it! ");
						ChoiceInt = Integer.parseInt(input.nextLine());
						int TempChoice = (int)(Math.random() * MaxGuess + 1);
						if (ChoiceInt == TempChoice)
						{
							System.out.println("You guessed " + ChoiceInt + " and the correct number was " + TempChoice + " so you were right!");
							UserWin += 1;
						}
						else
						{
							System.out.println("You guessed " + ChoiceInt + " and the correct number was " + TempChoice + " so you were wrong!");
							BotWin += 1;
						}
					}
					MaxGuess += 5;
					System.out.println("Do you want to play again, but do between 1 - " + MaxGuess + "?");;
					ChoiceString = input.nextLine().toUpperCase();
				}
			}
			else
			{
				System.out.println("I'm sorry, please answer yes or no.");
				Response = " ";
				Response = input.nextLine().toUpperCase();
				System.out.println("End of case 3, should loop?");
			}
			System.out.println("Do you want to continue to talk to me? Yes or No?");
			String Talk = input.nextLine().toUpperCase();
			if (Talk.equals(Y))
			{
				System.out.println("Actually I'm done talking, goodbye " + Name);
				repeat = false;
			}
			else if (Talk.equals(N))
			{
				System.out.println("Goodbye " + Name);
				repeat = false;
			}
			else
			{
				System.out.println("You didn't type a Yes or No and I don't want to talk anymore so I'm going to go, nice meeting you!");
				repeat = false;
			}
		}

	}
}
