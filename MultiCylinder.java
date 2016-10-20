package q3;
/**
 * {Multicylinder@doc}
 *<p>This class instantiates and update two Cylinder objects.</p>
 *@author Ron Tran - Set A - A00995965
 *@version 1.0 
 */
public class MultiCylinder {
/**
 *<p>This is the main method (entry point) that gets called by the JVM.</p>
 *
 * @param args args
 */    
  public static void main(String[] args) {
    final double radius1 = 0.56;
    final double height1 = 2.3;
    final double radius2 = 0.35;
    final double height2 = 1.5;
    
    Cylinder cylinder1 = new Cylinder(radius1, height1);
    System.out.println("Cylinder 1 radius: " + cylinder1.setRaCyl(radius1));
    System.out.println("Cylinder 1 height: " + cylinder1.setHeCyl(height1));
    System.out.println("Cylinder 1 area: " + cylinder1.getSA());
    System.out.println("Cynlinder 1 volume: " + cylinder1.getVO());
    
    Cylinder cylinder2 = new Cylinder(radius2, height2);
    System.out.println("Cylinder 2 radius: " + cylinder2.setRaCyl(radius2));
    System.out.println("Cylinder 2 height: " + cylinder2.setHeCyl(height2));
    System.out.println("Cylinder 2 area: " + cylinder2.getSA());
    System.out.println("Cynlinder 2 volume: " + cylinder2.getVO());
     
    System.out.println("Cylinder1:" + cylinder1.toString());
    System.out.println("Cylinder2:" + cylinder2.toString());
    
  }
}
