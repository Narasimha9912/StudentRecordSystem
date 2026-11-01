
package model;

public class CollegeStudent extends Student {

    private String department;
    private int year;

    public CollegeStudent(int id, String name, int age,
                          String course, String department, int year) {

        super(id, name, age, course);

        this.department = department;
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public int getYear() {
        return year;
    }
}
