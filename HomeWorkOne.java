/*File: Homework1.java
 *Author: Ryan Deckard
 *Date: June 27, 2017
 *Purpose: Write a program that prompts a user to enter student EMPLID, quiz 1 percentage score, quiz 2 percentage score, quiz 3 percentage score, your age in months and the current temperature in degrees Celsius and then displays the data centered along with some conversions and calculations.
*/

//This utility is imported to accept various types of user input
import java.util.Scanner;

//Establishes class type and name
public class HomeWorkOne {
        public static void main(String[] args)  {
	
	//Variables to hold values
	int emplIdent = 0;
	double quizOne = 0.0;
	double quizTwo = 0.0;
	double quizThree = 0.0;
	int yourAge = 0;
	double degrCelc = 0.0;
	
	//Use the Scanner class to input data from Standard I/O
	Scanner scannerIn = new Scanner(System.in);

	//Prompt the user to enter their Employee ID
	System.out.println("Enter your Employee ID #:");
	emplIdent = scannerIn.nextInt();

	//Prompt the user to enter their Quiz Score 1
	System.out.println("Enter your score for Quiz 1:");
	quizOne = scannerIn.nextDouble();

	//Prompt the user to enter their Quiz Score 2
	System.out.println("Enter your score for Quiz 2:");
	quizTwo = scannerIn.nextDouble();
	
	//Prompt the user to enter their Quiz Score 3
	System.out.println("Enter your score for Quiz 3:");
	quizThree = scannerIn.nextDouble();

	//Prompt the user to enter their age
	System.out.println("Enter your age in months:");
	yourAge = scannerIn.nextInt();	

	//Prompt the user to enter the temperature
	System.out.println("Enter the temperature in Degrees Celcius:");
	degrCelc = scannerIn.nextDouble();

	//Print the results to verfiy the data
	System.out.println("    ***Thank You***");
	System.out.println("Your Emplooyee ID # is: " + emplIdent);
	System.out.println("Your Quiz 1 score is: " + quizOne);
	System.out.println("Your Quiz 2 Score is: " + quizTwo);
	System.out.println("Your Quiz 3 score is: " + quizThree);
	
	//Variable that calculates the average on quizOne, quizTwo, and quizThree	
	double quizResults = ((quizOne + quizTwo + quizThree) / 3); 

	//Prints the Average Score
	System.out.println("The Average Score is: " + quizResults);
	
	//Prints the users Age in Months
	System.out.println("Your Age in Months is: " + yourAge);
	
	//Variable that calculates user's age in years	
	int ageInYears = (yourAge / 12);

	//Prints the calculated value of user's age in years
	System.out.println("Your Age in Years is: " + ageInYears);
	
	//Variable that represents Degrees Celcius
	String degreeCelcius = "\u2103";	
	

	//Prints the temperature in Celcius with the correct symbology
	System.out.println("The temperature in Celcius is: " + degrCelc + degreeCelcius);
	
	//Vairables that are used to convert temperature from Celcius to Farenheit
	double degrFar = (degrCelc * 1.8);
	double degrFar2 = (degrFar + 32);
	
	//Variable that represents Degrees Farenheit
	String degreeFarenheit = "\u2109";

	//Prints the converted temperature in Degrees Farenheit	
	System.out.println("The Temperature in Farenheit is: " + degrFar2 + degreeFarenheit);

	}
}


	

