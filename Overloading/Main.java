/* Create a Test class with a data double base, int power, int logBase, int argument.

 Create a default, no-argument constructor which sets the default value of all variables to 2.

 There are 2 overloaded functions:

 1. double calculate (double base, int power)

 This function returns the value when *base* is raised to *power*

 For example: calculate (3.0, 2) returns the value of 3.0 raised to 2 i.e., 9.0

 2. double calculate (int logBase, int argument)

 This function returns the value of the log of *argument* to the base *logBase*.

 For example: calculate (3, 9) returns log of 9 to the base 3 i.e., 2.0

 Create a main method in a separate class to call the above functions with the following inputs:

 1. calculate (2, 4)*/

class Test{
    double base;
    int power;
    int logBase;
    int argument;

    public Test() {
        base = 2;
        power = 2;
        logBase = 2;
        argument = 2;
    }

    double calculate (double base, int power){
        return Math.pow(base, power);
    }

    double calculate (int logBase, int argument){
        return Math.log10(argument)/Math.log10(logBase);
    }
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        double ans = test.calculate(2, 4);
        System.out.println(ans);
    }
}