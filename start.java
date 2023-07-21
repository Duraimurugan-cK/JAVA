import java.util.Scanner;

public class start {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int xor = n1 ^ n2;
    int flips = 0;
    while (xor != 0) {
      flips += xor & 1;
      xor >>= 1;
    }
    System.out.println(flips);
  }
}