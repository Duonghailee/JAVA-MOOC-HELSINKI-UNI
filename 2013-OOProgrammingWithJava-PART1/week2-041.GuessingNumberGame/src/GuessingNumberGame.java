
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessCount = 0;
        while(true){
        System.out.println("Guess a number: ");
        int num = Integer.parseInt(reader.nextLine());
        if(num==numberDrawn){
            System.out.println("Congratulations, your guess is correct!");
            break;
        }
        else if(num>numberDrawn) {
            guessCount++;
            System.out.println("The number is lesser, guess made: " + guessCount);
            
        }
        else{
            guessCount++; 
            System.out.println("The number is greater, guess made: " + guessCount);
               
        }
        // program your solution here. Do not touch the above lines!
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
