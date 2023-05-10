import java.util.Scanner;
// driver class
class first_java {
    public static void main(String[] args) {
    	//a scanner object is created to take input using objname.nextInt() / .nextFloat() / .nextLine() / .next()
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: \n");
        // taking user input
        int number = sc.nextInt();
        System.out.print("You entered " + number);
        // it closes sc object of Scanner class, otherwise warning may occur
        sc.close();
    }
}
