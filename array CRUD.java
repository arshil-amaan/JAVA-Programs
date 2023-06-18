import java.util.Scanner;
public class swap {
	static void update(int myar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Previously : ");
		for(int i = 0 ; i<myar.length ; i++){
			System.out.print(myar[i]+" ");
		}
    
    System.out.println();
    for(int i = 0 ; i<myar.length ; i++){
      myar[i] = sc.nextInt();
    }
    
    System.out.println();
    System.out.println("Updated : ");

    for(int i = 0 ; i<myar.length ; i++){
      System.out.print(myar[i]+" ");
    }
    
    sc.close();
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    // initialization wih zero
    int arr[] = new int[10];
    update(arr);
    sc.close();
  }
}
