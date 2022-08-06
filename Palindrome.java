import java.util.Scanner;

public class Palindrome {
    static Boolean checkPalindrome(String str) {
        String reverseString = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reverseString = ch + reverseString;
        }
        if (str.equals(reverseString)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be checked as palindrome:");
        String input = sc.nextLine();
        System.out.println(checkPalindrome(input));
        sc.close();
    }
}
