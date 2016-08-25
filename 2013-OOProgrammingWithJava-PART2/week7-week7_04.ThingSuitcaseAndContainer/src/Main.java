
public class Main {

    public static void main(String[] args) {
       Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    } 
    
    // addSUITCASEfuLLfoBRICK
    public static void addSuitcasesFullOfBricks(Container container){
        int weightOfBricks=1;
        while(weightOfBricks<=100){
            Thing brick = new Thing("Brick",weightOfBricks);
            Suitcase s = new Suitcase(weightOfBricks);
            s.addThing(brick);
            container.addSuitcase(s);
            weightOfBricks++;
        }
    }
}

