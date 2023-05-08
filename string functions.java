import java.util.Scanner;

public class StringFunctions {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println("\nSelect a function to perform:");
        System.out.println("1. length()");
        System.out.println("2. charAt(int index)");
        System.out.println("3. substring(int beginIndex, int endIndex)");
        System.out.println("4. indexOf(char ch)");
        System.out.println("5. lastIndexOf(char ch)");
        System.out.println("6. toUpperCase()");
        System.out.println("7. toLowerCase()");
        System.out.println("8. trim()");
        System.out.println("9. replace(char oldChar, char newChar)");
        System.out.println("10. replaceAll(String regex, String replacement)");
        System.out.println("11. split(String regex)");
        System.out.println("12. startsWith(String prefix)");
        System.out.println("13. endsWith(String suffix)");
        System.out.println("14. contains(CharSequence sequence)");
        System.out.println("15. codePointAt(int index)");
        System.out.println("16. codePointBefore(int index)");
        System.out.println("17. codePointCount(int beginIndex, int endIndex)");

        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1:
                // length() function returns the length of the string
                System.out.println("Length: " + input.length());
                break;
            case 2:
                // charAt(int index) function returns the character at the specified index
                System.out.print("Enter an index: ");
                int index = scanner.nextInt();
                System.out.println("Character at index " + index + ": " + input.charAt(index));
                break;
            case 3:
                // substring(int beginIndex, int endIndex) function returns a substring of the string
                // from the specified begin index (inclusive) to the specified end index (exclusive)
                System.out.print("Enter begin index: ");
                int beginIndex = scanner.nextInt();
                System.out.print("Enter end index: ");
                int endIndex = scanner.nextInt();
                System.out.println("Substring from index " + beginIndex + " to " + endIndex + ": " + input.substring(beginIndex, endIndex));
                break;
            case 4:
                // indexOf(char ch) function returns the index of the first occurrence of the specified character in the string
                System.out.print("Enter a character: ");
                char ch = scanner.next().charAt(0);
                System.out.println("Index of first occurrence of " + ch + ": " + input.indexOf(ch));
                break;
            case 5:
                System.out.print("Enter a character to search: ");
                char ch = sc.next().charAt(0);
                int lastIndex = str.lastIndexOf(ch);
                if (lastIndex == -1) {
                    System.out.println("Character not found");
                } else {
                    System.out.println("Last index of " + ch + " is " + lastIndex);
                }
                break;
            case 6:
                // toUpperCase() function returns a new string with all the characters in uppercase
                System.out.println("Uppercase string: " + input.toUpperCase());
                break;
            case 7:
                // toLowerCase() function returns a new string with all the characters in lowercase
                System.out.println("Lowercase string: " + input.toLowerCase());
                break;
            case 8:
                // trim() function returns a new string with leading and trailing whitespace removed
                System.out.println("Trimmed string: " + input.trim());
                break;
            case 9:
                // replace(char oldChar, char newChar) function replaces all occurrences of the specified oldChar with the newChar
                System.out.print("Enter old character: ");
                char oldChar = scanner.next().charAt(0);
                System.out.print("Enter new character: ");
                char newChar = scanner.next().charAt(0);
                System.out.println("Replaced string: " + input.replace(oldChar, newChar));
                break;
            case 10:
                System.out.print("Enter a substring to replace: ");
                String oldSubstr = sc.next();
                
                System.out.print("Enter a replacement string: ");
                String newSubstr = sc.next();
                
                // Replace all occurrences of old substring with new substring
                String replacedStr = str.replaceAll(oldSubstr, newSubstr);
                
