package it.develhope.MetodoCostruttore.MCE2;

public class Student{

        public  String studentName;
        public int grade;


    public Student (String studentName) {
       this.studentName = studentName;
        System.out.println( "A new student is in the classroom");
    }

    public void print () {
        System.out.println("Student [studentName=" + studentName + ", grade = " + grade + "]");
    }

}
