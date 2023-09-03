
/**
 * Write a description of class students here.
 *
 * @author (M.G.Gimhani Kavishika)
 * @Student ID (24097251)
 * @Date (3/9/2023)
 */

import java.util.Scanner;

public class students
{
    // instance variables - replace the example below with your own
    String assigmentName; 
    int marks;
     


        public static void main(String[] args){
            
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter the your Assigment name: ");
            
            assigmentName : input.nextLine();
            
            for(int i=0;i < marks.length; i++) {
                
            System.out.println("Enter a valid mark : " );
                marks = input.nextLine();
            
                if(marks >= 0 && marks <= 30) {
                    return marks;                    
                }
                
                else{
                    System.out.println("Invalid mark. Please Enter mark between 0 and 30.");
                }
                
            }
        }
    }
    
            
            
        
        // initialise instance variables
       
    

    
    

