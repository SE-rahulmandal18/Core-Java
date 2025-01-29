package arraychallenge;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] myArray = ArrayUtility.inputArray();
        int maxi = max(myArray);
        System.out.println("Maximum of the array is: "+ maxi);
        int mini = min(myArray);
        System.out.println("Minimum of the array is: "+ mini);
    }
    public static int max(int[] myArray) {
        int max = Integer.MIN_VALUE;
        int i=0;
        while(i < myArray.length) {
            if( myArray[i] > max) {
                max = myArray[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] myArray) {
        int min = Integer.MAX_VALUE;
        int i=0;
        while (i < myArray.length) {
            if( myArray[i] < min) {
                min =  myArray[i];
            }
            i++;
        }
        return min;
    }
}
