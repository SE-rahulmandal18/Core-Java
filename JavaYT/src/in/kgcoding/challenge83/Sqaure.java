package in.kgcoding.challenge83;

public class Sqaure extends Shape{
    private final double sideInCms;

    public Sqaure(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    public double getSideInCms() {
        return sideInCms;
    }

    @Override
    public double calculteArea() {
        return Math.pow(sideInCms, 2);
    }
}
