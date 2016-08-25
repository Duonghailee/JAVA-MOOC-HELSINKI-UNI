
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
         boolean condition = true;
        while(condition){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if(words.contains(word)){
                System.out.println("You gave the word " + word + " twice");
                condition=false;
            }
            else{ 
            words.add(word);
            }
        }
        
    }
}
