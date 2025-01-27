package challenge29;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the the number: ");
        int num = scanner.nextInt();
        int sum = oddSum(num);
        System.out.println("OddSum is: " + sum);

    }

    public static int oddSum(int num){
      int i = 1;
      int sum = 0;
      while(i <= num){
              sum += i;
              i += 2;
          }
        return sum;
    }
}
