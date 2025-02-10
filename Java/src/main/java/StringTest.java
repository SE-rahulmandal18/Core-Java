public class StringTest {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        StringBuilder sb1 = new StringBuilder("This is best java course");
//        sb1.append(" Hope you enjoy reading");
//        System.out.println(sb1);
//        sb.append(14);
//        sb.append(" now this is the ");
//        sb.append(76.37);
//        System.out.println(sb);

        String s1 = "Rahul";
        String s2 = "Rahul";
        String s3 = new String("abc");
        System.out.println(s1==s2);  // true
        System.out.println(s1==s3);  // false
        System.out.println(s1.equals(s3));  //false
        System.out.println(s1.equals(s2));  // true

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1.equals(str2)); // Output: true

        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str3 == str4); // Output: false

//str1.equals(str2) returns true because the contents of the strings are the same.
//str3 == str4 returns false because str3 and str4 are different objects, even though they contain the same content.
    }

}
