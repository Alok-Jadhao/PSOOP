/*
 * Design a class hierarchy consisting of Publication , Magazine , Book , and
KidsMagazine classes as follows: A Publication has a publisher, number of
pages, a price, and a title. The class should implement a print method that
displays all of this information. A Magazine is a kind of publication that has a
publication unit (monthly, weekly, biweekly). Magazine should override the print
method of Publication and display all the new information. A Book is a kind of
publication that has an author. Book should also override the print method of
Publication . A KidsMagazine is a kind of magazine that has a recommended age
range. Again, KidsMagazine should override the print method of Publication.
Implement a test class that stores 10 different types of publications: general,
magazine, book, or kid’s magazine in an array of Publication . Exploit
polymorphism and print the information, sorted by title, about each object stored
in the array.
 */ 

class Publication {
	String publisher;
	int numPages;
	int price;
	String title;

	public Publication (String publisher, int num, int price, String title) {
		this.publisher = publisher;
		numPages = num;
		this.price = price;
		this.title = title;
	}

	public void print() {
		System.out.println("Name of Pubisher: " + publisher);
		System.out.println("Number of Pages: " + numPages);
		System.out.println("Price of book: " + price);
		System.out.println("Title of book: " + title);
	}
}

class Magazine extends Publication {
	String publicationUnit;

	public Magazine (String publisher, int num, int price, String title, String publicationUnit) {
		super(publisher, num, price, title);
		this.publicationUnit = publicationUnit;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Publication Unit: " + publicationUnit);
	}
}

class Book extends Publication {
	String author;

	public Book (String publisher, int num, int price, String title, String author) {
		super(publisher, num, price, title);
		this.author = author;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Author of book: " + author);
	}
}

class KidsMagazine extends Magazine {
	int recommendedAge;

	public KidsMagazine (String publisher, int num, int price, String title, String publicationUnit, int recommendedAge) {
		super(publisher, num, price, title, publicationUnit);
		this.recommendedAge = recommendedAge;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Recommended Age: " + recommendedAge);
	}
}


public class Test {
	public static void main(String[] args) {
		Publication[] pub = new Publication[5];
		pub[0] = new Publication("Publisher1", 100, 200, "Z");
		pub[1] = new Magazine("Publisher2", 200, 300, "G", "Monthly");
		pub[2] = new Book("Publisher3", 300, 400, "C", "Author1");
		pub[3] = new KidsMagazine("Publisher4", 400, 500, "A", "Weekly", 10);
		pub[4] = new KidsMagazine("Publisher5", 500, 600, "J", "Biweekly", 15);

		for (int i = 0; i < pub.length; i++) {
			pub[i].print();
			System.out.println();
		}

		System.out.println();
		System.out.println("---------------------");

		System.out.println("Sorted by Title: ");

		sortTitle(pub);
		// print sorted array
		for (int i = 0; i < pub.length; i++) {
			pub[i].print();
		}

	}

	static void sortTitle(Publication[] pub) {
		for (int i = 0; i < pub.length; i++) {
			for (int j = i+1; j < pub.length; j++) {
				if (pub[i].title.compareTo(pub[j].title) > 0) {
					Publication temp = pub[i];
					pub[i] = pub[j];
					pub[j] = temp;
				}
			}
		}
	}
}
