package managementSystem;
import java.util.*;

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student s1 = new Student(101, "Anika", "Software Engineering");
        Student s2 = new Student(102, "Roza", "Statistics");
        Student s3 = new Student(103, "Dipu", "Pharmacy");
        Student s4 = new Student(104, "Oishe", "Applied Math");
        Student s5 = new Student(105, "Rehan", "CSE");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        System.out.println("All Students:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        Student newStudent = new Student(106, "Faria", "Physics");
        studentList.add(2, newStudent);

        System.out.println("\nAfter adding at index 2:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        studentList.remove(3);
        System.out.println("\nAfter removing at index 3:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        Set<Student> courseEnrollment = new HashSet<>();
        courseEnrollment.add(s1);
        courseEnrollment.add(s2);
        courseEnrollment.add(s3);

        boolean added = courseEnrollment.add(new Student(101, "Anika", "Software Engineering"));
        System.out.println("\nAdding duplicate student (ID 101): " + (added ? "Added" : "Duplicate not added"));


        boolean isEnrolled = courseEnrollment.contains(s1);
        System.out.println("Is student with ID 101 enrolled? " + isEnrolled);



        System.out.println("\nEnrolled Students (HashSet)");
        for (Student s : courseEnrollment) {
            System.out.println(s);
        }


        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student s : studentList) {
            studentMap.put(s.getStudentId(), s);
        }
        int searchId = 1041;
        Student foundStudent = studentMap.get(searchId);
        System.out.println("\nRetrieved student with ID " + searchId + ":");
        System.out.println(foundStudent);
    }
}
