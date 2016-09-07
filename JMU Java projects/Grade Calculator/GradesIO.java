import java.util.Scanner;

public class GradesIO 
{
	
	private Scanner scanscan = new Scanner(System.in);
	
	public void displayGreeting()
	{
		System.out.print("Welcome to the JMU GPA calculator\n\n");
	}
	
	public String readName()
	{
		System.out.print("Student Name: ");
		String name = scanscan.nextLine();
		return name;
	}
	
	public int readGradeCount()
	{		
		boolean validInput;
		validInput = false;
		int numberOfCourses;
		numberOfCourses = 10;
		
		while (!validInput)
		{
			System.out.print("How many grades? ");
			
			if (scanscan.hasNextInt())
			{
				numberOfCourses = scanscan.nextInt();
				
				if (numberOfCourses <= 0)
				{
					System.out.print("Bad Value - " + numberOfCourses);
					validInput = false;
				}
				else
				{
					validInput = true;
				}
			}
			else 
			{
				System.out.print("Bad Value - " + scanscan.nextInt());
			}
		}
		return numberOfCourses;
	}
	
	public String readGrade(int grade)
	{
		int courseNumber;
		System.out.print("Grade " + grade + ":");
		
		
		return "";
	}
}