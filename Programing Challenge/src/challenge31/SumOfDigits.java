package challenge31;

import java.util.Scanner;

public class SumOfDigits {
   public static void main(String[] args) {
       Scanner sc = new Scanner((System.in));
       System.out.print("Enter the number: ");
       int num = sc.nextInt();
       int sum = sumOfDigits(num);
       System.out.println(sum);
   }

   public static int sumOfDigits(int num){

               int sum = 0;
               while(num > 0){
//                int digit =  num % 10;
//                 sum = sum + digit;
                   sum = sum + (num % 10);
                 num = num/10;
               }

       return sum;
   }
}
