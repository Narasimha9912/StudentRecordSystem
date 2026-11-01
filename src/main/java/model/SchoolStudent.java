package model;

public class SchoolStudent extends Student {

    private String schoolName;
    private String grade;

    public SchoolStudent(int id, String name, int age,
                         String course, String schoolName, String grade) {

        super(id, name, age, course);

        this.schoolName = schoolName;
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getGrade() {
        return grade;
    }
}
