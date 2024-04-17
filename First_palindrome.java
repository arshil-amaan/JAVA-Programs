import java.util.*;

public class First_palindrome {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] stArr = { "abc", "def", "madam", "abcba", "defedf", "madamadam" }; // madam
        for (int i = 0; i < stArr.length; i++) {
            if (isPalindrome(stArr[i])) {
                System.out.println(stArr[i]);
                break;
            }
        }
        sc.close();
    }
}
