
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000.0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        double ePrice = 2.50;
        if(cashGiven>=ePrice){
            this.cashInRegister+=ePrice;
            this.economicalSold++;
            return cashGiven - ePrice;
        }
        return cashGiven;
        
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double GPrice = 4.0;
        if(cashGiven>=GPrice){
            this.cashInRegister+=GPrice;
            this.gourmetSold++;
            return cashGiven - GPrice;
        }
        return cashGiven;
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    public boolean payEconomical (LyyraCard card){
        double ePrice = 2.50;
        if(card.balance()>=ePrice){
            card.pay(ePrice);
            this.economicalSold++;
            return true;
        }
        return false;
    }
    
    public boolean payGourmet (LyyraCard card){
        double GPrice = 4.00;
        if(card.balance()>=GPrice){
            card.pay(GPrice);
            this.gourmetSold++;
            return true;
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum>=0){
            card.loadMoney(sum);
            this.cashInRegister+=sum;
        }
    }
}