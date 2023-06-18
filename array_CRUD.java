import java.util.Scanner;

public class ArrayCRUD {
    static void update(int[] myArray) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nPreviously:");
        for (int i = 0; i < myArray.length; i++) {
          System.out.print(myArray[i] + " ");
        }

        System.out.println("\n\nEnter new values:");

        for (int i = 0; i < myArray.length; i++) {
          myArray[i] = in.nextInt();
        }

        System.out.println("\nUpdated:");

        for (int i = 0; i < myArray.length; i++) {
          System.out.print(myArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        update(arr);

        int[] brr = {3, 4, 5, 7};
        update(brr);
        sc.close();
    }
}
