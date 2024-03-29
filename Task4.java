package Array;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Initialize a variable to store the sum of array elements
        float SumOfarray = 0;
        
        // Print a welcome message
        System.out.println("Welcome to calculate the summation");
        
        // Create a 2D array with dimensions 5x3
        float[][] arr = new float[5][3];

        // Iterate over each element of the array
        for (int i = 0; i < 5; i++) {
            System.out.println("Row number " + (i + 1));
            for (int j = 0; j < 3; j++) {
                // Prompt the user to enter each element and read it into the array
                System.out.println("Please enter element number " + (j + 1));
                arr[i][j] = input.nextFloat();
                
                // Add each element to the sum
                SumOfarray += arr[i][j];
            }
        }
        
        // Print the sum of the elements of the array
        System.out.println("The sum of the elements of the array = " + SumOfarray);
        
        input.close();
    }
}
