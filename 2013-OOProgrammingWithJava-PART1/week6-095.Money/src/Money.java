
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    // plus method
    public Money plus(Money added){
        int newEuro = this.euros + added.euros;
        int newCent = this.cents + added.cents;
        return new Money(newEuro, newCent);
    }
    
    // less method
    public boolean less(Money compared){
        if(this.euros<compared.euros){
            return true;
        }
        else if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }
    
    // minus method
    public Money minus(Money decremented){
       if(!this.less(decremented)){
           int newEuro = this.euros - decremented.euros;
           int newCent = this.cents - decremented.cents;
           if(newCent < 0){
               newCent = 100 + newCent;
               newEuro--;
           }
           return new Money(newEuro,newCent);
       }
       return new Money(0,0);
       
    }

}
