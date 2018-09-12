package controller;

import java.util.Scanner;

public class Controller {

	
	public void start()
	{
		questions();
		moreInput();
	}

	private void questions()
	{
		System.out.println("what is your fav food");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.nextLine();
		System.out.println(answer +" is hecking great");
		
		System.out.println("what is the answer");
		answer = inputScanner.nextLine();
		
		//inputScanner.close();
		//had to comment out because we still have to input text after it finishes printing
		
	}

	private void moreInput()
	{
		Scanner textScanner; // this is a declaration of a scanner variable

		
		textScanner = new Scanner(System.in); //Initialization of the textScanner variable
		
		
		
		System.out.println("What is your favorite number");
		int userNumber = textScanner.nextInt();
		validInt();
		
		System.out.println("your favorite number is: "+userNumber);
		
		
		System.out.println("end of questtionaire thanks");
		
		//need to call .nextLine() to consume the enter press after the call to .next .nextInt or
		//.nextDouble
		
		textScanner.nextLine();
		
		textScanner.close();
	}
	
	public boolean validInt(userNumber)
	{
		//declares and initializes a boolean variable to false
		boolean isValid = false;
		try {
			//tries to convert the text to an integer
			Integer.parseInt(userNumber);
		isValid = true;
			}
		catch(NumberFormatException error)	
		{
			System.out.println("typy a number");
		}
		
		return isValid;
		
	}
	
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		try {
			Double.parseDouble(example);
			isValid = true;
			}

		catch(NumberFormatException oops)
		{
			System.out.println("Only floating point values are accepted AKA a number with a . in it");
		}
		
		return true;
	}
	
	
}