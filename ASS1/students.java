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
     
    

        public static void main(String[] args){
            //String assigmentName;
            double[] marks = new double[30];
            
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the your Assigment name: ");
            String assigmentName = input.nextLine();   
            
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
            //Print the assigment name
            System.out.println("\nAssignment: " +assigmentName);
            
            //Print the assigment Marks
             for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
            }
            //Find Highest mark from the marks list
            double highestMark = marks[0];
            
            for(int j =0; j<marks.length; j++) {
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
        //Print the Minimum mark from the marks list
        System.out.println("The Minimum Mark is : " +miniumMark);
        
        //Find Mean of marks from the marks list
        double sum = 0;
        double mean;
        
        for (double mark : marks){
            sum += mark;
        }
        mean = sum / marks.length;
        //Print the Mean of marks from the marks list
        System.out.println("The Mean mark is : "+mean );
        
        //Find Stand Deviation of the marks from the marks list
        double difference = 0;
        double sumOfDifferences = 0;
        double variance;
        
        for(double mark : marks){
            difference = mark - mean; 
            sumOfDifferences += difference * difference;
        }
        variance = sumOfDifferences/marks.length;
        //Print the Stand Deviation of marks 
        System.out.println("The Stand Deviation mark is : "+variance);
    }
}
    
            
            
        
        // initialise instance variables
       
    

    
    

