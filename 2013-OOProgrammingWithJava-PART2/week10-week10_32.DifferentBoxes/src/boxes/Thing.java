package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if(weight < 0){
            throw new IllegalArgumentException("weight should be positive");
        }
        else{
            this.name = name;
        this.weight = weight;
        }

        
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
   

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false; 
        }
        
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Thing other = (Thing) obj;
        if(this.name == null){
            return other.name == null;
        }
        else if( this.name != null) {
            return this.name.equals(other.name);
        }
        else{
             return true;  
        }
        
       
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 3 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

}
