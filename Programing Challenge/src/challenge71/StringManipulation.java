package challenge71;

import java.util.Locale;

public class StringManipulation {
    public static void main(String[] args) {
     String firstName = "Rahul";
     String lastName = "Mandal";

     String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
    }
}
