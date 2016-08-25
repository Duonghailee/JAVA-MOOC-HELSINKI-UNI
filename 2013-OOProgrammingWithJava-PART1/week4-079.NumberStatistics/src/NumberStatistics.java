
public class NumberStatistics {
    private int amountOfNumber;
    private int sum;
    
    public NumberStatistics(){
        this.amountOfNumber = 0;
        this.sum = 0;
       
    }
    
    public void addNumber(int number){
        amountOfNumber ++;
        sum+= number;
        
    }
    
    public int amountOfNumbers(){
        return amountOfNumber;
    }
    
    public int sum(){
        return sum; 
        
    }
    
    public double average(){
        if(amountOfNumbers()!=0)
            return (double)sum/amountOfNumbers();
        else
            return 0;
    }
}

