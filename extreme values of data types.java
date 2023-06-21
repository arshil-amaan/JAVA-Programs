public class high_low_data_types {
  public static void main(String[] args){
  	double[] brr = {
          Byte.MAX_VALUE,
          Byte.MIN_VALUE,
          Integer.MAX_VALUE,
          Integer.MIN_VALUE,
          Long.MAX_VALUE,
          Long.MIN_VALUE,
          Float.MAX_VALUE,
          Float.MIN_VALUE,
          Double.MAX_VALUE,
          Double.MIN_VALUE
        };
        for (int i = 0; i < brr.length; i++) {
          System.out.print(brr[i] + "\n");
        }
  }
}
