
import java.util.Stack;
public class PalindromeCheckerApp {


    public static void main(String[] args) {


        System.out.println("=======================================");
        System.out.println("      WELCOME TO PALINDROME CHECKER    ");
        System.out.println("=======================================");



        System.out.println("Application Name : PalindromeChecker App");
        System.out.println("Version          : 1.0");
        System.out.println("---------------------------------------");


        System.out.println("Application started successfully.");
        System.out.println("Ready to proceed to palindrome validation...");

        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }


        System.out.println("Program executed successfully.");

        String original = "level";


        String reversed1 = "";


        for (int i = original.length() - 1; i >= 0; i--) {
            reversed1 = reversed1 + original.charAt(i);
        }


        if (original.equals(reversed1)) {
            System.out.println("Original String : " + original);
            System.out.println("Reversed String : " + reversed1);
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Original String : " + original);
            System.out.println("Reversed String : " + reversed1);
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");

        String input = "radar";

        // Convert String to Character Array
        char[] characters = input.toCharArray();

        // Two-pointer variables
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Original String : " + input);
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Original String : " + input);
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");

        String input1 = "madam";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input1.length(); i++) {
            stack.push(input1.charAt(i));
        }

        // Variable to store reversed string
        String reversed2 = "";

        // Pop characters from stack
        while (!stack.isEmpty()) {
            reversed2 = reversed2 + stack.pop();
        }

        // Compare original and reversed
        if (input.equals(reversed2)) {
            System.out.println("Original String : " + input1);
            System.out.println("Reversed String : " + reversed2);
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Original String : " + input1);
            System.out.println("Reversed String : " + reversed2);
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }

}

