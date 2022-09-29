import java.util.Scanner;

public class FlowChart{
    public static void main(String args[]){
        float suhu,celcius,reamur,fahrenheit,kelvin;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter suhu : ");
        suhu = sc.nextInt();
        celcius = suhu;
        reamur = (float)4/5 * celcius;
        fahrenheit = ((float)(9/5*celcius)) + 32;
        kelvin = celcius + 273;
        int temperature;

        System.out.println("Celcius" + celcius);
        System.out.println("reamur" + reamur);
        System.out.println("fahrenheit" + fahrenheit);
        System.out.println("kelvin" + kelvin);
    }
}