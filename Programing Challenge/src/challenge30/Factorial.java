package challenge30;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

       long fact =  factorial(number);
        System.out.println("Factorial is :" + fact);
    }

    public static long factorial(int num){

        if(num < 2){
            return 1;
        }

        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
