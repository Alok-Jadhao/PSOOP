interface Searchable {
    boolean search(String string);
}

class Document implements Searchable {
    String initialString;

    public Document(String initialString) {
        this.initialString = initialString;
    }

    @Override
    public boolean search(String string) {
        return initialString.contains(string);
    }
}

class WebPage implements Searchable {
    String initialString;

    public WebPage(String initialString) {
        this.initialString = initialString;
    }

    @Override
    public boolean search(String string) {
        return initialString.contains(string);
    }
}

public class Searching {
    public static void main(String[] args) {
        System.out.println("Document class - object.");
        String s1 = "Vandit and Alok are good friends.";
        System.out.println("Document : " + s1);
        Document document = new Document(s1);
        String search = "are good";
        System.out.println("String to search: " + search);
        System.out.println("The required string present: " + document.search(search) + "\n");

        System.out.println("WebPage class - object.");
        String s2 = "This is a sample webpage for Searching programming. No is 23";
        System.out.println("WebPage: " + s2);
        String search2 = "25";
        System.out.println("Number to search: " + search2);
        WebPage webPage = new WebPage(s2);
        System.out.println("The required string present: " + webPage.search(search2));
    }
}
