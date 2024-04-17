// import java.util.*;

public class Type_conversions {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int num = 123;
        char ch = '4';
        String str = "567";

        int ch2num = Character.getNumericValue(ch);
        int str2num = Integer.parseInt(str);
        char num2ch = (char) (num + '0'); // Assuming num is a single-digit number
        char anyNum2chFD = Integer.toString(num).charAt(0); // any no. of digit num, left most digit of num
        char anyNum2chLD = (char) (num%10+'0'); // any no. of digit num, righ most digit of num
        char str2chFD = str.charAt(0); // any no. of character String, left most charachet of String
        char str2chLD = str.charAt(str.length()-1); // any no. of character String, right most charachet of String
        String num2str = String.valueOf(num);
        String ch2str = String.valueOf(ch);

        System.out.println("ch2num: " + ch2num); // Output: 4
        System.out.println("str2num: " + str2num); // Output: 567
        System.out.println("anyNum2chFD: " + anyNum2chFD); // Output: '1'
        System.out.println("anyNum2chLD: " + anyNum2chLD); // Output: '3'
        System.out.println("num2ch: " + num2ch); // Output: '«'
        System.out.println("str2ch: " + str2chFD); // Output: '5'
        System.out.println("str2ch: " + str2chLD); // Output: '7'
        System.out.println("num2str: " + num2str); // Output: "123"
        System.out.println("ch2str: " + ch2str); // Output: "4"


        // sc.close();
    }
}