
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
            printWithSmileys("Method");
            printWithSmileys("Beerbottle");
             printWithSmileys("Interface");
        // System.out.println("");
         //printWithSmileys("\\:D/");
       
    }
    
    private static void printWithSmileys(String str){
        //print top
        String middle = middleString(str);
        int number = middle.length() / 2 + 2;
        printTop(number);
        System.out.println(":)" + middle + ":)");
        printTop(number);
  
    }
    
    // return middlestring
    private static String middleString(String str){
        if(str.length()%2!=0){
            return " " + str + " " + " ";
        }
        else{
            return " " + str + " ";
        }
    }
    
    // printTop
    private static void printTop(int number){
        for(int i=0; i< number ;i++){
            System.out.print(":)");
        }
        System.out.println("");
    }
}
