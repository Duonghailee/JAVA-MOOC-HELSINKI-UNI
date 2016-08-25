import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        boolean condition = true;
        while(condition){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if(word.equals("")){
                condition=false;
            }
            else{ 
            words.add(word);
            } 
    }
        System.out.println("You typed the following words: ");
        Collections.reverse(words);
        for(String word : words){
            System.out.println(word);
        }
}
}
