import java.util.*;

class Student implements Comparable<Student> 
{
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    // Implementing Comparable to compare by grade
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.grade, other.grade); // Ascending order
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + "}";
    }
}

public class Comparable
{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 85.5));
        students.add(new Student("Bob", 22, 92.0));
        students.add(new Student("Charlie", 21, 78.0));

        // Sorting using Comparable
        Collections.sort(students);

        System.out.println("Sorting by grade (using Comparable):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
