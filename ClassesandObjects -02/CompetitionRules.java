package it.develhope.ClassieOggetti.COE2;

public class CompetitionRules{
    private CompetitionRules (){}

    public static CompetitionRules getInstance(){
        return competitionRules;
    }

    private static CompetitionRules competitionRules = new CompetitionRules();
    private static String competitionRules1 = "Do not copy and paste from StackOverflow";
    private static String competitionRules2 = "Learn every day!";
    private static String competitionRules3 = "Be the best team!";

    public void printRules() {
        System.out.println(competitionRules1 + " " + competitionRules2 + " " + competitionRules3);
    }
}
