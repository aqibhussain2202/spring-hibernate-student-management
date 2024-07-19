package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
    public static void main(String[] args) {
        System.out.println("WELCOME");
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        //FOR INSERTINH STUDENT NEW
//        Student student = new Student(876, "arif", "Jhs");
//        int r = studentDao.insert(student);
//        System.out.println(r);
        
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to add a new student");
            System.out.println("Press 2 to display all students");
            System.out.println("Press 3 to get details of a single student");
            System.out.println("Press 4 to delete a student");
            System.out.println("Press 5 to update a student");
            System.out.println("Press 6 to exit");

            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    // Adding a new student
                    System.out.println("Enter student id: ");
                    int id = sc.nextInt();
                    sc.nextLine();  // consume newline
                    System.out.println("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter student city: ");
                    String city = sc.nextLine();
                    Student student = new Student(id, name, city);
                    int result = studentDao.insert(student);
                    System.out.println("Student added with id: " + result);
                    break;

                case 2:
                    // Displaying all students
                    List<Student> students = studentDao.getAllStudents();
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    // Getting details of a single student
                    System.out.println("Enter student id: ");
                    int studentId = sc.nextInt();
                    Student s = studentDao.getStudent(studentId);
                    if (s != null) {
                        System.out.println(s);
                    } else {
                        System.out.println("Student not found with id: " + studentId);
                    }
                    break;

                case 4:
                    // Deleting a student
                    System.out.println("Enter student id: ");
                    int deleteId = sc.nextInt();
                    studentDao.delete(deleteId);
                    System.out.println("Deleted student with id: " + deleteId);
                    break;

                case 5:
                    // Updating a student
                    System.out.println("Enter student id: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();  // consume newline
                    System.out.println("Enter new student name: ");
                    String newName = sc.nextLine();
                    System.out.println("Enter new student city: ");
                    String newCity = sc.nextLine();
                    Student updateStudent = new Student(updateId, newName, newCity);
                    studentDao.update(updateStudent);
                    System.out.println("Updated student with id: " + updateId);
                    break;

                case 6:
                    // Exit
                    sc.close();
                    System.out.println("Exiting...");
                    System.out.println("Thankyou using my application");
                    System.out.println("See you soon @Aqib Hussain");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("Thankyou using my application");
                    System.out.println("See you soon @Aqib Husssain");
            }
        }
    }
}
