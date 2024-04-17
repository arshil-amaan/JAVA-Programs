// import java.util.*;

public class test {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int num = 1;
        char ch = '2';
        String str = "32";

        int ch2num = Character.getNumericValue(ch);
        int str2num = Integer.parseInt(str);
        char num2ch = (char) (num + '0'); // Assuming num is a single-digit number
        char str2ch = str.charAt(0);
        String num2str = String.valueOf(num);
        String ch2str = String.valueOf(ch);

        System.out.println("ch2num: " + ch2num); // Output: 2
        System.out.println("str2num: " + str2num); // Output: 3
        System.out.println("num2ch: " + num2ch); // Output: '1'
        System.out.println("str2ch: " + str2ch); // Output: '3'
        System.out.println("num2str: " + num2str); // Output: "1"
        System.out.println("ch2str: " + ch2str); // Output: "2"


        // sc.close();
    }
}