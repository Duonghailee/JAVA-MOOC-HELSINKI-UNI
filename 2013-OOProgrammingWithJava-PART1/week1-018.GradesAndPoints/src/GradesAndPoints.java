
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int grade = Integer.parseInt(reader.nextLine());
        String ans = null ;
        if(grade>=0&&grade<=29)
            ans = "failed";
        else if(grade>=30&&grade<=34)
            ans = "1";
        else if(grade>=35&&grade<=39)
            ans = "2";
        else if(grade>=40&&grade<=44)
            ans = "3";
        else if(grade>=45&&grade<=49)
            ans = "4";
        else if(grade>=50&&grade<=60)
            ans = "5";
        else
            System.out.println("Please enter only from 0-60");
        System.out.println("Grade: " + ans );
    }
}
