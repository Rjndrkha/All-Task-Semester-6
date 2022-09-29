/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg6;

/**
 *
 * @author Rajendra Rakha
 */
class Karyawan{
    public String nama,alamat,jk;
    public int umur,gaji;
    
    public Karyawan(){
        
    }
    public Karyawan(String nama,String alamat,String jk,int umur,int gaji){
        this.nama=nama;
        this.alamat=alamat;
        this.jk=jk;
        this.umur=umur;
        this.gaji=gaji;
    }
    public void tampilDataKaryawan(){
        System.out.println("Nama     : "+nama);
        System.out.println("Alamat   : "+alamat);
        System.out.println("Gender   : "+jk);
        System.out.println("Umur     : "+umur);
        System.out.println("Gaji       : "+gaji);
    }
}

class Manager extends Karyawan{
    public int tunjangan;
    public Manager(){
        
    }
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan   : "+tunjangan);
        System.out.println("Total Gaji   : "+(super.gaji+tunjangan));
    }
}

class Staff extends Karyawan{
    public int lembur,potongan;
    public Staff(){
        
    }
    public Staff(String nama,String alamat,String jk,int umur,int gaji,int potongan){
        super(nama, alamat, jk, umur, gaji);
        this.lembur=lembur;
        this.potongan=potongan;
    }
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Lembur      : "+lembur);
        System.out.println("Potongan     : "+potongan);
        System.out.println("Total Gaji   : "+(gaji+lembur-potongan));
    }
}

class StaffTetap extends Staff{
    public String golongan;
    public int asuransi;
    public StaffTetap(){
        
    }
    public StaffTetap(String nama,String alamat,String jk,int umur,int gaji
            ,int lembur,int potongan,String golongan,int asuransi){
        super(nama, alamat, jk, umur, gaji, potongan);
        this.golongan=golongan;
        this.asuransi=asuransi;
    }
    public void tampilStaffTetap(){
        System.out.println("==========Data Staff Tetap==========");
        super.tampilDataStaff();
        System.out.println("Golongan        : "+golongan);
        System.out.println("Jumlah Asurans i "+asuransi);
        System.out.println("Gaji Bersih     : "+(gaji+lembur-potongan-asuransi));
    }
}

    class StaffHarian extends Staff{
        public int jumlahJamKerja;
        public StaffHarian(){
            
        }
        public StaffHarian(String nama,String alamat,String jk,int umur,int gaji
            ,int lembur,int potongan,int jmlJamKerja){
            super(nama, alamat, jk, umur, gaji, potongan);
            this.jumlahJamKerja=jmlJamKerja;
        }
        public void tampilStaffHarian(){
            System.out.println("====Data Staff Harian====");
            super.tampilDataStaff();
            System.out.println("Jumlah Jam Kerja    : "+jumlahJamKerja);
            System.out.println("Gaji Bersih            : "+(gaji*jumlahJamKerja+lembur-potongan));
        }
    }



public class Inheritance1{
    public static void main(String[] args) {
        StaffTetap ST=new StaffTetap("Budi", "Malang", "Male", 20, 2000000, 25000, 20000, "2A", 100000);
        ST.tampilStaffTetap();
        
        StaffHarian SH=new StaffHarian("Eko", "Malang", "Male", 25, 100000, 100000, 50000, 100);
        SH.tampilStaffHarian();
       
    }
}
