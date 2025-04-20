package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gpa=").append(gpa);
        sb.append('}');
        return sb.toString();
    }

    // 4.compareTo(3) --> 4, 3
    @Override
    public int compareTo(Student o) {

        return Double.compare(o.getGpa(), this.getGpa());
    }
}

public class ListMain {
    public static void main(String[] args) {
        // Corrected List type
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);

        students.sort(comparator);

//        students.sort((o1, o2) -> {
//            if ((o2.getGpa() - o1.getGpa()) > 0) {
//                return 1;
//            } else if ((o2.getGpa() - o1.getGpa()) < 0) {
//                return -1;
//            } else {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        // Printing the list of students for verification
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }
    }
}
