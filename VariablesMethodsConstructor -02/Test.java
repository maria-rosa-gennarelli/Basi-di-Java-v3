package it.develhope.MetodoCostruttore.MCE2;

public class Test {

    public static void main(String[] args) {

        Student student, student2;
        student = new Student("Giulia");
        student2 = new Student("Federico");

        Teacher teacher = new Teacher("Vittoria");


        teacher.assignGrade(student, 4);
        teacher.assignGrade(student2, 6);
        student.print();
        student2.print();

    }
}