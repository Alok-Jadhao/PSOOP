public class StringOutOfBoundsExample {
    public static void main(String[] args) {
        String sample = "Hello";
        try {
            char character = sample.charAt(10);
            System.out.println(character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
