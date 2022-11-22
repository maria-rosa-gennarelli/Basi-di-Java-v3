package it.develhope.MetodoCostruttore.MCE2;

public class Teacher {
    public String teacherName;

    public Teacher (String teacherName){
        this.teacherName = teacherName;
    }

    public void assignGrade (Student student, int grade){
        student.grade = grade;
    }
}
