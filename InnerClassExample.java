// parent class
class Parent {
  // data number
  private int info;

  // getter function
  public int getInfo(){
    return info;
  }

  // setter function
  public void setInfo(int info){
    this.info=info;
  }

  // constructor
  Parent() {
    System.out.println("par constr called");
  }

  // inner class
  // It can access all the data member and member functions of its shell class
  public class inner_class {

    public int getinfo_usinginner(){
      System.out.println("getter in inner provided : "+getInfo());
      return info;
    }

    //inner class constructorr
    inner_class() {
      System.out.println("inner class constr called");
    }
  }
}

// child class
public class InnerClassExample extends Parent {

  // constructor
  InnerClassExample() {
    System.out.println("test constr called");
  }

  // main function
  public static void main(String[] args) {

    // object of child class
    InnerClassExample pa = new InnerClassExample();

    // object creation method of inner class
    Parent.inner_class insub = pa.new inner_class();

    System.out.println(pa.getInfo());

    System.out.println(insub.getinfo_usinginner());
  }
}