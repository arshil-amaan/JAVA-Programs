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

        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1:
                System.out.println("Length: " + input.length());
                break;
            case 2:
                System.out.print("Enter an index: ");
                int index = scanner.nextInt();
                System.out.println("Character at index " + index + ": " + input.charAt(index));
                break;
            case 3:
                System.out.print("Enter begin index: ");
                int beginIndex = scanner.nextInt();
                System.out.print("Enter end index: ");
                int endIndex = scanner.nextInt();
                System.out.println("Substring from index " + beginIndex + " to " + endIndex + ": " + input.substring(beginIndex, endIndex));
                break;
            case 4:
                System.out.print("Enter a character: ");
                char ch = scanner.next().charAt(0);
                System.out.println("Index of first occurrence of " + ch + ": " + input.indexOf(ch));
                break;
            case 5:
                System.out.print("Enter a character: ");
                char ch2 = scanner.next().charAt(0);
                System.out.println("Index of last occurrence of " + ch2 + ": " + input.lastIndexOf(ch2));
                break;
            case 6:
                System.out.println("Uppercase: " + input.toUpperCase());
                break;
            case 7:
                System.out.println("Lowercase: " + input.toLowerCase());
                break;
            case 8:
                System.out.println("Trimmed: " + input.trim());
                break;
            case 9:
                System.out.print("Enter character to replace: ");
                char oldChar = scanner.next().charAt(0);
                System.out.print("Enter character to replace with: ");
                char newChar = scanner.next().charAt(0);
                System.out.println("Replaced: " + input.replace(oldChar, newChar));
                break;
            case 10:
                System.out.print("Enter regex to replace: ");
                String regex = scanner.next();
                System.out.print("Enter replacement string: ");
                String replacement = scanner.next();
                System.out.println("Replaced: " + input.replaceAll(regex, replacement));
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        
        scanner.close();
    }
}
