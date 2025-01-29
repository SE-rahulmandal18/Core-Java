package challenge70;

public class Student {
    String name;
    int age;
    String rollNumber;
    String house;

    Student(String name, int age, String rollNumber, String house) {
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
        this.house=house;
    }

    @Override
    public String toString() {
        return "Student details: {name:"+ name +", age:"+ age +", roll number:"+ rollNumber+",  house:"+house+"}";
    }

    public static void main(String[] args) {
   Student student = new Student("Rahul", 27, "47", "Falcon");
        System.out.println(student);
    }
}
