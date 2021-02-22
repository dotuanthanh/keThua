public class Circle {
    public double radius;
    public String color;
     public  Circle(double radius){
     this.radius = radius;
 }
    public Circle() {

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public double getArea() {
         double PI = 3.14;
        return this.radius * this.radius * PI;
    }
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +getArea()+
                '}';
    }
}
