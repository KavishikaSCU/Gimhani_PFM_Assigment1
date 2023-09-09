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
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            //Input the assigment name
            System.out.println("Please enter the name for the assigment : ");
            String assigmentName = input.nextLine();   
            
            // Input student's marks
            double[] assigmentMarks = new double[10];
            for(int i=0;i < assigmentMarks.length; i++) { 
                System.out.println("Assigment Mark " + (i+1));
                
              //check validation of the input marks
                double assigmentMark = getValidMarks(input);
                assigmentMarks[i] = assigmentMark;
            }
                
            //Print the assigment name
            System.out.println("\nAssignment: " +assigmentName);
        
        // Call functions 
        double highestMark = findHighestMark(assigmentMarks);
        double minimumMark = findMimumMark(assigmentMarks);
        double mean = findMean(assigmentMarks);
        double stanardDeviation = findStandardDeviation(assigmentMarks,mean);
          
        // Print results
        for (int i = 0; i < assigmentMarks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + assigmentMarks[i]);
        }
        System.out.println("The Highest Mark is : " +highestMark);
        System.out.println("The Minimum Mark is : " +minimumMark);
        System.out.println("The Mean mark is : "+mean );
        System.out.println("The Stand Deviation mark is : "+stanardDeviation);
        
    }     
    
    //Function no 1 to get valid marks from the user

    public static double getValidMarks(Scanner input){
      while (true){
           System.out.println("Please Enter a Valid marks between 0-30 : ");
            double assigmentmark = input.nextDouble();
               if(assigmentmark >=0 && assigmentmark <= 30){
                    return assigmentmark;
                }
                else{
                   System.out.println("Invalid mark. Please Enter mark between 0 and 30.");
                }
        }
   }
    
    // Function no 2 to find maximum mark from the marks
    public static double findHighestMark(double[]assigmentMarks){
        double highestMarks = assigmentMarks[0];
        for (int i = 0; i < assigmentMarks.length; i++){
            if (assigmentMarks[i] > highestMarks){
                highestMarks = assigmentMarks[i];
            }
        }
        return highestMarks;
    }
    
    // Function no 2 to find minimum mark from the marks
    public static double findMimumMark(double[]assigmentMarks){
        double minimumMarks = assigmentMarks[0];
        for (int i = 0; i < assigmentMarks.length; i++){
            if (assigmentMarks[i] < minimumMarks){
                minimumMarks = assigmentMarks[i];
            }
        }
        return minimumMarks;
    }
    
    // Function no 3 to  find mean of the marks
    public static double findMean(double[]assigmentMarks){
        double sum = 0;
        for (double assigmentMark : assigmentMarks){
            sum += assigmentMark;
        }
        double mean = sum / assigmentMarks.length;
        return mean; 
    }
    
    // Function no 4 to find starndard deviation from the marks
    public static double findStandardDeviation(double[] assigmentMarks,double mean){
        double sumOfDifferences = 0;
        double difference = 0;
        double variance;
        for  (double assigmentMark : assigmentMarks){
            difference = assigmentMark - mean;
            sumOfDifferences += difference * difference; 
        }
        variance = sumOfDifferences / assigmentMarks.length;
        return Math.sqrt(variance);
    }
}

    
       
    

    
    

