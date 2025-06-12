package Basics;

public class SecondlargestNumber {

    public static void main(String[] args) {
        // Array of integers
        int arra[] = {23, 12, 67, 89, 54};
        int leng = arra.length;

        // Initialize variables to store the largest and second-largest values
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        // Loop through the array to find the largest and second-largest values
        for (int i = 0; i < leng; i++) {
            // Update largest and secondlargest
            if (arra[i] > largest) {
                secondlargest = largest;  // Update second largest
                largest = arra[i];        // Update largest
            }
            else if (arra[i] > secondlargest && arra[i] != largest) {
                secondlargest = arra[i];  // Update second largest
            }
        }

        // Print the second largest value
        System.out.println("Second largest number is: " + secondlargest);
    }
}
