
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = reader.nextInt();
        System.out.print("Type another number: ");
        int div = reader.nextInt();
        double result = 1.0 * num / div;
        System.out.println("\nDivision: " + num + " / " + div + " = " + result );
        // Implement your program here. Remember to ask the input from user.
    }
}
