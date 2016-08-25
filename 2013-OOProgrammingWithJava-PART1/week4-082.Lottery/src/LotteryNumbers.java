import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        // create a random objec to generate 
        Random lottery = new Random();
        for(int i=0; i <7; i++){
            int num = lottery.nextInt(39)+1;
            if(!containsNumber(num)){  
                numbers.add(num);
            }
            else{
                i--;
            }
        }
        // can use while(numbers.size<7
    }

    public boolean containsNumber(int number) {
        
        if(numbers.contains(number)){
            return true;
        }
        return false;
    }
}
