/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author Rajendra Rakha
 */
class Karyawan {

    private String nama, nip, golongan;
    private double gaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;

        switch (golongan.charAt(0)) {
            case '1':
                this.gaji = 5000000;
                break;
            case '2':
                this.gaji = 3000000;
                break;
            case '3':
                this.gaji = 2000000;
                break;
            case '4':
                this.gaji = 1000000;
                break;
            case '5':
                this.gaji = 750000;
                break;
        }
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

}

class Staff extends Karyawan{
    private int lembur;
    private double gajiLembur;

    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }
    
    public double getGaji(int lembur,double gajiLembur){
        return super.getGaji()+lembur*gajiLembur;
    }
    
    public double getGaji(){
        return super.getGaji()+lembur*gajiLembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    
    public void lihatInfo(){
        System.out.println("NIP     : "+this.getNip());
        System.out.println("Nama    : "+this.getNama());
        System.out.println("Golongan : "+this.getGolongan());
        System.out.println("Jml Lemur : "+this.getLembur());
        System.out.println("Gaji Lembur : "+this.getGajiLembur());
        System.out.printf("Gaji      : %.0f\n",this.getGaji());
    }
    
}

class Manager extends Karyawan{
    private double tunjangan;
    private String bagian;
    private Staff st[];

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public Staff[] getSt() {
        return st;
    }

    public void setSt(Staff[] st) {
        this.st = st;
    }
    
    public void viewStaff(){
        int i;
        System.out.println("---------------");
        for (i=0;i<st.length;i++){
            st[i].lihatInfo();
        }
        System.out.println("---------------");
    }
    public void lihatInfo(){
        System.out.println("Manager     : "+this.getBagian());
        System.out.println("NIP         : "+this.getNip());
        System.out.println("Nama        : "+this.getNama());
        System.out.println("Golongan    : "+this.getGolongan());
        System.out.printf("Tunjangan   : %.0f\n",this.getTunjangan());
        System.out.printf("Gaji          : %.0f\n",this.getGaji());
        System.out.println("Bagian      : "+this.getBagian());
        this.viewStaff();
        
    }
    public double getGaji(){
        return super.getGaji()+tunjangan;
    }
}

public class Main{ 
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager man[]=new Manager[2];
        Staff staff1[]=new Staff[2];
        Staff staff2[]=new Staff[3];
        
        man[0]=new Manager();
        man[0].setNama("Tedjo");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");
        
        man[1]=new Manager();
        man[1].setNama("Atika");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");
        
        staff1[0]=new Staff();
        staff1[0].setNama("Usman");
        staff1[0].setNip("0003");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);
        
        staff1[1]=new Staff();
        staff1[1].setNama("Anugerah");
        staff1[1].setNip("0005");
        staff1[1].setGolongan("4");
        staff1[1].setLembur(5);
        staff1[1].setGajiLembur(55000);
        man[0].setSt(staff1);
        
        staff2[0]=new Staff();
        staff2[0].setNama("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(5500);
        
        staff2[1]=new Staff();
        staff2[1].setNama("Arie");
        staff2[1].setNip("0006");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(100000);
        
        staff2[2]=new Staff();
        staff2[2].setNama("Mentari");
        staff2[2].setNip("0007");
        staff2[2].setGolongan("3");
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(20000);
        man[1].setSt(staff2);
        
        man[0].lihatInfo();
        man[1].lihatInfo();
    }
}