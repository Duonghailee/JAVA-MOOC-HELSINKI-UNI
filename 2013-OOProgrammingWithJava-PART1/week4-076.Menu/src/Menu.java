
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    
    // add the methods here
    // printmeal method
    public void printMeals(){
        for(String meal : meals){
            System.out.println(meal);
        }
    }
    
    // add meal method
    public void addMeal(String meal){
        if(!meals.contains(meal)){
            this.meals.add(meal);
        }
    }
    
    // clearing a menu method
    public void clearMenu(){
        this.meals.clear();
    }
}
