
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int sum = 0;
        for(int i=0;i<=num;i++){
            int result = (int)Math.pow(2, i);
            sum += result;
        }
        System.out.println("The result is " + sum);

    }
}
