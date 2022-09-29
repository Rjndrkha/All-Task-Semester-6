import java.util.Scanner;

public class quis1_Rajendra{
	public static void main (String args []){
	
	Scanner sc = new Scanner (System.in);
	int money;
	int charged=6500;
	double promo=0.1;
    
	System.out.print("Input Your Money= ");
	money = sc.nextInt();

	//rumus
	double yourMoney=money*promo;
	double nominalMoney=yourMoney-charged;

	System.out.println("Your Money is = " +nominalMoney);

	}
}