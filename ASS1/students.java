import java.util.Scanner;
/**
 * Write a description of class students here.
 *
 * @author (M.G.Gimhani Kavishika)
 * @Student ID (24097251)
 * @Date (3/9/2023)
 * Assigment 1
 */

public class students
{
    // instance variables - replace the example below with your own
    String assigmentName; 
    

        public static void main(String[] args){
            double[] marks = new double[30];
            
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the your Assigment name: ");
            assigmentName : input.nextLine();   
            
           
            
            for(int i=0;i < marks.length; i++) {  
                System.out.println("Enter a valid mark : " );
                Scanner marksInput = new Scanner(System.in);
                marks[i] = marksInput.nextDouble();
                    if(marks[i] >=0 && marks[i] <= 30) {
                                          
                }
                
                else{
                    System.out.println("Invalid mark. Please Enter mark between 0 and 30.");
                }
                
            }
            
            //Find Highest mark from the marks list
            double highestMark = marks[0];
            
            for(int j =0; j<10 ; j++) {
           if(marks[j] > highestMark){
               highestMark = marks[j];
           }
        }
        //Print the highestMark
        
        System.out.println("The Highest Mark is : " +highestMark);
        
        //Find Minium mark from the marks list
        double miniumMark = marks[0];
        
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < miniumMark) {
                miniumMark = marks[i];
    }
}
}
}
    
            
            
        
        // initialise instance variables
       
    

    
    

