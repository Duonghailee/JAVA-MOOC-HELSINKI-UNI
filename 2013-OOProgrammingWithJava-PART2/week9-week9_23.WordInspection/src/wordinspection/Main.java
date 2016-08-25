package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here
        File file = new File("src/shortList.txt");
        WordInspection test = new WordInspection(file);
        
        // all words are in file src/wordList.txt
        String str = "saippuakauppias";
        System.out.println(test.isPalindromes(str));
    }
}
