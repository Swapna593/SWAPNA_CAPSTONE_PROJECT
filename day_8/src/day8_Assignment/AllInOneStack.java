package day8_Assignment;

/*Understand how to use the Stack class for LIFO (Last In, First Out) operations.

Create a Stack of integers and:
Push 5 elements.
Pop the top element.
Peek the current top.
Check if the stack is empty.
Reverse a string using Stack:
Input a string from the user.
Use a stack to reverse and print the string.
Use Stack to check for balanced parentheses in an expression.
Input: (a+b) * (c-d)
Output: Valid or Invalid expression
Convert a decimal number to binary using Stack.*/
import java.util.*;

public class AllInOneStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> intStack = new Stack<>();
        for (int i = 1; i <= 5; i++) intStack.push(i);
        System.out.println(intStack);
        System.out.println(intStack.pop());
        System.out.println(intStack.peek());
        System.out.println(intStack.isEmpty());
        String input = sc.nextLine();
        Stack<Character> charStack = new Stack<>();
        for (char c : input.toCharArray()) charStack.push(c);
        StringBuilder rev = new StringBuilder();
        while (!charStack.isEmpty()) rev.append(charStack.pop());
        System.out.println(rev);
        String expr = sc.nextLine();
        System.out.println(isBalanced(expr) ? "Valid" : "Invalid");
        int num = sc.nextInt();
        System.out.println(decimalToBinary(num));
        sc.close();
    }

    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else if (ch == ')' && (stack.isEmpty() || stack.pop() != '(')) return false;
            else if (ch == '}' && (stack.isEmpty() || stack.pop() != '{')) return false;
            else if (ch == ']' && (stack.isEmpty() || stack.pop() != '[')) return false;
        }
        return stack.isEmpty();
    }

    static String decimalToBinary(int n) {
        if (n == 0) return "0";
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
        StringBuilder bin = new StringBuilder();
        while (!stack.isEmpty()) bin.append(stack.pop());
        return bin.toString();
    }
}