                // Display original and replaced strings
                System.out.println("Original string: " + str);
                System.out.println("Replaced string: " + replacedStr);
                break;
            case 11:
                // split(String regex) function splits the string into an array of substrings based on the specified regular expression
                System.out.print("Enter regular expression: ");
                String regex = scanner.nextLine();
                String[] substrings = input.split(regex);
                System.out.println("Substrings:");
                for (String substring : substrings) {
                    System.out.println(substring);
                }
                break;
            case 12:
                // startsWith(String prefix) function returns true if the string starts with the specified prefix, false otherwise
                System.out.print("Enter a prefix: ");
                String prefix = scanner.nextLine();
                System.out.println("Starts with " + prefix + ": " + input.startsWith(prefix));
                break;
            case 13:
                // endsWith(String suffix) function returns true if the string ends with the specified suffix, false otherwise
                System.out.print("Enter a suffix: ");
                String suffix = scanner.nextLine();
                System.out.println("Ends with " + suffix + ": " + input.endsWith(suffix));
                break;
            case 14:
                // contains(CharSequence sequence) function returns true if the string contains the specified sequence, false otherwise
                System.out.print("Enter a sequence: ");
                String sequence = scanner.nextLine();
                System.out.println("Contains " + sequence + ": " + input.contains(sequence));
                break;
            case 15:
                // codePointAt(int index) function returns the Unicode code point at the specified index in the string
                System.out.print("Enter an index: ");
                int idx1 = scanner.nextInt();
                System.out.println("Code point at index " + idx1 + ": " + input.codePointAt(idx1));
                break;
            case 16:
                // codePointBefore(int index) function returns the Unicode code point before the specified index in the string
                System.out.print("Enter an index: ");
                int idx2 = scanner.nextInt();
                System.out.println("Code point before index " + idx2 + ": " + input.codePointBefore(idx2));
                break;
            case 17:
                // Get the number of Unicode code points in the string
                System.out.print("Enter the start index: ");
                int startIndex = sc.nextInt();
                System.out.print("Enter the end index: ");
                int endIndex = sc.nextInt();
                int numCodePoints = str.codePointCount(startIndex, endIndex);
                System.out.println("Number of code points: " + numCodePoints);
                break;
            case 16:
                // regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) function checks if the specified region of this string matches the specified region of the other string
                System.out.print("Enter other string: ");
                String other = scanner.nextLine();
                System.out.print("Enter toffset: ");
                int toffset = scanner.nextInt();
                System.out.print("Enter ooffset: ");
                int ooffset = scanner.nextInt();
                System.out.print("Enter length: ");
                int len = scanner.nextInt();
                System.out.print("Enter ignore case? (true/false): ");
                boolean ignoreCase = scanner.nextBoolean();
                System.out.println("Matched: " + input.regionMatches(ignoreCase, toffset, other, ooffset, len));
                break;
            case 17:
                // startsWith(String prefix) function tests if this string starts with the specified prefix
                System.out.print("Enter prefix: ");
                String prefix = scanner.nextLine();
                System.out.println("Starts with prefix? " + input.startsWith(prefix));
                break;
            case 18:
                // endsWith(String suffix) function tests if this string ends with the specified suffix
                System.out.print("Enter suffix: ");
                String suffix = scanner.nextLine();
                System.out.println("Ends with suffix? " + input.endsWith(suffix));
                break;
            case 19:
                // compareTo(String anotherString) function compares two strings lexicographically
                System.out.print("Enter another string: ");
                String anotherString = scanner.nextLine();
                int result = input.compareTo(anotherString);
                if (result < 0) {
                    System.out.println("Input string is lexicographically less than another string");
                } else if (result > 0) {
                    System.out.println("Input string is lexicographically greater than another string");
                } else {
                    System.out.println("Input string is lexicographically equal to another string");
                }
                break;
            case 20:
                // compareToIgnoreCase(String str) function compares two strings lexicographically, ignoring case differences
                System.out.print("Enter another string: ");
                String str = scanner.nextLine();
                result = input.compareToIgnoreCase(str);
                if (result < 0) {
                    System.out.println("Input string is lexicographically less than another string (ignore case)");
                } else if (result > 0) {
                    System.out.println("Input string is lexicographically greater than another string (ignore case)");
                } else {
                    System.out.println("Input string is lexicographically equal to another string (ignore case)");
                }
                break;
            
            default:
                System.out.println("Invalid choice!");
                break;
        }
        
        scanner.close();
    }
}
