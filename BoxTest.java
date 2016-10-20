package q4;

/** {BoxTedst@doc}
 * <p>This class instantiates and update two box objects.</p>
 * @author Ron Tran
 * @version 1.0
 */
public class BoxTest {
/**
 * <p>This is the main method (entry point) that gets called by the JVM.</p>
 * @param args args 
 */
     public static void main(String[] args) {
     final double height1 = 11;
     final double width1 = 7;
     final double depth1 = 6;
     final boolean full1 = true;
     final double height2 = 8;
     final double width2 = 5;
     final double depth2 = 6;
     final boolean full2 = true;
     
     Box box1 = new Box(height1, width1, depth1, full1); 
     System.out.println(" Box1 height: " + box1.setHBox(height1));
     System.out.println(" Box1 width: " + box1.setWBox(width1));
     System.out.println(" Box1 depth: " + box1.setDBox(depth1));
     System.out.println(" Box1 full?: " + box1.getFBox(full1));
    
     Box box2 = new Box(height2, width2, depth2, full2);
     System.out.println(" Box2 height: " + box2.setHBox(height2));
     System.out.println(" Box2 width: " + box2.setWBox(width2));
     System.out.println(" Box2 depth: " + box2.setDBox(depth2));
     System.out.println(" Box2 full?: " + box2.getFBox(full2));
     
     System.out.println(" Box1:" + box1.toString());
     System.out.println(" Box2 " + box2.toString());
   }
}
