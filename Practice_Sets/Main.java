/*
A Circus troupe has a number of animals. Each name is identified by a unique code. Also, the
animal has a species(lion, tiger,elephant etc), its age(in years), an event in which they
perform(eg. Balancing, fire-ball, ring-dance etc.). Write overloaded methods for the following:
findEvents(Circus[])->finds details of all animals in the circus array sorted event wise
findEvents(Circus[],species)->finds the events of all animals of the given species in the circus
array sorted event wise
Assume a given animal performs in a unique event.
*/

class Circus {
	int code;
	String species;
	int age;
	String event;

	Circus(int code, String species, int age, String event) {
		this.code = code;
		this.species = species;
		this.age = age;
		this.event = event;
	}

	void findEvents(Circus[] circus) {
		for(int i = 0; i < circus.length; i++) {
			for(int j = i+1; j < circus.length; j++) {
				if(circus[i].event.compareTo(circus[j].event) > 0) {
					Circus temp = circus[i];
					circus[i] = circus[j];
					circus[j] = temp;
				}
			}
		}

		// Displaying the sorted events
		for(int i = 0; i < circus.length; i++) {
			System.out.println("Code: " + circus[i].code + " Species: " + circus[i].species + " Age: " + circus[i].age + " Event: " + circus[i].event);
		}
	}


	void findEvents(Circus[] circus, String species) {
		for(int i = 0; i < circus.length; i++) {
			for(int j = i+1; j < circus.length; j++) {
				if(circus[i].event.compareTo(circus[j].event) > 0) {
					Circus temp = circus[i];
					circus[i] = circus[j];
					circus[j] = temp;
				}
			}
		}

		// Display only events of the given species
		for(int i = 0; i < circus.length; i++) {
			if(circus[i].species.equals(species)) {
				// display only events of the given species
				System.out.println("Code: " + circus[i].code + " Species: " + circus[i].species + " Age: " + circus[i].age + " Event: " + circus[i].event);
			}
		}

	}
}


public class Main {
	public static void main(String[] args) {
		Circus[] circus = new Circus[5];
		circus[0] = new Circus(1, "Lion", 5, "Balancing");
		circus[1] = new Circus(2, "Tiger", 3, "Ring-dance");
		circus[2] = new Circus(3, "Elephant", 7, "Fire-ball");
		circus[3] = new Circus(4, "Lion", 4, "Fire-ball");
		circus[4] = new Circus(5, "Tiger", 6, "Balancing");

		Circus c = new Circus(0, "", 0, "");
		System.out.println("Events sorted event wise");
		c.findEvents(circus);

		// New line
		System.out.println();
		System.out.println("--------------------------------------------------");

		System.out.println("Events of the given species sorted event wise");
		c.findEvents(circus, "Lion");
	}
}

