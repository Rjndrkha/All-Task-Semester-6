package big;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.SimpleDateFormat;

class NetSalary4 {

    String[] name;
    int[] group, workinghours, NIK, childAllowance, overtime2;
    int potongan, BasicSalary, transport, total, gajiBersih, Allowance2, allowance3, overtimetotal;

    public void input() {

        Scanner inputdata = new Scanner(System.in);
        System.out.print("   Enter the amount of data = ");
        int jumlahData = inputdata.nextInt();
        name = new String[jumlahData];
        group = new int[jumlahData];
        workinghours = new int[jumlahData];
        NIK = new int[jumlahData];
        childAllowance = new int[jumlahData];
        overtime2 = new int[jumlahData];
        System.out.println();

        for (int a = 0; a < name.length; a++) {
            System.out.println("====================================");
            Scanner masukkandata = new Scanner(System.in);
            System.out.print(+(a + 1) + ". Enter the employee's name : ");
            name[a] = masukkandata.nextLine();
            System.out.println();

            do {
                System.out.print("   Have Children & Wife 1.Ya || 2.No : ");
                childAllowance[a] = masukkandata.nextInt();
                System.out.println();
                if (childAllowance[a] != 1 && childAllowance[a] != 2) {
                    System.out.println(" ==Input Does Not Match !!==");
                    System.out.println();
                }

                if (childAllowance[a] == 1) {
                    Allowance2 = 500000 * childAllowance[a];
                } else if (childAllowance[a] == 2) {
                    allowance3 = 0;
                } else {

                }
            } while (childAllowance[a] != 1 && childAllowance[a] != 2);

            System.out.print("   Enter Employee NIK : ");
            NIK[a] = masukkandata.nextInt();
            System.out.println();
            do {
                System.out.println("   ===Employee Group===");
                System.out.println("      ~1. Group I~         ");
                System.out.println("      ~2. Group II~        ");
                System.out.println("      ~3. Group III~       ");
                System.out.println(" ");
                System.out.print("   Input Employee Group (1-3) : ");
                group[a] = masukkandata.nextInt();
                System.out.println();
                if (group[a] != 1 && group[a] != 2 && group[a] != 3) {
                    System.out.print(" ==Group Input Does Not Match !!==");
                    System.out.println();
                }
            } while (group[a] != 1 && group[a] != 2 && group[a] != 3);

            System.out.print("   Enter the number of Employee Entry Days : ");
            workinghours[a] = masukkandata.nextInt();
            System.out.println();
            System.out.print("  Enter Overtime Work : ");
            overtime2[a] = masukkandata.nextInt();
            //System.out.println();
            System.out.println("====================================");
        }
    }
//FIXX

