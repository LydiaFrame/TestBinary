/*
 * Program: TestBinary.java
 * Student: Lydia Frame 
 * Purpose: Create an array and search for an element using the binary search.
*/

import java.util.Scanner; 

public class TestBinary {
    
    public static void main(String[] args){

        // Array for the binary search
        int[] shelves = {1, 2, 3, 4, 5};

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Read an integer from the user
        System.out.print("Input shelve number; ");
        int userInput = input.nextInt();

        // Call the binary search with the input
        System.out.println(binarySearch(shelves, userInput));
        
        // Close the scanner
        input.close();

    }

    //Binary search method
    private static int binarySearch(int[] numbers, int find){

        int low = 0;
        int high = numbers.length -1;

        while (low <= high) {
            int middleP = (low + high) / 2;
            int middleNum = numbers[middleP];

            if (find == middleNum){
                return middleP;
            }
            if (find < middleNum){
                high = middleP -1;
            }
            else{
                low = middleP + 1;
            }
        }

        return -1;

    }
}
