package q1;

import java.util.Random;

/** {PhoneNumbers@doc}.
 * <p> This class makes a randome phone number</p>
 * @author Ron Tran - set A
 * @version 1.0
 */
public class PhoneNumbers {
/**
*<p>This is the main method that will be called when you 
* try to run the class. It is the main entry point 
* to the program.</p> 
* 
* @param args args 
*/
 public static void main(String[]args) {

/** 
 *<p>This method creates a new pseudorandom number generator.</p>      
 */
    Random generator = new Random();
/**
 * <p> This creates needed variable.<p>       
 */
       int num1;
       int num2;
       int num3;
       int num4;
       int num5;
       int num6;
       int num7;
       int num8;
       int num9;
       int num10;
       final int a = 4;
       final int b = 6;
       final int c = 7;
       final int d = 8;
       final int e = 10;
       
/**
 *<p>This chooses a random number from 0 to 7 for the first number.</p>       
 */
       num1 = generator.nextInt(d);
/**       
*<p>This chooses a random number from 0 to 7 for the second number.</p>       
*/       
       num2 = generator.nextInt(d);
/**
*<p>This chooses a random number from 0 to 7 for the third number.</p>       
*/       
       num3 = generator.nextInt(d);
       /**
*<p>This chooses a random number from 0 to 6 for the fourth number.</p>       
*/       
       num4 = generator.nextInt(c);
/**
*<p>This chooses a random number from 0 to 3 for the fifth number.</p>       
*/       
       num5 = generator.nextInt(a);
/**
 *<p>This chooses a random number from 0 to 5 for the sixth number.</p>       
 */       
       num6 = generator.nextInt(b);
/**
 *<p>This chooses a random number from 0 to 9 for the seventh number.</p>       
 */
       num7 = generator.nextInt(e);
/**
 *<p>This chooses a random number from 0 to 9 for the eighth number.</p>       
 */
       num8 = generator.nextInt(e);
/**
 *<p>This chooses a random number from 0 to 9 for the ninth number.</p>       
 */       
       num9 = generator.nextInt(e);
/**
 *<p>This chooses a random number from 0 to 9 for the tenth number.</p>       
 */
       num10 = generator.nextInt(e);
/**
*<p>This prints out a random phone numbers 
*from all the numbers above.</p>       
*/       
       System.out.println(" A random phone number: " + num1 + num2  
                               + num3 + "-" 
                               + num4 + num5 + num6 + "-"
                               + num7 + num8 + num9 + num10);
    }
}
