package in.kgcoding.collection.map;

public class HashMapCollision {
    public static void main(String[] args) {
        // for different keys, same hash value. hence collision
        System.out.println(simpleHash("ABC"));
        System.out.println(simpleHash("CBA"));
    }


    public static int simpleHash(String key) {
       int sum = 0;
       for(char c : key.toCharArray()) {
           sum += (int) c;
       }
       return sum % 10; // Assuming a hash table size of 10
    }

}
