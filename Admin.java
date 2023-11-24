package lms_inheritance;

public class Admin {
    private String firstName;
    private String lastName;
    private String username;

    public Admin(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
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
        - EXCEPT for deleteTeacher()

 */
    public void createStudent(){
        System.out.println("student created by admin");
    }

    public void createTeacher(){
        System.out.println("teacher created by admin");
    }

    public void createClassroom(){
        System.out.println("classroom created by admin");

    }
    public void deleteTeacher(){
        System.out.println("teacher deleted by admin");
    }
    public void deleteStudent(){
        System.out.println("student deleted by admin");
    }
    public void deleteClassroom(){
        System.out.println("classroom deleted by admin");
    }

}
