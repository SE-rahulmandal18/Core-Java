package challenge28;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication world");
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num){

        int i=1;
        while(i<=10){
            System.out.println(num + " X " + i + " = "+ (num * i));
            i++;
        }

    }
}
