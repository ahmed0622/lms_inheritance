package lms_inheritance;
/*
 For this project we'll create a school's Learning Management System (LMS).
 We'll create the piece of the LMS that contains Teacher data and Admin data.
 We'll have a class called Admin that has the following data:
     - firstName
     - lastName
     - username
 Also give it the following methods:
     - createStudent()
     -  createTeacher()
     - createClassroom()
     - deleteTeacher()
     - deleteStudent()
     - deleteClassroom()


 Next, create a Teacher class that inherits from the Admin
     - Teacher should have all the fields/methods that the Admin has
     - EXCEPT for deleteTeacher(). For this method we'll use the @override
       so that when this method is invoked, we'll just do a println
       that says "teachers do not have permission to perform this action"

*/

// Inheritance: When you have a class that extends another class, thereby inheriting
// all class fields and methods of the class it's inheriting from.
public class Teacher extends Admin{
// Teacher maxwell = new Teacher("maxwell","samuel","heather206")
// Teacher maxwell = new Teacher("eddie","harris");

    // The "super" keyword refers to the class we're inheriting from. In this case, Admin
    public Teacher(String firstName, String lastName, String username) {
        super(firstName, lastName, username);
    }

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName, "unknown");
    }

    // Polymorphism
    @Override
    public void deleteTeacher() {
        System.out.println("teachers do not have permission to perform this action");
    }

    @Override
    public void createStudent() {
        System.out.println("student created by teacher");
    }

    @Override
    public void createTeacher() {
        System.out.println("teacher created by teacher");
    }

    @Override
    public void createClassroom() {
        System.out.println("classroom created by teacher");
    }

    @Override
    public void deleteStudent() {
        System.out.println("student deleted by teacher");
    }

    @Override
    public void deleteClassroom() {
        System.out.println("classroom deleted by teacher");
    }
}
