import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;
        while(true){
            int num = Integer.parseInt(reader.nextLine());
            sum += num;
            count += 1;
            if(num%2==0){
                evenCount+=1;
            }
            else
                oddCount +=1;
            if(num==-1){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + (sum+1));
                System.out.println("How many numbers: " + (count-1));
                double avg =  (double)(sum+1)/(count-1);
                System.out.println("Average: " + avg);
                System.out.println("Even numbers: " + evenCount);
                System.out.println("Odd numbers: " + (oddCount-1));
                break;
            }
        }
        
    }
}
