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

        // Program ends
        System.out.println("Program executed successfully.");
    }

}

