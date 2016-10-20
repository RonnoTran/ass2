package q2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** {CylinderStats@doc}
 * <p>This class reads the radius and height of a cylinder 
 * and prints its surface area and volume.</p>
 * @author Ron Tran - Set A
 * @version 1.0
*/

public class CylinderStats {
/**
*<p>This is the main method that will be called when you 
* try to run the class. It is the main entry point 
* to the program.</p>  
* @param args args 
*/
  public static void main(String []args) {
/** 
*<p>This makes variables for radius, height, area and volume.</p>    
*/
    double r;
    double h;
    double area;
    double volume;    
/**
 *<p>This makes a scanner for the user to read value 
 *of radius and height.</p>    
 */
    Scanner scan = new Scanner(System.in); 
    System.out.print(" Enter the value of radius and height");
    r = scan.nextDouble();
    h = scan.nextDouble();
/**
 *<p>This calculates the area and volume of cylinder.</p>   
 */
    area = 2 * Math.PI * (r + h);
    volume = Math.PI * Math.pow(r, 2) * h;
/**
*<p>This rounds the output to four decimal places.</p>    
*/
    DecimalFormat fmt = new DecimalFormat("0.####");
/**
*<p>This prints out the result of surface area and volume 
*of the cylinder.<p>
*/
    System.out.println(" The surface area: " + fmt.format(area));
    System.out.println(" The volume: " + fmt.format(volume));
    scan.close();
  }
}
