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
		
		textScanner.hasNextInt();
		int userNumber = textScanner.nextInt();
		System.out.println("your favorite number is: "+userNumber);
		
		
		System.out.println("type in some info");
		
		//need to call .nextLine() to consume the enter press after the call to .next .nextInt or
		//.nextDouble
		
		textScanner.nextLine();
		
		textScanner.close();
	}
	
	
}
