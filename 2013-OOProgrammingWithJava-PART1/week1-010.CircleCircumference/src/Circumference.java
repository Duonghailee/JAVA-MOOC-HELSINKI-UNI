
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the readius: ");
        int radius = reader.nextInt();
        double result = 2 * Math.PI * radius;
        System.out.println("\nCircumference of the circle: " + result);
        // Program your solution here 
    }
}
