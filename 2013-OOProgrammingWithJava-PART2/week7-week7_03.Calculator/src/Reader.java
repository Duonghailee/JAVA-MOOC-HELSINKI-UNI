
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Reader {
    private Scanner read;
    
    public Reader(){
        read = new Scanner(System.in);
    }
    public String readString(){
       
       return read.nextLine(); 
    }
    
    public int readInteger(){
        int num = Integer.parseInt(this.readString());
        return num;
    }
}
