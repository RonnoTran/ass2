package q4;

/** {Box@doc}
 * <p>This class represents the height, width and depth of the box.</p>
 * @author Ron Tran - Set A - A00995965
 * @version 1.0
 */
 public class Box {
/**
 * <p>This declares instance data for height of the box.</p>. 
 */
    private double height;
/**
 * <p>This declares instance data for width of the box.</p>
 */
    private double width;
/**
 * <p>This declares instance data for depth of the box.</p>
 */
    private double depth;
/**
 * <p>This declares that if the box is full or not.</p>
 */
    private boolean full;
/**
 * <p> Create a body constructor for the box.</p>
 * @param height height
 * @param width width
 * @param depth depth
 * @param full full
 */
   public Box(double height, double width, double depth, boolean full) {
    height = 0;
    width = 0;
    depth = 0;
    full = false;
    return;
   }
/**
 * <p>This method returns the height of the box.</p>
 * @param h h
 * @return return
 */
 public double setHBox(double h) {
    height = h;
    return height;
 }
/**
 * <p>This method returns the width of the box.</p> 
 * @param w w
 * @return return
 */
 public double setWBox(double w) {
     width = w;
     return width;
 }
 /**
  * <p>This method returns the depth of the box.</p>
  * @param d d
  * @return return
  */
 public double setDBox(double d) {
     depth = d;
     return depth;
  }
/**
 * <p>This method returns the result if the box is full or not.</p>
 * @param f f
 * @return return
 */
 public boolean getFBox(boolean f) {
     full = f;
     return full;
 }
/**
 * <p> This method returns the String.</p>
 * @return return
 */
 public String toString() {
     String result = " Height: " + height + " Width: " + width + " Depth "
                        + depth + " Full: "  + full;
     return result;
  }
 
 }

