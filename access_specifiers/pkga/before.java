package pkga;

class parentbef{
  public int pub_parbef=10;
  int def_parbef=30; // default
  protected int prot_parbef=40;
  private int priv_parbef=50;
}

public class before extends parentbef{
  public int pub_bef=20;
  int def_bef=30; // default
  protected int prot_bef=40;
  private int priv_bef=50;
}

class non_parentbef{
  public int pub_non_parbef=30;
  int def_non_parbef=30; // default
  protected int prot_non_parbef=40;
  private int priv_non_parbef=50;
}