import java.util.*;

public class Smallest_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char smallest_vowel = 'u';

        String[] vowels = { "a", "A", "e", "E", "i", "I", "o", "O", "u", "U" };
        for (int i = 0; i < vowels.length; ++i) {
            if (str.contains(vowels[i])) {
                smallest_vowel = vowels[i].charAt(0);
                break;
            }
        }

        // Alternate approach
        // String temStr = str;
        // temStr = str.toLowerCase();

        // for (int i = 0; i < temStr.length(); i++) {
        // if (temStr.charAt(i) < smallest_vowel && ((temStr.charAt(i) == 'a') ||
        // (temStr.charAt(i) == 'e')
        // || (temStr.charAt(i) == 'i') || (temStr.charAt(i) == 'o')
        // || (temStr.charAt(i) == 'u'))) {
        // smallest_vowel = str.charAt(i);
        // }
        // }
        System.out.println(smallest_vowel);
        sc.close();
    }
}
