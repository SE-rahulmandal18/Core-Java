package array;

public class ForEachArray {
    public static void main(String[] args) {
        String[] array = new String[]{
          "Mohan", "Sohan", "Geeta", "Sita", "Ram", "Shayam"
        };
        printForEach(array);

    }
    public static void printForEach(String[] array) {
        for(String name : array){
            System.out.println(name);
        }

    }
}
