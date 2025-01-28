package challenge40;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and Average");
        int[] numsArray = ArrayUtility.inputArray();
        long sum = sum(numsArray);
        System.out.println("sum of the element of the array is: "+ sum);

        double avg = avg(numsArray);
        System.out.println("Average of the element of the array is: "+ avg);
    }
    public static long sum(int[] numsArray) {
      long sum = 0;
       int i=0;
       while(i < numsArray.length) {
          sum += numsArray[i];
           i++;
       }
        return sum;
    }

    public static double avg(int[] numsArray) {
        double sum = sum(numsArray);

        return (sum / numsArray.length);
    }
}
