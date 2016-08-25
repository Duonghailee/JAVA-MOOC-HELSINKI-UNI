
import java.util.Scanner;
import java.util.*;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        boolean condition = true;
        while(condition){
            System.out.println("Type the password: ");
            String pass = reader.nextLine();
            if(pass.equals(password)){
                System.out.println("Right!");
                System.out.println("\nThe secret is: huhu");
                condition = false;  
            }
            else{
                System.out.println("Wrong!");
            }
        }
        // Write your code here
    }

}
