
package Task;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;
public class Triangle {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int sisi1,sisi2,sisi3;
    
        System.out.print("Input Left Side Triangle   = ");
        sisi1=sc.nextInt();
        System.out.print("Input Right Side Triangle  = ");
        sisi2=sc.nextInt();
        System.out.print("Input Bottom Side Triangle = ");
        sisi3=sc.nextInt();
        
        if (sisi1==sisi2 && sisi2==sisi3){
            System.out.println("Equilateral triangle");
        }
        else if(sisi1==sisi2||sisi1==sisi3||sisi2==sisi3){
            System.out.println("Triangle equal feet");
        }
        else {
            System.out.println("Arbitrary triangle");
            
        }
}    
}
