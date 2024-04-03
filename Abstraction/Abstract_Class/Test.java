import java.util.Scanner;

/*
Program 1: Design a Quiz System as following
There is a abstract class Questions
It includes a variable question_text- This contains the text of the question
You can set question text using constructors.
It includes a method verifyAnswer() to verify .
It includes abstract method specifications for getQuestion(), getSolution().
There are 2 other classes True or False Questions, Multiple Choice Question
They all inherit the Question class and provide implementation for its methods.
They all have a variable called mySolution( Note: different class will have different data type for this variable).
Child classes will call parents getType method to get the question type
Multiple Choice Question also has variables for different options

Note:
Make a Main class where you can make and give the quiz
Write an interactive program in Java
Shuffle all the questions randomly
Each question must specify which type of question it is.
Total score and solution must be displayed in the end.
*/

abstract class Questions {
    String question_text;

    public Questions(String question_text) {
        this.question_text = question_text;
    }

    abstract boolean verifyAnswer(String giveAns);

    abstract String getQuestion();

    abstract String getSolution();
}

class TrueFalse extends Questions {
    String mySolution;

    public TrueFalse(String question_text, String mySolution) {
        super(question_text);
        this.mySolution = mySolution;
    }

    @Override
    boolean verifyAnswer(String giveAns) {
        if(mySolution.equals(giveAns)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    String getQuestion() {
        return question_text;
    }

    @Override
    String getSolution() {
        return mySolution;
    }

}

class MCQ extends Questions {
    String mySolution;

    public MCQ(String question_text, String mySolution) {
        super(question_text);
        this.mySolution = mySolution;
    }

    @Override
    boolean verifyAnswer(String giveAns) {
        if(mySolution.equals(giveAns)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    String getQuestion() {
        return question_text;
    }

    @Override
    String getSolution() {
        return mySolution;
    }
}

public class Test {
    public static void main(String[] args) {
        // Three MCQ Array.
        MCQ[] mcq = new MCQ[3];
        mcq[0] = new MCQ("Who is the Prime Minister of India?", "Narendra Modi");
        mcq[1] = new MCQ("Who is the Chief Justice of India?", "D. Y. Chandrachud");
        mcq[2] = new MCQ("Who is the President of India?", "Droupadi Murmu");

        // Three TrueFalse Array.
        TrueFalse[] tf = new TrueFalse[2];
        tf[0] = new TrueFalse("India is a democratic country.", "true");
        tf[1] = new TrueFalse("India got independence in 1945.", "false");

        System.out.println("Let the Quiz begin!");
        Scanner in = new Scanner(System.in);

        int score = 0;
        System.out.println("MCQ Quiz:");
        for(int i = 0; i < 3; i++) {
            System.out.println(mcq[i].getQuestion());
            String ans = in.nextLine();
            if(mcq[i].verifyAnswer(ans)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect Ans.!");
            }
        }

        System.out.println("True - False Quiz: true/false input only.");
        for(int i = 0; i < 2; i++) {
            System.out.println(tf[i].getQuestion());
            String ans = in.nextLine();
            if(tf[i].verifyAnswer(ans)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect Ans.!");
            }
        }

        System.out.println("Your score is: " + score + " out of 5");
        in.close();
    }
}

/*
* Hard-coded Quiz. No user input. User will only give the test. 
5 question
3 mcq
2 true/false

*/
