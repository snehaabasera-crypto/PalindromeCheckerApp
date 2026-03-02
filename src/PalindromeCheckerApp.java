
import java.util.Stack;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
public class PalindromeCheckerApp {
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome4(String str, int start, int end) {

        // Base Condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome4(str, start + 1, end - 1);
    }

    static class PalindromeChecker {

        // Method to check palindrome using character array (Two-pointer approach)
        public boolean checkPalindrome(String input) {

            if (input == null) {
                return false;
            }

            char[] characters = input.toCharArray();

            int start = 0;
            int end = characters.length - 1;

            while (start < end) {
                if (characters[start] != characters[end]) {
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }
    }

    interface PalindromeStrategy {
        boolean check(String input);
    }

    static class StackStrategy implements PalindromeStrategy {

        @Override
        public boolean check(String input) {

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }

    class DequeStrategy implements PalindromeStrategy {

        @Override
        public boolean check(String input) {

            Deque<Character> deque = new LinkedList<>();

            for (int i = 0; i < input.length(); i++) {
                deque.addLast(input.charAt(i));
            }

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }

            return true;
        }
    }

    static class PalindromeService {

        private PalindromeStrategy strategy;

        public PalindromeService(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String input) {
            return strategy.check(input);
        }
    }

    // Two-Pointer Method
    public static boolean twoPointerCheck(String str) {

        int start2 = 0;
        int end2 = str.length() - 1;

        while (start2 < end2) {
            if (str.charAt(start2) != str.charAt(end2)) {
                return false;
            }
            start2++;
            end2--;
        }

        return true;
    }

    // Stack Method
    public static boolean stackCheck(String str) {

        Stack<Character> stack1 = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack1.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack1.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque Method
    public static boolean dequeCheck(String str) {

        Deque<Character> deque1 = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            deque1.addLast(str.charAt(i));
        }

        while (deque1.size() > 1) {
            if (deque1.removeFirst() != deque1.removeLast()) {
                return false;
            }
        }

        return true;
    }




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

        String input2 = "level";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack1 = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input2.length(); i++) {
            char ch = input2.charAt(i);
            queue.add(ch);     // Enqueue (FIFO)
            stack1.push(ch);    // Push (LIFO)
        }

        boolean isPalindrome1 = true;

        // Compare Dequeue and Pop
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // Dequeue
            char fromStack = stack1.pop();    // Pop

            if (fromQueue != fromStack) {
                isPalindrome1 = false;
                break;
            }
        }

        // Display result
        if (isPalindrome1) {
            System.out.println("Original String : " + input2);
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Original String : " + input2);
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");

        String input3 = "racecar";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque (rear)
        for (int i = 0; i < input3.length(); i++) {
            deque.addLast(input3.charAt(i));
        }

        boolean isPalindrome2 = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst(); // Remove from front
            char rear = deque.removeLast();   // Remove from rear

            if (front != rear) {
                isPalindrome2 = false;
                break;
            }
        }

        // Display result
        if (isPalindrome2) {
            System.out.println("Original String : " + input3);
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Original String : " + input3);
            System.out.println("Result : It is NOT a Palindrome.");
        }
        String input4 = "madam";

        // Step 1: Convert String to Linked List
        Node head = null;
        Node tail = null;

        for (int i = 0; i < input4.length(); i++) {
            Node newNode = new Node(input4.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 2: Find middle using Fast & Slow pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Reverse second half (In-place reversal)
        Node prev = null;
        Node current = slow;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Step 4: Compare first half and reversed second half
        Node firstHalf = head;
        Node secondHalf = prev;

        boolean isPalindrome3 = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome3 = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Display Result
        if (isPalindrome3) {
            System.out.println("Original String : " + input4);
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Original String : " + input4);
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");

        String input5 = "level";

        boolean result = isPalindrome4(input, 0, input5.length() - 1);

        if (result) {
            System.out.println("Original String : " + input5);
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Original String : " + input5);
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");

        String input6 = "A man a plan a canal Panama";

        // Step 1: Normalize String
        String normalized = input6.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Apply palindrome logic (Two-pointer approach)
        boolean isPalindrome5 = true;

        int start1 = 0;
        int end1 = normalized.length() - 1;

        while (start1 < end1) {
            if (normalized.charAt(start1) != normalized.charAt(end1)) {
                isPalindrome5 = false;
                break;
            }
            start1++;
            end1--;
        }

        // Display result
        System.out.println("Original String   : " + input6);
        System.out.println("Normalized String : " + normalized);

        if (isPalindrome5) {
            System.out.println("Result : It is a Palindrome (Ignoring spaces & case).");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");


        String input7 = "radar";

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        // Call encapsulated method
        boolean result1 = checker.checkPalindrome(input);

        // Display result
        System.out.println("Input String : " + input7);

        if (result1) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");

        String input8 = "racecar";

        // Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();
        // Try changing to: new DequeStrategy();

        PalindromeService service = new PalindromeService(strategy);

        boolean result2 = service.execute(input8);

        System.out.println("Input String : " + input8);

        if (result2) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Strategy Used : " + strategy.getClass().getSimpleName());
        System.out.println("Program executed successfully.");

        String input9 = "AmanaplanacanalPanama";
        input9 = input9.toLowerCase();

        System.out.println("Input String : " + input9);
        System.out.println("--------------------------------------");

        // 1️⃣ Two-Pointer Approach
        long start2 = System.nanoTime();
        boolean result3 = twoPointerCheck(input);
        long end2= System.nanoTime();

        // 2️⃣ Stack Approach
        long start3 = System.nanoTime();
        boolean result4 = stackCheck(input);
        long end3 = System.nanoTime();

        // 3️⃣ Deque Approach
        long start4 = System.nanoTime();
        boolean result5 = dequeCheck(input);
        long end4 = System.nanoTime();

        // Display Results
        System.out.println("Two-Pointer Result : " + result3);
        System.out.println("Execution Time     : " + (end2 - start2) + " ns");
        System.out.println();

        System.out.println("Stack Result       : " + result4);
        System.out.println("Execution Time     : " + (end3 - start3) + " ns");
        System.out.println();

        System.out.println("Deque Result       : " + result5);
        System.out.println("Execution Time     : " + (end4 - start4) + " ns");
        System.out.println();

        System.out.println("Program executed successfully.");



    }

}



