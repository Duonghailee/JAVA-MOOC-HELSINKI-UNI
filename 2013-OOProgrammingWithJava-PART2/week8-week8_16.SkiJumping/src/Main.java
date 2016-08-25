
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       ui game = new ui(reader);
       game.start();
    }
}
