import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
      Scanner reader = new Scanner(System.in) ; 
      NumberStatistics stats = new NumberStatistics();
      NumberStatistics statsEven = new NumberStatistics();
      NumberStatistics statsOdd = new NumberStatistics();
      while(true){
        System.out.println("Type numbers");
        int num = Integer.parseInt(reader.nextLine());
        if(num==-1){
            break;
        }
        else{
            stats.addNumber(num); 
            if(num%2==0){
                 statsEven.addNumber(num);
            }
        
            else {
                statsOdd.addNumber(num);
            }
        }
      }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + statsEven.sum());
        System.out.println("sum od odd: " + statsOdd.sum());

    }
}
