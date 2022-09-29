import java.util.Scanner;

public class Triangle{
    public static void main(String args []){
        float phi = 3.14F;
        Scanner radiusofTube = new Scanner (System.in);
        System.out.print("Enter The Radius : ");
        int radius = radiusofTube.nextInt();
        Scanner heightofTube = new Scanner (System.in);
        System.out.print("Enter Height : ");
        int height = heightofTube.nextInt();

        float volume = phi * radius * radius *height;
        System.out.println("Show Volume : " + volume);
    }
}