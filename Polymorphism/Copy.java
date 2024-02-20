class Rectangle {

    int length = 20;
    int breadth = 10;

}

public class Main2{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Length: " + r1.length);
        System.out.println("Breadth: " + r1.breadth);

        Rectangle r2 = r1;
        System.out.println("Length: " + r2.length);
        System.out.println("Breadth: " + r2.breadth);
    }
}
