public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("This is best java course");
        sb1.append(" Hope you enjoy reading");
        System.out.println(sb1);
        sb.append(14);
        sb.append(" now this is the ");
        sb.append(76.37);
        System.out.println(sb);
    }

}
