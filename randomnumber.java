import java.util.Random;

public class RandomNumber {
   public static void main(String[] args) {
     // Variable totalSum will store all generated numbers
      int totalSum = 0; 
      // Variable aboveAverageCount is for numbers above average
      int aboveAverageCount = 0;
      double average; 
      // Create a Random Object
      Random randomNumbGenerator = new Random();
      // Array will store the random numbers
      int[] numbersArray = new int[100];    
      
      for (int i = 0; i < numbersArray.length; i++) {
         numbersArray[i] = randomNumbGenerator.nextInt(200); 
         // Generate random integer below 200 and store it in the array
         totalSum += numbersArray[i];    
         // Add the generated number to totalSum
      }
      // Calculate the average
      average = totalSum / 100.0; 
      
      for (int i = 0; i < numbersArray.length; i++) {
         if(numbersArray[i] > average)    
         // Check if the number is above average
         {
             aboveAverageCount++; 
         }
      }
      
      // Print the solutions
      System.out.printf("The sum of randomly generated 100 integers is : %d\n", totalSum);
      System.out.printf("The average of randomly generated 100 integers is : %f\n", average);
      System.out.printf("The count of randomly generated numbers that are above average is : %d\n", aboveAverageCount);
   }
}