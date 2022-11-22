package it.develhope.JDOC01;

/**
 * @author Maria Rosa
 */
public class WordGames {
    /**
     * Created a wordgames class with the two methods below
     * @param word is the first input String of our method
     * @return the String Hello [wordHere]
     */
    public String addHelloWord(String word){
        return "Hello" + word;
    }

    /**
     * @param name is the first input String of our method
     * @param surname is the second input String of our method
     * @return all parameters in order, String 1 + String 2
     */
    public String getFullName(String name, String surname){
        return name + " " + surname;
    }

}
