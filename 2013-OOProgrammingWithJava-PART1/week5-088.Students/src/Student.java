/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Student {
    private String name;
    private String studentNumber ;
    
    // constructor
    public Student(String name, String studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;
    }
    
    // methods
    public String getName(){
        return name;
    }
    
    public String getStudentNumber(){
        return studentNumber;
    }
    
    public String toString(){
        return name + " (" + studentNumber +")";
    }
    
}
