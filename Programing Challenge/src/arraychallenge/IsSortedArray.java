package arraychallenge;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        boolean isIncreased = isIncreasing(numArray);
        boolean isDecreased = isDecreased(numArray);
        if(isDecreased || isIncreased) {
           System.out.println("The given array is in sorted order");
       }else {
           System.out.println("The given array is not sorted");
       }
    }

    public static boolean isIncreasing(int[] numArray) {
         int i=0;
         while(i < numArray.length) {
             if(numArray[i] > numArray[i + 1]) {
                 return false;
             }
             i++;
         }
        return true;
    }

    public static boolean isDecreased(int[] numArray) {
        return false;
    }
}
