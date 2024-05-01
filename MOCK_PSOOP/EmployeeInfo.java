/*
Create a class 'Employee' with three data members which are name, age and Salary. The
constructor of the class assigns default values name as "unknown", age as '0' and address
as "not available". It has SetInfo method assigns name, age and Salary respectively. Print
the name, age and Salary of 10 employees sorted according to their age.
Hint - Use array of objects
*/

class Employee {
    String name;
    int age;
    double salary;

    Employee() {
        name = "unknown";
        age = 0;
        salary = 0;
    }

    // set info just like a constructor
    void setInfo(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age + " Salary: " + salary);
    }

}

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee();
        emp[0].setInfo("John", 25, 25000);
        emp[1] = new Employee();
        emp[1].setInfo("Doe", 30, 30000);
        emp[2] = new Employee();
        emp[2].setInfo("Jane", 20, 20000);
        emp[3] = new Employee();
        emp[3].setInfo("Doe", 35, 35000);
        emp[4] = new Employee();
        emp[4].setInfo("Doe", 15, 40000);

        sortAge(emp);

        for (int i = 0; i < emp.length; i++) {
            emp[i].display();
        }

    }

    static void sortAge(Employee[] emp) {
        for(int i = 0; i < emp.length-1; i++) {
            for(int j = i; j < emp.length; j++) {
                if(emp[i].age > emp[j].age) {
                    Employee temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }
            }
        }
    }

}
