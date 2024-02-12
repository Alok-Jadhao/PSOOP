
class Adder {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}

public class Overloading1{
    public static void main(String[] args) {
        Adder obj1 = new Adder();
        System.out.println("sum= " + obj1.sum(5,6));
        System.out.println("sum= " + obj1.sum(5,6,8));
    }
}

