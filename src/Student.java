import java.util.ArrayList;

public class Student {
    String name;
    int grade;
    ArrayList<String> courseList = new ArrayList<String>();

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courseList = new ArrayList<String>();
    }

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ArrayList<String> getCourseList() {
        return courseList;
    }

    public void addcourse(String course) {
        courseList.add(course);

    }

    public void removecourse(String course) {
        courseList.remove(course);

    }

    public void studentDetail() {
        System.out.println("NAME: " + name);
        System.out.println("Grade: " + grade);
    }
}

class Studentcource_det {
    public static void main(String[] args) {
        Student obj = new Student("Neha", 8);
        Student obj1 = new Student("Ram", 9);
        Student obj2 = new Student("Sita", 10);
        obj.studentDetail();
        obj.addcourse("math");
        obj.addcourse("science");
        obj.addcourse("history");
        System.out.println(obj.getCourseList());
        obj1.studentDetail();
        obj1.addcourse("math");
        obj1.addcourse("science");
        obj1.addcourse("philosophy");
        System.out.println(obj1.getCourseList());
        System.out.println("AFTER REMOVING SCIENCE FROM RAM");
       obj1.removecourse("science");
        obj1.studentDetail();
        System.out.println(obj1.getCourseList());

    }
}
