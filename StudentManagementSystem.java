package random;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private String course;
    private String rollNo;
    private String phoneNo;
    private String email;
    private String address;
    private String bloodGroup;

    public Student(String name, int id, String course, String rollNo, String phoneNo, String email, String address, String bloodGroup) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.rollNo = rollNo;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.bloodGroup = bloodGroup;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Course: " + course + 
               ", Roll No: " + rollNo + ", Phone No: " + phoneNo + 
               ", Email: " + email + ", Address: " + address + 
               ", Blood Group: " + bloodGroup;
    }
}

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static int studentIdCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter course: ");
        String course = scanner.nextLine();
        System.out.print("Enter roll number: ");
        String rollNo = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNo = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter blood group: ");
        String bloodGroup = scanner.nextLine();

        Student student = new Student(name, studentIdCounter++, course, rollNo, phoneNo, email, address, bloodGroup);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}