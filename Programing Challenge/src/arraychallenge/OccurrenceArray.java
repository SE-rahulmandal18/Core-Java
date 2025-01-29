package arraychallenge;

import java.util.Scanner;

public class OccurrenceArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numsArray = ArrayUtility.inputArray();
        System.out.print("Enter the element to be searched: ");
        int key = input.nextInt();
        int occurrence = noOfOccurrence(numsArray, key);
        System.out.println("The element has occurred " + occurrence + " times in the array");
    }

    public static int noOfOccurrence(int[] numsArray, int key) {
        int count=0;
        int i = 0;
        while(i < numsArray.length) {
            if(numsArray[i] == key) {
                count++;
            }
            i++;
        }
        return count;
    }

}
