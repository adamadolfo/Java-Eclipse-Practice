package testing;

public class Rectangle {
	 private double width;
	 private double length;
	    
	    public Rectangle(double width, double length) {
	        if(width < 0.00) {
	            this.width = 0.00;
	        } else {
	            this.width = width;
	        }
	        
	        if(length < 0.00) {
	            this.length = 0.00;
	        } else {
	            this.length = length;
	        }
	        
	        
	        
	    } 
	    
	    public double getWidth() {
	        return this.width;
	    }
	    
	     public double getLength() {
	        return this.length;
	    }
	    
	    public double getArea() {
	        return getWidth() * getLength();
	    }
}
