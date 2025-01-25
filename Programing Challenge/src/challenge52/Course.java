package challenge52;

public class Course {

    static int maxCapacity=100;

    String courseName;
    int enrollments;

    String[] enrolledStudents = new String[maxCapacity];

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }


}
