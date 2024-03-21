class Employee {
    // Base salary for all employees
    public double getSalary() {
        return 10000; // Rs. 10,000
    }

    // Bonus amount for all employees (initially set to Rs. 0)
    public double getBonus() {
        return 0;
    }
}

class Intern extends Employee {
    // Interns receive 3/4th of the base salary of an Employee
    @Override
    public double getSalary() {
        return super.getSalary() * 0.75;
    }

    // Bonus amount for Interns
    @Override
    public double getBonus() {
        return 2000; // Assume Rs. 2000 as bonus
    }
}

class Clerk extends Employee {
    // Clerks receive 1/2 of the base salary of an Employee
    @Override
    public double getSalary() {
        return super.getSalary() * 0.5;
    }

    // Bonus amount for Clerks
    @Override
    public double getBonus() {
        return 3000; // Assume Rs. 3000 as bonus
    }
}

class Manager extends Employee {
    // Managers receive twice the base salary of an Employee
    @Override
    public double getSalary() {
        return super.getSalary() * 2;
    }

    // Bonus amount for Managers
    @Override
    public double getBonus() {
        return 5000; // Assume Rs. 5000 as bonus
    }
}

public class Salary {
    public static void main(String[] args) {
        // Creating instances of different roles
        Intern intern = new Intern();
        Clerk clerk = new Clerk();
        Manager manager = new Manager();

        // Displaying salary and total salary received after bonus for each role
        System.out.println("Intern Salary: Rs." + intern.getSalary() + ", Total Salary: Rs." + (intern.getSalary() + intern.getBonus()));
        System.out.println("Clerk Salary: Rs." + clerk.getSalary() + ", Total Salary: Rs." + (clerk.getSalary() + clerk.getBonus()));
        System.out.println("Manager Salary: Rs." + manager.getSalary() + ", Total Salary: Rs." + (manager.getSalary() + manager.getBonus()));
    }
}
