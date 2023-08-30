public class IndianCoins {
  public static int countCoins(int num) {
    int[] denominations = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
    int coins = 0;
    
    // int i = denominations.length - 1;
    // while (num != 0) {
    //   if (num >= denominations[i]) {
    //     coins += num / denominations[i];
    //     // System.out.print(denominations[i] + "x" + num / denominations[i] + " = " + denominations[i] * num / denominations[i] + " ");
    //     num = num % denominations[i];
    //     // System.out.println("=> remaining: " + num);
    //   }
    //   i--;
    // }

    for (int i = denominations.length - 1; i > -1; i--) {
      if (num >= denominations[i]) {
        coins += num / denominations[i];
        // System.out.print(denominations[i] + "x" + num / denominations[i] + " = " +
        // denominations[i] * (num / denominations[i]) + " ");
        num = num % denominations[i];
        // System.out.println("=> remaining: " + num);
      }
    }
    return coins;
  }

  public static void main(String[] args) {
    int value = 121;
    System.out.println(countCoins(value));
  }
}
