import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
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
        for(String word : words){
            System.out.println(word);
        }
    }
}
