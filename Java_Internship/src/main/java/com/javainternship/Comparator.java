import java.util.*;

// Custom Comparator for sorting by name
class NameComparator implements Comparator<Student> 
{
    @Override
    public int compare(Student s1, Student s2)
 {
        return s1.getName().compareTo(s2.getName());
    }
}

// Custom Comparator for sorting by age
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

public class Comparator
 {
    public static void main(String[] args)
 {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 85.5));
        students.add(new Student("Bob", 22, 92.0));
        students.add(new Student("Charlie", 21, 78.0));

        // Sorting by name using Comparator
        Collections.sort(students, new NameComparator());
        System.out.println("Sorting by name (using Comparator):");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting by age using Comparator
        Collections.sort(students, new AgeComparator());
        System.out.println("\nSorting by age (using Comparator):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
