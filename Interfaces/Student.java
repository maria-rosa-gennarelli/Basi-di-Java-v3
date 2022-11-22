package it.develhope;

public class Student extends CollegePerson implements ILearningPerson {
    public int academicYear;

    /**
     * @extends the class CollegePerson
     * @insert the new variables (String)
     */
    public Student (){
        this.academicYear = academicYear;
    }


    @Override
    public void goToCollege(){
        System.out.println("The student is going to the college. ");
    }

    @Override
    public void studyAtHome() {
        System.out.println("The student study home. ");
    }
}
