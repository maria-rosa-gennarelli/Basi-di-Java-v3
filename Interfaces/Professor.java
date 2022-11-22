package it.develhope;


public class Professor extends CollegePerson implements ITeachingPerson {
    public String subject;

    /**
     * @extends the class CollegePerson
     * @insert the new variables (String)
     */
    public Professor () {
        this.subject = subject;

    }


    @Override
    public void goToCollege(){
        System.out.println("The professor is going to the college to teach. ");
    }


    @Override
    public void teachToOtherPeople() {
        System.out.println("The professor teacher to other people. ");

    }
}
