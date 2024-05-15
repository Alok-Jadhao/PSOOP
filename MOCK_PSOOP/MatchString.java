public class MatchString {
    public static void main(String[] args) {
        String str = "123";
        boolean result = str.matches("[0-9]+");
        System.out.println(result);
    }
}