    public void Rumus2() {
        Scanner calculation = new Scanner(System.in);

        System.out.print("Enter the Name You Want to Look : ");
        String Name = calculation.nextLine();
        for (int b = 0; b < name.length; b++) {

            if (!Name.equals(name[b])) {
                System.out.println("--------------------------");
                System.out.println("   !!Name Does Not Founf In Array " + (b + 1) + "!!");
                System.out.println("--------------------------");
                System.out.println();

            }

            if (name[b].equals(Name)) {
                switch (group[b]) {
                    case 1:
                        BasicSalary = 2000000;
                        potongan = 20000;
                        overtimetotal = 15000 * overtime2[b];
                        gajiBersih = BasicSalary - potongan;
                        transport = workinghours[b] * 5000;
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("Employee Fixed Salary named " + name[b] + " Group " + group[b] + " Is Rp. " + BasicSalary);
                        System.out.println("Number of Employee Entry Days named " + name[b] + " : " + workinghours[b]);
                        System.out.println("Transport Allowance : " + transport);
                        System.out.println("Overtime : " + overtimetotal);
                        if (childAllowance[b] == 1) {
                            int anak = 50000;
                            System.out.println("Child & Wife Benefits : " + anak);
                            System.out.println("Salary deductions for BPJS : " + potongan);
                            System.out.println();
                            total = gajiBersih + transport + anak + overtimetotal;
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("EMPLOYEE SALARY TOTAL Named " + name[b] + " Is Rp. " + total);
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println();
                        } else {
                            int anak2 = 0;
                            System.out.println("Child & Wife Benefits : " + anak2);
                            System.out.println("Salary deductions for BPJS : " + potongan);
                            System.out.println();
                            total = gajiBersih + transport + anak2 + overtimetotal;
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("EMPLOYEE SALARY TOTAL Named " + name[b] + " Is Rp. " + total);
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println();
                        }

                        break;
                    case 2:
                        BasicSalary = 3500000;
                        potongan = 50000;
                        overtimetotal = 20000 * overtime2[b];
                        gajiBersih = BasicSalary - potongan;
                        transport = workinghours[b] * 5000;
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("Employee Fixed Salary named " + name[b] + " Group " + group[b] + " Is Rp. " + BasicSalary);
                        System.out.println("Number of Employee Entry Days named " + name[b] + " : " + workinghours[b]);
                        System.out.println("Transport Allowance : " + transport);
                        System.out.println("Overtime : " + overtimetotal);
                        if (childAllowance[b] == 1) {
                            int anak = 50000;
                            System.out.println("Child & Wife Benefits : " + anak);
                            System.out.println("Salary deductions for BPJS : " + potongan);
                            System.out.println();
                            total = gajiBersih + transport + anak + overtimetotal;
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("EMPLOYEE SALARY TOTAL Named " + name[b] + " Is Rp. " + total);
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println();
                        } else {
                            int anak2 = 0;
                            System.out.println("Child & Wife Benefits : " + anak2);
                            System.out.println("Salary deductions for BPJS : " + potongan);
                            System.out.println();
                            total = gajiBersih + transport + anak2 + overtimetotal;
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("EMPLOYEE SALARY TOTAL Named " + name[b] + " Is Rp. " + total);
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println();
                        }
                        break;
                    case 3:
                        BasicSalary = 4500000;
                        potongan = 70000;
                        overtimetotal = 25000 * overtime2[b];
                        gajiBersih = BasicSalary - potongan;
                        transport = workinghours[b] * 5000;
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("Employee Fixed Salary named " + name[b] + " Group " + group[b] + " Is Rp. " + BasicSalary);
                        System.out.println("Number of Employee Entry Days named " + name[b] + " : " + workinghours[b]);
                        System.out.println("Transport Allowance : " + transport);
                        System.out.println("Overtime : " + overtimetotal);
                        if (childAllowance[b] == 1) {
                            int anak = 50000;
                            System.out.println("Child & Wife Benefits : " + anak);
                            System.out.println("Salary deductions for BPJS : " + potongan);
                            System.out.println();
                            total = gajiBersih + transport + anak + overtimetotal;
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("EMPLOYEE SALARY TOTAL Named " + name[b] + " Is Rp. " + total);
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println();
                        } else {
                            int anak2 = 0;
                            System.out.println("Child & Wife Benefits : " + anak2);
                            System.out.println("Salary deductions for BPJS : " + potongan);
                            System.out.println();
                            total = gajiBersih + transport + anak2 + overtimetotal;
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("EMPLOYEE SALARY TOTAL Named " + name[b] + " Is Rp. " + total);
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println();
                        }
                        break;
                    default:

                }

            }

        }
    }

