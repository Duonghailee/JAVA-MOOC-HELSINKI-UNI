
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here the main program
       ArrayList<Student> list = new ArrayList<Student>();
       while(true){
           System.out.println("name: ");
           String name = reader.nextLine();
           if(name.isEmpty()){
               break;
           }
           else{
             System.out.println("student number: ");
            String std = reader.nextLine();
            list.add(new Student(name,std));
           }
       }
       for(Student st : list){
           System.out.println(st);
       }
            
       // search function
        System.out.println("Give search term: ");
        String str = reader.nextLine();
        System.out.println("Result: ");
        for(Student st : list){
            if(st.getName().contains(str)){
                System.out.println(st);
            }
        }
    }
}
