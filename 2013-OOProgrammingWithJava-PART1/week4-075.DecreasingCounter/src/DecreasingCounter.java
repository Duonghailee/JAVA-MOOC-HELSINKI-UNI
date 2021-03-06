public class DecreasingCounter {
    private int value; 
    private int backupValue;// instance variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.backupValue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if(value>0){
            value--;
        }
     
    }

    // and here the rest of the methods
    // reset method
    public void reset(){
        value = 0;
    }
    
    // setintialValue method
    public void setInitial(){
        value = this.backupValue;
    }
}
