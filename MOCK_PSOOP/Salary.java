class Employee {
    String name;
    String designation;

    Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
}

class Salaried extends Employee {
    double salary;
    int experience;
    int bonus;

    Salaried(String name, String designation, int experience) {
        super(name, designation);
        this.experience = experience;
    }

    public void calculateSalary() {
        if(experience <  5 && designation.equals("Clerk")) {
            bonus = 5000;
            salary = 20000 + bonus;
        } else if(experience >= 5 && designation.equals("Clerk")) {
            bonus = 10000;
            salary = 30000 + bonus;
        } else if(experience <= 5 && designation.equals("Manager")) {
            bonus = 15000;
            salary = 35000 + bonus;
        } else if(experience >= 5 && designation.equals("Manager")) {
            bonus = 30000;
            salary = 40000 + bonus;
        }

    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Experience: " + experience);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }

}

public class Salary {
    public static void main(String[] args) {
        Salaried salaried = new Salaried("John", "Clerk", 3);
        salaried.calculateSalary();
        salaried.printDetails();
    }
}
