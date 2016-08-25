
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import javax.lang.model.element.Element;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class ui {
    private Scanner reader;
    private Info info;
    
    public ui(Scanner reader){
        this.reader = reader;
        info = new Info();
    }
    
    public void start(){
        System.out.println("phone search\n" +
"available operations:");
        System.out.println(" 1 add a number\n" +
            " 2 search for a number\n" +
            " 3 search for a person by phone number\n" +
            " 4 add an address\n" +
            " 5 search for personal information\n" +
            " 6 delete personal information\n" +
            " 7 filtered listing\n" +
            " x quit\n");
        while(true){
            System.out.println("");
            System.out.print("command: ");
            String ans = reader.nextLine();
            if(ans.equals("x")){
                break;
            }
            else if(ans.equals("1")){
                addNumber();
            }
            else if(ans.equals("2")){
                searchByName();
            }
            else if(ans.equals("3")){
                searchByPhone();
            }
            
            else if(ans.equals("4")){
                addAddress();
            }
            
            else if(ans.equals("5")){
                searchInfo();
            }
            
            else if(ans.equals("6")){
                DelInfo();
            }
            
            
            else if(ans.equals("7")){
                filter();
            }
            
            else{
                System.out.println("Please enter only 1-7 or x to quit");
            }
        }    
        
    }
    
    public void addNumber(){
        System.out.print("Whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        this.info.addNum(name, number);
    }
    
    public void searchByName(){
        System.out.print("whose number: ");
        String name = reader.nextLine();
        Set<String> phones = this.info.getPhone(name);
        if(phones.isEmpty()){
            System.out.println("  not found");
        }
        else{
            for(String phone : phones){
                System.out.println(" " + phone);
            }
        }
    }
    
    public void searchByPhone(){
        System.out.print("number: ");
        String num = reader.nextLine();
        String result = this.info.searchPerson(num);
        System.out.println(" " + result);
    }
    
    public void addAddress(){
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city= reader.nextLine();
        
        String add = street + " " + city;
        this.info.addAdd(name, add);
        
    }
    
    public void searchInfo(){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        if(this.info.isEmpty(name)){
            System.out.println("  not found");
        }
        else{
            printInfo(name);
        }
    }
    
    // support method to print info
    private void printInfo(String name){
        Set<String> adds = this.info.getAdd(name);
            if(adds.isEmpty()){
                System.out.println("  address unknown");
            }
            else{
                System.out.print("  address: ");
                for(String add : adds){
                    System.out.println(" " + add);
                }
            }
            //shoud declare into 2 method print number print address
            // print numbers
            Set<String> phones = this.info.getPhone(name);
            if(phones.isEmpty()){
                System.out.println("  phone number not found");
            }
            else{
                System.out.println("  phone numbers: ");
                for(String phone : phones){
                    System.out.println("   " + phone);
                }
            }
        
    }
    
    // del information
    public void DelInfo(){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        this.info.delete(name);
    }
    
    // filter listing
    public void filter(){
        System.out.print("key word (if empty, all listed): ");
        String key = reader.nextLine();
        
        //empty input
        if(key.isEmpty()){
            Set<String> newList = this.info.getName();
            TreeSet listName = new TreeSet();
            listName.addAll(newList);
            
            for (Iterator it = listName.iterator(); it.hasNext();) {
                String name = (String) it.next();
                System.out.println(name);
                printInfo(name);
                System.out.println("");
            }
        }
        
        else{
            boolean found = false;
            Set<String> newList = this.info.getName();
            TreeSet listName = new TreeSet();
            listName.addAll(newList);
            for (Iterator it = listName.iterator(); it.hasNext();) {
                String name = (String) it.next();
                if(name.contains(key)){
                    found = true;
                    System.out.println(name);
                    printInfo(name);
                }
            }
            
                /*TreeSet listAddress = this.info.getAllAdd();
                for (Iterator it = listAddress.iterator(); it.hasNext();) {
                    String add = (String) it.next();
                    if(add.contains(key)){
                        found = true;
                        System.out.println();
                        printInfo(add);
                }
            }*/
                // search by address
                List<String> nameList = this.info.getNameByAdd(key);
                if(nameList.size()!=0){
                    found = true;
                    for(String name : nameList){
                        System.out.println(name);
                        printInfo(name);
                    }
                }
                
            
            
            
            if(!found){
                System.out.println(" keyword not found");
            }
        // search in name
            
            
        }
                
        
        // search in address
       /* for(String add : this.info.getAllAdd()){
            if(name.contains(key)){
                System.out.println(name);
                printInfo(name);
            }
            else{
                System.out.println(" keyword not found");
            }
        }*/
        
    
    }
}
