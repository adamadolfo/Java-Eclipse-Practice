package testing;

public class Cuboid extends Rectangle {
    // write your code here
    private double height;
    
    public Cuboid(double width, double length, double height){
           super(width, length);
    
            if (height < 0.00) {
                this.height = 0.00;
            } else {
                this.height = height;
            }
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public double getVolume() {
        return getArea() * getHeight();
    }
 
}