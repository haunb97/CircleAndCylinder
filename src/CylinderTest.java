public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(100);
        System.out.println(cylinder);
        cylinder = new Cylinder("orange", true, 10 , 20);
        System.out.println(cylinder);
    }
}
