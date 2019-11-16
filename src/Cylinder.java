public class Cylinder extends Circle {

private double height = 10.0;
    public Cylinder(){

    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, boolean filled, double radius, double height) {
        super(color, filled, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return  height*(getRadius()*getRadius())*Math.PI;
    }
    @Override
    public String toString(){
        return "A cylinder height = "+
                getHeight()+
                ", which is a subclass of "+
                super.toString();
    }
}
