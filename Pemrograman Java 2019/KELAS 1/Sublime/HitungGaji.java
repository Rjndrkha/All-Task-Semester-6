import java.util.Scanner;

public class HitungGaji{
    public static void main(String args []){

        Scanner ss = new Scanner (System.in);
        double gajiPokok,bonus,thr,pajak=0.05,uangPajak,gajiBersih;

        System.out.print("Masukan Gaji Pokok Anda : ");
        gajiPokok = ss.nextInt();
        thr=gajiPokok*2;
        bonus=thr+55000;
        uangPajak=thr*pajak;
        gajiBersih=bonus-uangPajak;
        System.out.print("Gaji Bersih Anda Adalah : " + gajiBersih);
    }
}