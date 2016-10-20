package q3;

import java.text.DecimalFormat;
/** {Cylinder@doc}
 *<p>This class represents the cylinder's radius 
 * and height.</p>
 *@author Ron Tran - Set A - A00995965
 *@version 1.0
 */

public class Cylinder {
/**
 *<p>Declare instance data for height.</p>
 */
    private double height;
/**
 * <p> declare instance data for radius.</p>    
 */
    private double radius;
/**
  * <p> declare instance data for area.</p>    
  */
    private double area;
/**
  * <p> declare instance data for radius.</p>    
  */    
    private double volume;  
/**
 * <p>This creates a constructor for the cylinder.</p> 
 * @param radius radius
 * @param height height
 */
 public Cylinder(double radius, double height) {
}
/**
 *<p>This method returns the cylinder's radius.</p>    
 * @param r r
 * @return return
 */
    public double setRaCyl(double r) {
     radius = r;
     return radius;
 }
/**
 *<p>This method returns the cylinder's height.</p>    
 *@param h h
 *@return return
 */
    public double setHeCyl(double h) {
     height = h;
     return height;
    }
 /**
  *<p>This calculates and returns the area of cylinder.</p>    
  * @return return
  */
    public double getSA() {
     area = 2 * Math.PI * (radius + height);
     return area;
    }
/**
 *<p>This calculates and returns the volume of the cylinder.</p>    
 * @return return
 */
    public double getVO() {
     volume = Math.PI * Math.pow(radius, 2) * height;
     return volume;
    }
/**
 *<p>This returns the String.</p>
 *@return return     
 */
    public String toString() {
     DecimalFormat fmt = new DecimalFormat("0.####");
     String result = " Radius: " + radius + " Height: " + height + " Area: " 
                      + fmt.format(area)  + " Volume: " + fmt.format(volume);
     return result;
    }
}


