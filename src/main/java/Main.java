import model.Student;
import service.StudentService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n===== STUDENT RECORD MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student student = new Student(id, name, age, course);

                    service.addStudent(student);
                    break;

                case 2:
                    List<Student> students = service.displayStudents();

                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        for (Student s : students) {
                            System.out.println(
                                "ID: " + s.getId()
                                + " | Name: " + s.getName()
                                + " | Age: " + s.getAge()
                                + " | Course: " + s.getCourse()
                            );
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = Integer.parseInt(sc.nextLine());

                    Student found = service.searchStudent(searchId);

                    if (found != null) {
                        System.out.println("Student Found!");
                        System.out.println("Name: " + found.getName());
                        System.out.println("Age: " + found.getAge());
                        System.out.println("Course: " + found.getCourse());
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int updateId = Integer.parseInt(sc.nextLine());

                    Student existing = service.searchStudent(updateId);

                    if (existing != null) {

                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter New Age: ");
                        int newAge = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter New Course: ");
                        String newCourse = sc.nextLine();

                        Student updatedStudent = new Student(
                            updateId, newName, newAge, newCourse
                        );

                        service.updateStudent(updatedStudent);

                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    int deleteId = Integer.parseInt(sc.nextLine());

                    service.deleteStudent(deleteId);
                    break;

                case 6:
                    System.out.println("Thank you for using our system!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
