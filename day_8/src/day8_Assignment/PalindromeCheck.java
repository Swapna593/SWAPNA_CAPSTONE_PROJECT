package day8_Assignment;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        Deque<Character> dq = new LinkedList<>();
        for (char c : s.toCharArray()) dq.add(c);
        while (dq.size() > 1) {
            if (!dq.pollFirst().equals(dq.pollLast())) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        System.out.println(isPalindrome(input) ? "Palindrome" : "Not a palindrome");
    }
}
