package it.develhope;

public class Assistant extends CollegePerson implements ILearningPerson, ITeachingPerson{

    public boolean willBeAPhD;

    /**
     * @extends the class CollegePerson
     * @insert the new variables (boolean)
     */
    public Assistant() {
        this.willBeAPhD = willBeAPhD;
    }


    @Override
    public void studyAtHome() {
        System.out.println("The assistant study at home to become a professor");
    }

    @Override
    public void goToCollege(){
        System.out.println("The assistant go to college. ");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("The assistant teach other people to practice ");

    }
}
