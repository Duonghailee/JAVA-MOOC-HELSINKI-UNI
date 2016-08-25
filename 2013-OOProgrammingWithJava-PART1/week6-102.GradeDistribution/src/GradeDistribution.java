
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
public class GradeDistribution {
    private final int[] gradeCount = new int[6];
    private final Scanner reader = new Scanner(System.in);
    // storing number of grade 5,4,3,2,1,0 into array;
    
    // start method
    public void start(Scanner reader){
        System.out.println("Type exam scores, -1 completes: ");
         while(true){
            int num = Integer.parseInt(reader.nextLine());
            if(num==-1){
                break;
            }
            if(num>60){
                continue;
            }
            int grade = this.gradeReturn(num);
             if(grade==5){
                gradeCount[0]++;
            }
            else if(grade==4){
                gradeCount[1]++;
            }
             else if(grade==3){
                gradeCount[2]++;
            }
            else if(grade==2){
                gradeCount[3]++;
            }
            else if(grade==1){
                gradeCount[4]++;
            }
            else if(grade==0){
                gradeCount[5]++;
            }

        }
    }
    // grade return method
    public int gradeReturn(int grade){
        
        if(grade>=0&&grade<=29)
            return 0;
        else if(grade>=30&&grade<=34)
            return 1;
        else if(grade>=35&&grade<=39)
            return 2;
        else if(grade>=40&&grade<=44)
            return 3;
        else if(grade>=45&&grade<=49)
            return 4;
        else if(grade>=50&&grade<=60)
            return 5;
        else
            return -1;
    } 

    // print restult method
    public void printResult(){
        System.out.println("Grade distribution: ");
        for(int i=5;i>=0;i--){
            printStars(i,gradeCount[5-i]);
            
        }
        int accept = 0;
        for(int i=0;i<gradeCount.length-1;i++){
            accept+=gradeCount[i];
        }
        double ratioOfAccept = 100 * (double)accept / (accept+gradeCount[5]);
        System.out.println("Acceptance percentage: " + ratioOfAccept);
    }
    
    
    
    // printStars method
    public void printStars(int grade,int howMany){
        System.out.print(grade + ": ");
        for(int i=0; i<howMany;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
         
    }

