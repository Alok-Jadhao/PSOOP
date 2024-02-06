/*
Write a menu-driven program to recruit an employee (depending on his performance in various rounds) in some software company using constructor overloading.
 Selection Criteria for each post is given below:
    Programmer(Minimum total of 80 marks ):-
Rounds:-
    Course Work
    Aptitude Test
    Technical Test
    Interview

    Team Leader(Minimum total of 85 marks ):
Rounds:-
    Technical Test
    Interview

    Project Manager(Minimum score 90 marks)
Rounds:-
    Interview
Create a class Posting and write 3 constructors to initialize the object and set the parameters and display the employee post according to selection criteria.
            Data members:
    private int courseWork;
    private int AptTest;
    private int TechTest;
    private int interview;

Methods:
    public Posting(int courseWork, int AptTest, int TechTest,int interview)
    public Posting(int TechTest,int interview)
    public Posting(int interview)
Make use of ‘this’ keyword. Create arrray of objects , give the list of candidates selected for each post(Programmer, Team Lead and project Manager)
*/


class Posting{
    private int courseWork;
    private int AptTest;
    private int TechTest;
    private int interview;

    public Posting(int courseWork, int aptTest, int techTest, int interview) {
        this.courseWork = courseWork;
        this.AptTest = aptTest;
        this.TechTest = techTest;
        this.interview = interview;
    }

    public Posting(int techTest, int interview) {
        TechTest = techTest;
        this.interview = interview;
    }

    public Posting(int interview) {
        this.interview = interview;
    }
    
    


}

public class Employee{
    public static void main(String[] args) {

    }
}


