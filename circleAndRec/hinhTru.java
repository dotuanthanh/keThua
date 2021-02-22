public class hinhTru extends Circle {
    double height;
    public  double get = super.getArea();

    public hinhTru(double height, double radius) {
        super(radius);
        this.height = height;

    }

    public hinhTru(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double theTich() {
        return this.height * this.get;
    }

    @Override
    public String toString() {
        return "hinhTru{" +
                "height=" + height + "The tich " + theTich() +
                '}';
    }
}
