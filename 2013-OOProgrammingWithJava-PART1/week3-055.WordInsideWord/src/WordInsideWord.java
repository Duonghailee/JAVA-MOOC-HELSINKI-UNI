
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String text1 = reader.nextLine();
        System.out.println("Type the second word: ");
        String text2 = reader.nextLine();
        int index = text1.indexOf(text2);
        if(index==-1){// not found
            System.out.println("The word \'"+text2+"\' is not found in the word \'"+text1+"\'.");
        }
        else{
            System.out.println("The word \'"+text2+"\' is found in the word \'"+text1+"\'.");
        }
    }
}