    public void Rumus() {
        Scanner calculation = new Scanner(System.in);

        for (int b = 0; b < name.length; b++) {

            switch (group[b]) {
                case 1:
                    BasicSalary = 2000000;
                    potongan = 20000;
                    overtimetotal = 15000 * overtime2[b];
                    gajiBersih = BasicSalary - potongan;
                    transport = workinghours[b] * 5000;
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Employee Fixed Salary named " + name[b] + " Group " + group[b] + " Is Rp. " + BasicSalary);
                    System.out.println("Number of Employee Entry Days named " + name[b] + " : " + workinghours[b]);
                    System.out.println("Transport Allowance : " + transport);
                    System.out.println("Overtime : " + overtimetotal);
                    if (childAllowance[b] == 1) {
                        int anak = 50000;
                        System.out.println("Child & Wife Benefits : " + anak);
                        System.out.println("Salary deductions for BPJS : " + potongan);
                        System.out.println();
                        total = gajiBersih + transport + anak + overtimetotal;
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("EMPLOYEE SALARY TOTAL Named " + name[b] + " Is Rp. " + total);
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println();
                    } else {
                        int anak2 = 0;
                        System.out.println("Child & Wife Benefits : " + anak2);
                        System.out.println("Salary deductions for BPJS : " + potongan);
                        System.out.println();
                        total = gajiBersih + transport + anak2 + overtimetotal;
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("EMPLOYEE SALARY TOTAL Named " + name[b] + " Is Rp. " + total);
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println();
                    }

                    break;
                case 2:
                    BasicSalary = 3500000;
                    potongan = 50000;
                    overtimetotal = 20000 * overtime2[b];
                    gajiBersih = BasicSalary - potongan;
                    transport = workinghours[b] * 5000;
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Employee Fixed Salary named " + name[b] + " Group " + group[b] + " Is Rp. " + BasicSalary);
                    System.out.println("Number of Employee Entry Days named " + name[b] + " : " + workinghours[b]);
                    System.out.println("Transport Allowance : " + transport);
                    System.out.println("Overtime : " + overtimetotal);
                    if (childAllowance[b] == 1) {
                        int anak = 50000;
                        System.out.println("Child & Wife Benefits : " + anak);
                        System.out.println("Salary deductions for BPJS : " + potongan);
                        System.out.println();
                        total = gajiBersih + transport + anak + overtimetotal;
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("EMPLOYEE SALARY TOTAL Named " + name[b] + " Is Rp. " + total);
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println();
                    } else {
                        int anak2 = 0;
                        System.out.println("Child & Wife Benefits : " + anak2);
                        System.out.println("Salary deductions for BPJS : " + potongan);
                        System.out.println();
                        total = gajiBersih + transport + anak2 + overtimetotal;
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("EMPLOYEE SALARY TOTAL Named " + name[b] + " Is Rp. " + total);
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println();
                    }
                    break;
                case 3:
                    BasicSalary = 4500000;
                    potongan = 70000;
                    overtimetotal = 25000 * overtime2[b];
                    gajiBersih = BasicSalary - potongan;
                    transport = workinghours[b] * 5000;
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Employee Fixed Salary named " + name[b] + " Group " + group[b] + " Is Rp. " + BasicSalary);
                    System.out.println("Number of Employee Entry Days named " + name[b] + " : " + workinghours[b]);
                    System.out.println("Transport Allowance : " + transport);
                    System.out.println("Overtime : " + overtimetotal);
                    if (childAllowance[b] == 1) {
                        int anak = 50000;
                        System.out.println("Child & Wife Benefits : " + anak);
                        System.out.println("Salary deductions for BPJS : " + potongan);
                        System.out.println();
                        total = gajiBersih + transport + anak + overtimetotal;
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("EMPLOYEE SALARY TOTAL Named " + name[b] + " Is Rp. " + total);
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println();
                    } else {
                        int anak2 = 0;
                        System.out.println("Child & Wife Benefits : " + anak2);
                        System.out.println("Salary deductions for BPJS : " + potongan);
                        System.out.println();
                        total = gajiBersih + transport + anak2 + overtimetotal;
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("EMPLOYEE SALARY TOTAL Named " + name[b] + " Is Rp. " + total);
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println();
                    }
                    break;
                default:

            }

        }

    }

//FIXX
    public void ShowData(int y) {

        if (childAllowance[y] == 1) {
            System.out.println("Employee Name : " + name[y] + "\nHave Children or Wife : Ya " + "\nNIK : " + NIK[y] + "\nGroup : " + group[y] + "\nTotal Entry Days : " + workinghours[y] + "\nOvertime Work : " + overtime2[y]);
        } else {
            System.out.println("Employee Name : " + name[y] + "\nHave Children or Wife : No" + "\nNIK : " + NIK[y] + "\nGroup : " + group[y] + "\nTotal Entry Days : " + workinghours[y] + "\nOvertime Work : " + overtime2[y]);
        }
    }
    /*
     public void TampilkanSemuaGaji(){
     for (int v=0; v< name.length;v++){
     Rumus(v);
     }
     }    
     */
//FIXX

