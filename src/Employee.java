public class Employee {
    String name;
    String jobtitle;
    double salary;

    Employee(String name, String jobtitle, double salary) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void salaryraise(double percent) {
        salary = salary + salary * percent / 100;

    }

    public void EmployeeDet() {
        System.out.println("Name : " + name);
        System.out.println("job title: " + jobtitle);
        System.out.println("Salary :" + salary);
    }
}

class Start {
    public static void main(String[] args) {
        Employee obj = new Employee("ANDY", "Engineer", 40000);
        Employee obj1 = new Employee("Andrew", "Sr Engineer", 50000);
        obj.EmployeeDet();
        obj1.EmployeeDet();
        obj.salaryraise(12);
        obj1.salaryraise(32);
        System.out.println("After salary raise");
        System.out.println("for Andy:");
        obj.EmployeeDet();
        System.out.println("for Andrew:");
        obj1.EmployeeDet();
    }
}

