import java.util.Scanner;

public class arshil_atm {
	static Scanner sc = new Scanner (System.in);
	static int avl_bal = 200000;
	static int pin = 1234;
	static int usr_resp;
	static int usr_pin;
	// pin check function
	static boolean pin_check() {
		for (int i = 0; i < 4; i++) {
			if (i == 3) {
				System.out.println ("**********Maximum Trial Reached**********\nInsert Card Again");
				return false;
			} else if(i!=0) {
				System.out.println (i+" out of 3 invalid Trials");
			}
	
			System.out.println ("Enter Your PIN");
			usr_pin = sc.nextInt();
		
			if (usr_pin != pin) {
				System.out.println ("Invalid Pin");
			} else {
				System.out.println ("Pin Accepted");
				return true;
			}
		}
		return false;
	}
	//menu
	static void menu() {
		System.out.println("1- Mini Statement\n2- Cash Withdrawl\n3- Cash Deposit\n4- PIN Change\n0- EXIT");
	}
	
	static int mini_sttmnt() {
		if(pin_check()==false) {
			System.exit(0);
		} else {
			System.out.println("Available balance is : "+avl_bal);
		}
		return 0;
	}
	//cash withdrawl
	static void cash_withdrawl() {
		if(pin_check()==false) {
			System.exit(0);
		} else {
			int usr_amt;
			System.out.println("Enter Amount : ");
			usr_amt = sc.nextInt();
			if(usr_amt>avl_bal) {
				System.out.println("Insufficient Balance");
			} else {
				avl_bal-=usr_amt;
				System.out.println("Here it is 💰💰 ");
				System.out.println("Available balance is : "+avl_bal);
			}
		}
	}
	//cash deposit
	static void cash_deposit() {
		if(pin_check()==false) {
			System.exit(0);
		} else {
			int usr_amt;
			System.out.println("Enter Amount you want to deposit : ");
			usr_amt = sc.nextInt();
			avl_bal+=usr_amt;
			System.out.println("Cash Deposit Successful!!!");
			System.out.println("Available balance is : "+avl_bal);
		}
	}
	//pin Change
	static int pin_change() {
		if(pin_check()==false) {
			System.exit(0);
		} else {
			for(int i = 0 ; i<4 ; i++) {
				if (i == 3) {
					System.out.println ("**********Maximum Trial Reached**********");
					break;
				}
				System.out.println("Enter new PIN");
				usr_pin = sc.nextInt();
				if(usr_pin<1000 || usr_pin>9999){
					System.out.println("PIN MUST contain 4 Digits");
				} else {
					pin = usr_pin;
					System.out.println("PIN changed successfully!!!");
					return 0;
				}
			}
		}
		return 0;
	}
	//main function
	public static void main (String[]args) {
		int card = 0;
		int lang = 0;
		while (card != 1) {
			System.out.println ("Welcome to PNB 🙏\nInsert Card");
			card = sc.nextInt ();
		}

    while (lang != 1) {
    	System.out.println ("Choose Language to Proceed");
    	System.out.println ("English - 1\nHindi - 2");
    	lang = sc.nextInt ();
	    if (lang == 2)
	        System.out.println("Currently Hindi Version Not Available. Kindly Choose English");
					else if (lang != 1)
    	  {
    	    System.out.println ("Invalid Language Selected");
    	  }
      }
		//primary functioning
	do{
		System.out.println("****************************************");
		menu();
		usr_resp = sc.nextInt();
		switch (usr_resp){
			case 0:
				System.out.println("Thank you Visit Again");
				break;
			case 1:
				mini_sttmnt();
				break;
			case 2:
				cash_withdrawl();
				break;
			case 3:
				cash_deposit();
				break;
			case 4:
				pin_change();
				break;
			default :
				System.out.println("**********ERROR**********\nInvalid Option Selected\n");
		}
		}while(usr_resp != 0);
  }
}
