
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    public boolean equals(Object o){
        if(!(o instanceof Bird)){
            return false;
        }
        Bird b = (Bird) o;
        return b.latinName.equals(this.latinName)&& b.ringingYear == this.ringingYear;
    }
    
    public int hashCode(){
        if(this.latinName == null){
            return this.ringingYear;
        }
        else{
            return this.ringingYear + this.latinName.hashCode();
        }
    }
}


