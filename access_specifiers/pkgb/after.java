package pkgb;
import pkga.*;
import java.util.*;

class parentaft{
  public int pub_paraft=10;
  int def_paraft=12; // default
  protected int prot_paraft=14;
  private int priv_paraft=16;
}

public class after extends parentaft {
  public int pub_aft=2;
  int def_aft=4; // default
  protected int prot_aft=6;
  private int priv_aft=8;

public static void main(String []args){
  after objaft = new after();
  non_parentaft objnnparaft = new non_parentaft();
  Scanner sc = new Scanner(System.in);

  System.out.println("In Same Class");
  System.out.println("\npublic int pub_aft = 2; -> "+objaft.pub_aft);
  System.out.println("\nint def_aft = 4; -> "+objaft.def_aft);
  System.out.println("\nprotected int prot_aft = 6; -> "+objaft.prot_aft);
  System.out.println("\nprivate int priv_aft = 8; -> "+objaft.priv_aft);
  
  System.out.println("**************************************************\nIn Parent Class");
  System.out.println("\npublic int pub_paraft = 10; -> "+objaft.pub_paraft);
  System.out.println("\nint def_paraft=12; // default -> "+objaft.def_paraft);
  System.out.println("\nprotected int prot_aft = 14; -> "+objaft.prot_paraft);
  System.out.println("\nprivate int priv_aft = 16; -> \"unaccesible\"");
  
  
  System.out.println("**************************************************\nIn NON-parent Class");
  System.out.println("\npublic int pub_non_paraft=18; -> "+objnnparaft.pub_non_paraft);
  System.out.println("\nint def_non_paraft=20; // default -> "+objnnparaft.def_non_paraft);
  System.out.println("\nprotected int prot_non_paraft=22; -> "+objnnparaft.prot_non_paraft);
  System.out.println("\nprivate int priv_non_paraft=24; -> \"unaccesible\"");

  // System.out.println("**************************************************\nIn NON-parent Class\n(make that class' obect to access)");
  // System.out.println("\npublic int pub_non_paraft=57; -> "+objnnparaft.pub_non_paraft);
  // System.out.println("\nint def_non_paraft=30; // default -> "+objnnparaft.def_non_paraft);
  // System.out.println("\nprotected int prot_non_paraft=40; -> "+objnnparaft.prot_non_paraft);
  // System.out.println("\nprivate int priv_non_paraft=50; -> \"unaccesible\"");
  
  

  // System.out.println("public parbef is "+objbef.pub_parbef);
  // System.out.println("public bef is "+objbef.pub_bef);
  // System.out.println("public paraft is "+objaft.pub_paraft);
  // System.out.println("public aft is "+objaft.pub_paraft);

  sc.close();
  }
}

class non_parentaft{
  public int pub_non_paraft=18;
  int def_non_paraft=20; // default
  protected int prot_non_paraft=22;
  private int priv_non_paraft=24;
}