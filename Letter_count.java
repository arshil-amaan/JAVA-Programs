import java.util.*;

public class Letter_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello World! 23 @ A";
        // String str = sc.nextLine();
        int vowel_count = 0;
        int consonent_count = 0;
        // pre clean string
        String newStr = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(newStr);
        char[] strArr = newStr.toCharArray();
        for (char ch : strArr) {
            // alternative cleaning
            // Character.isLetter(ch) then proceed as below
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel_count++;
            } else {
                consonent_count++;
            }
        }
        System.out.println("Vowels Count - " + vowel_count);
        System.out.println("Consonents Count - " + consonent_count);
        sc.close();
    }
}
