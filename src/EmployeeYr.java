import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeYr {
    String name;
    LocalDate dateOfJoininng;

    LocalDate serviceEndDate;

    double salary;

    EmployeeYr(String name, LocalDate dateOfJoininng, double salary, LocalDate serviceEndDate) {
        this.name = name;
        this.dateOfJoininng = dateOfJoininng;
        this.salary = salary;
        this.serviceEndDate = serviceEndDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNmae() {
        return name;
    }

    public void setyear(LocalDate year) {
        this.dateOfJoininng = year;
    }

    public LocalDate getyear() {
        return dateOfJoininng;
    }

    public double getsalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate yearserved() {
        //int yearserved=LocalDate-;
        return null;
    }

    public void printEmployee() {

        System.out.println("NAME :" + name);
        System.out.println("SALARY :" + salary);
        System.out.println("Joining Date :" + dateOfJoininng);
        System.out.println("End Date :" + serviceEndDate);
    }
}
class Date {
    int year;
    int month;
    int day;
}

class Serviceperiod {
    public static void main(String[] args) {
        EmployeeYr obj = new EmployeeYr("neha",
                LocalDate.parse("2017-05-26", DateTimeFormatter.ISO_LOCAL_DATE),
                15000,
                LocalDate.parse("2018-05-26", DateTimeFormatter.ISO_LOCAL_DATE));
        EmployeeYr obj1 = new EmployeeYr("sneha",
                LocalDate.parse("2007-05-26", DateTimeFormatter.ISO_LOCAL_DATE),
                15000,
                LocalDate.parse("2018-05-26", DateTimeFormatter.ISO_LOCAL_DATE));
        obj.printEmployee();
        Duration objServiceDuration = Duration.between(obj.serviceEndDate, obj.dateOfJoininng);
        long objServiceDays = objServiceDuration.toDays();
        System.out.println("Neha Service Duration:" + objServiceDuration);
        System.out.println("Neha Service Duration:" + objServiceDays / 365);
//        System.out.println("SERVICE YEAR:"+obj.yearserved());
//        obj1.calservice();
//        System.out.println("SERVICE YEAR:"+obj1.yearserved());

        LocalDate d1 = LocalDate.parse("2018-05-26", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d2 = LocalDate.parse("2018-05-28", DateTimeFormatter.ISO_LOCAL_DATE);
        Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
        long diffDays = diff.toDays();
        System.out.println(diff.toDays());
        System.out.println(diff.toHours());
    }
}