import java.util.*;

public class patterns {
  static void square_wall() {
    try (// * * * * *
         // * * * * *
         // * * * * *
         // * * * * *
         // * * * * *
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      System.out.println();
      for (int i = 0; i < limit; i++) {
        for (int j = 0; j < limit; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
  }

  static void hollow_square_wall() {
    try (// * * * * *
         // * *
         // * *
         // * *
         // * * * * *
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      System.out.println();
      for (int i = 0; i < limit; i++) {
        for (int j = 0; j < limit; j++) {
          if (i == 0 || i == limit - 1 || j == 0 || j == limit - 1) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
    }
  }

  static void skew_square() {
    try (// * * * * *
         // * * * * *
         // * * * * *
         // * * * * *
         // * * * * *
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      System.out.println();
      for (int i = 0; i < limit; i++) {
        for (int j = 0; j < ((limit * 2) - 1) - i; j++) {
          if (j >= limit - 1 - i) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
    }
  }

  static void skew_hollow_square() {
    try (// * * * * *
         // * *
         // * *
         // * *
         // * * * * *
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      System.out.println();
      for (int i = 0; i < limit; i++) {
        for (int j = 0; j < limit * 2 - 1 - i; j++) {
          if ((j > limit - 2 - i && (i == 0 || i == limit - 1)) || (j == limit - 1 - i) || j == limit * 2 - 2 - i) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
    }
  }

  static void half_pyramid() {
    try (// *
         // * *
         // * * *
         // * * * *
         // * * * * *
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      System.out.println();
      for (int i = 0; i < limit; i++) {
        for (int j = 0; j <= i; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
  }

  static void invert_half_pyramid() {
    try (// * * * * *
         // * * * *
         // * * *
         // * *
         // *
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      System.out.println();
      for (int i = 0; i < limit; i++) {
        for (int j = 0; j < limit - i; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
  }

  static void other_half_pyramid() {
    try (// *
         // * *
         // * * *
         // * * * *
         // * * * * *
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      System.out.println();
      for (int i = 0; i < limit; i++) {
        for (int j = 0; j < limit; j++) {
          if (j < limit - i - 1) {
            System.out.print("  ");
          } else {
            System.out.print("* ");
          }
          // System.out.print("j");
        }
        System.out.println();
      }
    }
  }

  static void other_invert_half_pyramid() {
    try (// * * * * *
         // * * * *
         // * * *
         // * *
         // *
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      System.out.println();
      for (int i = 0; i < limit; i++) {
        for (int j = 0; j < limit; j++) {
          if (j < i) {
            System.out.print("  ");
          } else {
            System.out.print("* ");
          }
        }
        System.out.println();
      }
    }
  }

  static void floyds_triangle_pattern() {
    try (// 1
         // 2 3
         // 4 5 6
         // 7 8 9 10
         // 11 12 13 14 15
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      int num = 1;
      System.out.println();
      for (int i = 0; i < limit; i++) {
        for (int j = 0; j < i + 1; j++) {
          System.out.print(num + "\t");
          num++;
        }
        System.out.println();
        // num=1; //to restart from 1
      }
    }
  }

  static void inverted_number_triangle() {
    try (// 1 2 3 4 5
         // 6 7 8 9
         // 10 11 12
         // 13 14
         // 15
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      int num = 1;
      System.out.println();
      for (int i = 0; i < limit; i++) {
        for (int j = 0; j < limit - i; j++) {
          System.out.print(num + "\t");
          num++;
        }
        System.out.println();
      }
    }
  }

  static void binary_triangle() {
    try (// 1
         // 0 1
         // 1 0 1
         // 0 1 0 1
         // 1 0 1 0 1
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      System.out.println();
      for (int i = 0; i < limit; i++) {
        for (int j = 0; j <= i; j++) {
          if ((i + j) % 2 == 0) {
            System.out.print("1 ");
          } else {
            System.out.print("0 ");
          }
        }
        System.out.println();
      }
    }
  }

  static void character_pattern() {
    try (// A
         // B C
         // D E F
         // G H I J
         // K L M N O
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      char ch = 'A';
      System.out.println();
      for (int i = 0; i < limit; i++) {
        for (int j = 0; j <= i; j++) {
          System.out.print(ch++ + " ");
        }
        // ch='A'; //to restart from A
        System.out.println();
      }
    }
  }

  static void butterfly() {
    try (// *        *
         // **      **
         // ***    ***
         // ****  ****
         // **********
         // **********
         // ****  ****
         // ***    ***
         // **      **
         // *        *
        Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter no. of lines : ");
      int limit = sc.nextInt();
      for (int i = 0; i < limit * 2; i++) {
        for (int j = 0; j < limit * 2; j++) {
          if (i < limit && (j < i + 1 || j > limit * 2 - 2 - i)) {
            System.out.print("* ");
          } else if (i < limit) {
            System.out.print("  ");
          }
          if (i >= limit && (i + j < limit * 2 || j >= i)) {
            System.out.print("* ");
          } else if (i >= limit) {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    // square_wall();
    // hollow_square_wall();
    // skew_square();
    // skew_hollow_square();
    // half_pyramid();
    // invert_half_pyramid();
    // other_half_pyramid();
    // other_invert_half_pyramid();
    // floyds_triangle_pattern();
    // inverted_number_triangle();
    // binary_triangle();
    // character_pattern();
    butterfly();
  }
}
