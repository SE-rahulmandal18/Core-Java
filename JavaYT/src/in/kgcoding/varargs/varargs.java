package in.kgcoding.varargs;

import java.util.Scanner;

public class VarargsTest {
    public static void main(String... args) {
        
        System.out.println(sum(2, 3, 5,6,7));
    }
    
    public static int sum(int first, int second, int... a){
       int sum = first + second;
        for(int i : a){
            sum +=i;
        }
        return sum;
    }
    
}
