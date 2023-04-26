import java.util.Scanner;
class first_java {
    public static void main(String[] args) {
    	//a scanner object is created to take input using objname.nextInt() / .nextFloat() / nextLine()
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: \n");
        int number = sc.nextInt();
        System.out.print("You entered " + number);
        sc.close();
    }
}
