package Basics;
public class RepetitiveCharacterCount {
    public static void main(String[] args) {
        // Define the input string
        String input = "aacbbdddqq";

        // Call the method to count consecutive repetitive characters
        countRepetitiveCharacters(input);
    }

    // Method to count repetitive characters
    public static void countRepetitiveCharacters(String str) {
        // Check if the string is empty or null
        if (str == null || str.isEmpty()) {
            System.out.println("Input string is empty or null.");
            return;
        }

        // Initialize a variable to track the current character and its count
        char currentChar = str.charAt(0);
        int count = 1;

        // Loop through the string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                // If the current character is the same as the previous, increment the count
                count++;
            } else {
                // If the character changes, print the previous character and its count
                System.out.print(currentChar);
                if (count > 1) {
                    System.out.print("-" + count);
                }
                System.out.print(" ");
                
                // Update the current character and reset the count
                currentChar = str.charAt(i);
                count = 1;
            }
        }

        // Print the last group of characters
        System.out.print(currentChar);
        if (count > 1) {
            System.out.print("-" + count);
        }
        System.out.println();
    }
}
