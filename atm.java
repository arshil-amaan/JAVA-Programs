import java.util.Scanner;

public class atm{
	static Scanner sc = new Scanner (System.in);
	static int avl_bal = 200000;
	static int pin = 1234;
	static int usr_resp;
	
	static boolean pin_check(){
		int usr_pin;
		for (int i = 0; i < 4; i++){
			if (i == 3){
				System.out.println ("**********Maximum Trial Reached**********\nInsert Card Again");
				return false;
			}
			else if(i!=0){
				System.out.println (i+" out of 3 invalid Trials");
			}
	
			System.out.println ("Enter PIN");
			usr_pin = sc.nextInt();
		
			if (usr_pin != pin){
				System.out.println ("Invalid Pin");
			}
			else{
				System.out.println ("Pin Accepted");
				return true;
			}
		}
		return false;
	}

	static void menu(){
		System.out.println("1- Mini Statement\n2- Cash Withdrawl\n3- PIN Change\n0- EXIT");
	}
	static int mini_sttmnt(){
		System.out.println("Available balance is : "+avl_bal);
		return 0;
	}

	static void cash_withdrawl(){
		int usr_amt;
		System.out.println("Enter Amount : ");
		usr_amt = sc.nextInt();
		if(usr_amt>avl_bal){
			System.out.println("Insufficient Balance");
		}
		else{
			avl_bal-=usr_amt;
			System.out.println("Here it is 💰💰 ");
		}
	}
	static void pin_change(){
		if(pin_check()==false){
			System.exit(0);
		}
		else{
			System.out.println("Enter new PIN");
			pin = sc.nextInt();
			System.out.println("PIN changed successfully!!!");
		}
	}

  public static void main (String[]args)
  {
    int card = 0;
    int lang = 0;
    while (card != 1)
		{
			System.out.println ("Welcome to PNB 🙏\nInsert Card");
    	card = sc.nextInt ();
      }

    while (lang != 1)
      {
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

		if(pin_check()==false){
			System.exit(0);
		}


	do{
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
				pin_change();
				break;
			default :
				System.out.println("**********ERROR**********\nInvalid Option Selected\n");
		}
		}while(usr_resp != 0);
  }
}
