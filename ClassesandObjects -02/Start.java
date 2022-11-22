package it.develhope.ClassieOggetti.COE2;

public class Start {
    public static void main (String []args){
        CompetitionRules competitionRules = CompetitionRules.getInstance();
        competitionRules.printRules();

        Team teamA = new Team();
        Team teamB = new Team();
        teamA.teamName = "Coca";
        teamB.teamName = "Liverpool";
        teamA.p1.name = "Mario";
        teamA.p2.name =  "Giulia";
        teamB.p1.name = "Ginevra";
        teamB.p2.name = "Sandro";

        teamA.p1.programmingLanguage = "English";
        teamA.p2.programmingLanguage = "Italian";
        teamB.p1.programmingLanguage = "English";
        teamB.p2.programmingLanguage = "Italian";

        teamA.p1.yearsOfExperience = 2;
        teamA.p2.yearsOfExperience = 2;
        teamB.p1.yearsOfExperience = 3;
        teamB.p2.yearsOfExperience = 3;

        teamA.printTeamDetails();
        teamB.printTeamDetails();
    }
}
