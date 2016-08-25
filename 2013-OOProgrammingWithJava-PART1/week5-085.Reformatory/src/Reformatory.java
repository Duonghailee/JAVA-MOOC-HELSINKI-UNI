public class Reformatory {
private int weightCount = 0;
    public int weight(Person person) {
        // return the weight of the person
        weightCount ++;
        return person.getWeight();
        
    }
    // increase weight
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
        
    }
    
    // totalWeightmeasure
    public int totalWeightsMeasured(){
        return this.weightCount;
    }

}
