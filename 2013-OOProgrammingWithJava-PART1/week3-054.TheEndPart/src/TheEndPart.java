import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String text = reader.nextLine();
        System.out.println("Length of the end part: ");
        int len = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + text.substring((text.length()-len)));
    }
}
