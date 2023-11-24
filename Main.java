package lms_inheritance;

public class Main {
    public static void main(String[] args) {
        Admin jacob = new Admin("jacob","mars","wallace2");
        Teacher maxwell = new Teacher("maxwell","samuel","heather206");

        jacob.deleteTeacher();
        jacob.createClassroom();
        jacob.createStudent();


        // Polymorphism: When you have child classes that are performing a parent class' methods in a different way.
        // Whenever you use @override, that's polymorphism.
        maxwell.deleteTeacher();
        maxwell.createClassroom();
        Classroom english = new Classroom("english", maxwell,25);
        Classroom math = new Classroom("Math", new Teacher("Mehdi", "Hassan", "mhassan"), 35);

        Teacher eddie = new Teacher("eddie","samuel");
        System.out.println(eddie.getUsername());

        eddie.createStudent();
        eddie.createClassroom();
        eddie.deleteClassroom();
        eddie.deleteStudent();

        // What is the difference between an "is-a" vs a "has-a" relationship.

    }


}
