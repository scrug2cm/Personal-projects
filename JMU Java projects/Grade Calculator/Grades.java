
public class Grades 
{ 
	public static void main (String[] args)
	{
		String greeting;
		String name;
	int numberOfCourses;
	GradeCalculator gradeCalculator = new GradeCalculator();
	GradesIO gradesIO = new GradesIO();
	
	gradesIO.displayGreeting();
	
	name = gradesIO.readName();
	
	numberOfCourses = gradesIO.readGradeCount();
	
	//gradesIO.readGrade();
	
	//gradesIO.readCredits();
	
	
	}
}
