
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Start your program here
        Scanner reader = new Scanner(System.in);
        ui phonebook = new ui(reader);
        phonebook.start();
        // ATTENTION: In your program, you can create only one instance of class Scanner!
    }
}
