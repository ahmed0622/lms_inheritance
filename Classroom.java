package lms_inheritance;

public class Classroom {
    private String subject;
    private Teacher teacher;
    private int numOfStudents;

    public Classroom(String subject, Teacher teacher, int numOfStudents) {
        this.subject = subject;
        this.teacher = teacher;
        this.numOfStudents = numOfStudents;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }
}
