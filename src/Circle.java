public class Circle {
    private String collor = "blue";
    private boolean filled = true ;
    private double radius = 1.0;
    public Circle(){

    }

    public Circle(String color, boolean filled, double radius) {
        this.collor = color;
        this.filled = filled;
        this.radius = radius;
    }
    public boolean IsFilled(){
        return filled ;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return collor;
    }

    public void setColor(String collor) {
        this.collor = collor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "A circle with radius = "+
                getRadius() +
                " color = "+
                getColor() +
                " and "+
                (IsFilled()? "filled":"not filled");
    }
}

