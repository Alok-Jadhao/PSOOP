import java.util.*;
class Details{
	String name;
	int rollno;
	int Sub1marks, Sub2marks;
	public char grade;

	
	void assignGrade(){
		int average = (Sub1marks + Sub2marks)/2;
		if(average<40)
			grade = 'F';
		else if(40<average && average < 60)
			grade = 'B';
		else if(61<average && average < 75)
			grade = 'A';
		else if(average > 75)
			grade = 'O';
		
	}
	
	public void display(){
		System.out.println("The name of the student is: " + name);
		System.out.println("Roll no: " + rollno);
		System.out.println("Sub1 marks: " + Sub1marks);
		System.out.println("Sub2 marks: " + Sub2marks);
		System.out.println("Total marks are: " + (Sub1marks + Sub2marks));
		System.out.println("Grade: " + grade);
	}
}

public class Marksheet{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String name;
		int rollno;
		int Sub1marks, Sub2marks;
		char Grade;
		int tota;
		
		
		System.out.print("Enter the Student name: ");
		name = in.nextLine();	
		System.out.print("Enter the roll no: ");
		rollno = in.nextInt();
		System.out.print("Enter Subject1 marks: ");
		Sub1marks = in.nextInt();
		System.out.print("Enter Subject2 marks: ");
		Sub2marks = in.nextInt();
		total = Sub1marks + Sub2marks;
		
		
		Details student1 = new Details();
		student1.name = name;
		student1.rollno = rollno;
		student1.Sub1marks = Sub1marks;
		student1.Sub2marks = Sub2marks;
		
		student1.assignGrade();
		
		student1.display();
		
		
	}
}
//This is comment inserted in terminal.
