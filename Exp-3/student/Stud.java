import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 5.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA!");
        }
    }

    public double getGpa() {
        return gpa;
    }
}

public class Stud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        System.out.print("Enter student GPA: ");
        double gpa = sc.nextDouble();
        Student student = new Student(name, age, gpa);
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());
        System.out.print("\nEnter new name: ");
        sc.nextLine();
        student.setName(sc.nextLine());
        System.out.print("Enter new age: ");
        student.setAge(sc.nextInt());
        System.out.print("Enter new GPA: ");
        student.setGpa(sc.nextDouble());
        System.out.println("\n--- New Student Details ---");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());
        sc.close();
    }
}