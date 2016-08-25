import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        if(text.equals(reverse(text))){
            return true;
        }
        return false;
    }
    
    // reversing method
    public static String reverse(String text) {
        String help = "";
        int len = text.length();
        for(int i=len-1;i>=0;i--){
            help += text.charAt(i);
        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
