import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.print("In reverse order: ");
        int len = name.length()-1;
        for(int i=len;i>=0;i-- ){
            System.out.print(name.charAt(i));
            
        }
    }
}
