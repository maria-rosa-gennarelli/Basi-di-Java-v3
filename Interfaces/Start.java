package it.develhope;

public class Start {

    public static void main(String ...args){
        /**
         * Created a college
         */
        System.out.println("-----------------------");
        System.out.println("COLLEGE COLUMBIA");
        System.out.println("-----------------------");


        //Details student
        Student student = new Student();
        student.name = "Cesare";
        student.surname = "Monini";
        student.collegeId = 3298;
        student.academicYear = 2;
        System.out.println("STUDENT: " + student.name + " " + student.surname + " " + "|CollegeId:" + student.collegeId + " " + "|Academic Year:" + student.academicYear);

        //Details Professor
        Professor professor = new Professor();
        professor.name = "Dante";
        professor.surname = "Rossi";
        professor.subject = "Letteratura";
        professor.collegeId = 1239;
        System.out.println("PROFESSOR: " + professor.name + " " + professor.surname + " " + "|CollegeId:" + professor.collegeId + " " + "|Subject that teaches: " + professor.subject);

        //Details assistant
        Assistant assistant = new Assistant();
        assistant.name = "Sofia";
        assistant.surname = "Bianchi";
        assistant.collegeId = 2299;
        assistant.willBeAPhD = true;


        System.out.println("ASSISTANT: " + assistant.name + " " + assistant.surname + " " + "|CollegeId:" + assistant.collegeId + " " + "|Will be a Professor?: " + assistant.willBeAPhD);

    }
}
