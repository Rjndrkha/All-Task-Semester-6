public class ContohVariabel{
	public static void main (String args []){
	String salahSatuHobbySayaAdalah ="Bermain petak umpet";
	boolean isPandai = true ;
	char jenisKelamin  = 'L';
	byte umurSayaSekarang =20;
	double $ipk = 3.24, tinggi = 1.78;
	System.out.println("Hobby Saya Adalah ?" + salahSatuHobbySayaAdalah);
	System.out.println("Apakah pandai ?" + isPandai);
	System.out.println("Jenis Kelamin:" + jenisKelamin);
	System.out.println("Umurku saat ini:" + umurSayaSekarang);
	System.out.println(String.format("Saya beripk %s,dengan tinggi badan %s",$ipk,tinggi));
	}
}