package in.kgcoding.challenge83;

public class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Sqaure sqaure = new Sqaure(10.3);

        System.out.printf("Area of circle is %5.2f\n", circle.calculteArea());
        System.out.printf("Area of square is %5.2f\n", sqaure.calculteArea());
    }
}