    public void TampilkanSemua() {
        for (int x = 0; x < name.length; x++) {
            System.out.println("===============TAMPILKAN SEMUA DATA===================");
            ShowData(x);
            System.out.println();
            System.out.println("-------------------------------------------------------");
        }
    }
//FIXX

    public void SearchData() {
        Scanner EmployeeData = new Scanner(System.in);
        System.out.print("Enter the keyword name of the employee : ");
        String datany = EmployeeData.nextLine();
        for (int b = 0; b < name.length; b++) {
            if (name[b].equals(datany)) {
                System.out.println("========================\nEMPLOYEE DATA FOUND ON DATA NUMBER " + (b + 1));
                ShowData(b);
                System.out.println();
                break;
            } else {
                System.out.println("EMPLOYEE DATA IS NOT FOUND IN DATA NUMBER " + (b + 1));
                System.out.println();

            }
        }
    }
}
//FIX

public class test1 {

    public static void main(String[] args) {

        //Tanggal
        Date Tanggal = new Date();
        SimpleDateFormat tgl;
        tgl = new SimpleDateFormat("E,dd/MM/yyy hh:mm:ss a");
        System.out.println("                            == " + tgl.format(Tanggal) + " ==");
        //Tanggal

        Scanner Kepegawaian2 = new Scanner(System.in);
        int menu;
        NetSalary4 data = new NetSalary4();
        System.out.println("                                -----------------------                             ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("                                         WELCOME TO                             ");
        System.out.println("                        BIG PROJECT RAJENDRA RAKHA 2019                      ");
        System.out.println("                              Employee's NIK RR1941720080                           ");
        System.out.println("=============================================================================");

        for (int i = 0; i < 99; i++) {
            System.out.print("Enter Employee's NIK : ");
            String kepegawaian = Kepegawaian2.nextLine();
            if (kepegawaian.equals("RR1941720080")) {
                System.out.println("------------------------");
                System.out.println("    SUCCESFULLY Log-In      ");
                System.out.println("------------------------");
                System.out.println();
                break;
            } else {
                System.out.println("------------------------");
                System.out.println("       LOGIN FAILED !!        ");
                System.out.println("------------------------");
                System.out.println();
            }

        }
        System.out.println("          ==Input Data==         ");
        data.input();
        do {
            System.out.println("---------------------------------");
            System.out.println("         EMPLOYEE SALARY MENU         ");
            System.out.println("                   PNS_2019                   ");
            System.out.println("----------------------------------");
            System.out.println(" 1. Search Data ");
            System.out.println(" 2. Show All Data ");
            System.out.println(" 3. Search Salary Data ");
            System.out.println(" 4. Show all salary data");
            System.out.println(" 5. EXIT");
            System.out.println("");
            System.out.println("========================");
            System.out.println("");
            Scanner pilih = new Scanner(System.in);
            System.out.print("Enter Menu Options = ");
            menu = pilih.nextInt();
            System.out.println("");

            switch (menu) {
                case 1: {
                    System.out.println("Menu - 1. Search Data ");
                    System.out.println("--------------------");
                    data.SearchData();
                }
                break;
                case 2: {
                    System.out.println("Menu - 2. Show Data ");
                    System.out.println("--------------------");
                    data.Rumus();
                }
                break;
                case 3: {
                    System.out.println("Menu - 3. Search Salary Data");
                    System.out.println("--------------------------");
                    data.Rumus2();
                }
                break;
                case 4: {
                    System.out.println("Menu- 4. Show All Salary Data");
                    System.out.println("---------------------------");
                    data.TampilkanSemua();
                }
                break;
            }
        
        } while (menu > 0 && menu < 5);
        System.out.println("      == " + tgl.format(Tanggal) + " ==");
        System.out.println("==========================================  ");
        System.out.println("                   THANK YOU                        ");
        System.out.println("        Big Project Rajendra Rakha                  ");
        System.out.println("===========================================");
        System.out.println("                   Supervisor               ");
        for (int space = 0; space < 5; space++) {
            System.out.println();
        }
        System.out.println("       Mustika Mentari, S.Kom., M.Kom  ");
        System.out.println("    ___________________________________ ");
        System.out.println("             198806072019032016      ");
    }
}
