package it.develhope.JDOC01;

/**
 * @author Maria Rosa
 */
public class Tester {
    /**
     *@param args  I set all the parameters to print the result of the two methods in the "WordGames" class
     */
    public static void main(String[] args) {

        WordGames wordGames = new WordGames();

        System.out.println(wordGames.addHelloWord(" word "));
        System.out.println(wordGames.getFullName("Mario" , "Rossi"));

    }
}
