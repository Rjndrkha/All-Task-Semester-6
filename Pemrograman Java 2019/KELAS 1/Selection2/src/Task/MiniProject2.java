package Task;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class MiniProject2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int menu, trip, akomodasi, trip2;
        double bus = 500000, pesawat = 1000000, total1, hotel = 700000, total2, hotel2 = 750000, bus2 = 300000, total3, total4, pesawat2 = 700000;
        double total5, total6, total7, total8, pesawat3 = 1500000, bus3 = 50000, hotel3 = 500000;
        double pesawat4 = 2000000, bus4 = 1000000, hotel4 = 700000;
        int tanggal, nilai = 0;
       
        System.out.println("   WELCOME TO RR TOUR & TRAVEL ");
        System.out.println("  \u2764Travel Top 1 In Indonesia\u2764      ");
        System.out.println("==========RAJENDRA RAKHA==========");
        System.out.println("    ======1941720080-1H======   ");
        System.out.println("==================================");
        System.out.println("   We Provide Vacation Services     ");
        System.out.println("      For You And Your Family      ");
        System.out.println("=================================");

        
                    System.out.println("Select Date of departure to get a 10% discount");
                    System.out.println("=================================");
                    System.out.println("1. 10 Januari 2019 (Domestic)  ");
                    System.out.println("2. 20 Januari 2019 (Overseas) ");
                    System.out.print("Select Departure Date = ");
                    tanggal = sc.nextInt();
                    System.out.println("=================================");

                    switch (tanggal) {
                        case 1:
                        System.out.println("       ====LIST TRAVEL====      ");
                        System.out.println("        =10 Januari 2019=        ");
                        System.out.println("       ==Departure Malang==        ");
                        System.out.println("1.Bali");
                        System.out.println("2.Yogyakarta");
                        System.out.println("3.Surabaya");
                        System.out.println("4.Lombok");
                        System.out.print("Choose the trip you like = ");
                        trip = sc.nextInt();
                        
                        if (trip == 3) {
                            System.out.println("==FOR SURABAYA TRAVEL AIRPORT TRANSIT==");

                        } else {

                        }

                        System.out.println("=================================");

                        switch (trip) {
                            case 1:
                            System.out.println("    ====LIST TRANSPORTASI====      ");
                            System.out.println("1.BUS (13.00 Pm)");
                            System.out.println("2.Plane (15.00Pm)");
                            System.out.print("Choose the accommodation you want = ");
                            akomodasi = sc.nextInt();
                            System.out.println("=================================");
                            if (akomodasi == 1) {
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                total1 = 1200000 - ((bus + hotel) * 0.1);
                                System.out.println("This package includes 4D3N Hotel & Transportation");
                                System.out.println("Your destination is Bali");
                                System.out.println("You choice transportation BUS");
                                System.out.println("Departure 10-01-2019 (13.00)");
                                System.out.println("Your Total Pay = Rp" + total1);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                                break;
                            } else if (akomodasi == 2) {
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                total2 = pesawat + hotel - ((pesawat + hotel) * 0.1);
                                System.out.println("This package includes 4D3N Hotel & Transportation");
                                System.out.println("Your destination is Bali");
                                System.out.println("You choice transportation Plane");
                                System.out.println("Departure 10-01-2019 (15.00)");
                                System.out.println("Your Total Pay = Rp" + total2);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                                break;
                            } else {
                           
                            }

                        } switch (trip) {
                            case 2:
                            System.out.println("    ====LIST TRANSPORTASI====      ");
                            System.out.println("1.BUS (09.00 Am)");
                            System.out.println("2.Pesawat (12.00 Pm)");
                            System.out.print("Pilih Akomodasi Yang anda Mau = ");
                            akomodasi = sc.nextInt();
                            if (akomodasi == 1) {
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                System.out.println("This package includes 4D3N Hotel & Transportation");
                                System.out.println("Your destination is Yogyakarta");
                                System.out.println("You choice transportation BUS");
                                total3 = bus2 + hotel2 - ((bus2 + hotel2) * 0.1);
                                System.out.println("Departure 10-01-2019 (09.00)");
                                System.out.println("Your Total Pay = Rp" + total3);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                            
                            } else if (akomodasi == 2) {
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                System.out.println("This package includes 4D3N Hotel & Transportation");
                                System.out.println("Your destination is Yogyakarta");
                                System.out.println("You choice transportation Plane");
                                total4 = pesawat2 + hotel2 - ((pesawat2 + hotel2) * 0.1);
                                System.out.println("Departure 10-01-2019 (12.00)");
                                System.out.println("Your Total Pay = Rp" + total4);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                      
                            } else {
                         
                            }

                        } switch (trip) {
                            case 3:
                            System.out.println("    ====LIST TRANSPORTASI====      ");
                            System.out.println("1.BUS (07.00 Am)");
                            System.out.println("2.Pesawat (11.00Pm)");
                            System.out.print("Pilih Akomodasi Yang anda Mau = ");
                            akomodasi = sc.nextInt();
                            if (akomodasi == 1) {
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                System.out.println("This package includes 4D3N Hotel & Transportation");
                                System.out.println("Your destination is Surabaya");
                                System.out.println("You Choice Transportation BUS");
                                total5 = bus3 + hotel3 - ((bus3 + hotel3) * 0.1);
                                System.out.println("Departure 10-01-2019 (17.00)");
                                System.out.println("Your Total Pay = Rp" + total5);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                       
                            } else if (akomodasi == 2) {
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                System.out.println("This package includes 4D3N Hotel & Transportation");
                                System.out.println("Your destination is Surabaya");
                                System.out.println("You Choice Transportation Plane");
                                total6 = pesawat3 + hotel3 - ((pesawat3 + hotel3) * 0.1);
                                System.out.println("Departure 10-01-2019 (17.00)");
                                System.out.println("Your Total Pay = Rp" + total6);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                          
                            } else {
                   
                            }

                        } switch (trip) {
                            case 4:
                            System.out.println("    ====LIST TRANSPORTASI====      ");
                            System.out.println("1.BUS (03.00Am)");
                            System.out.println("2.Pesawat (10.00Am)");
                            System.out.print("Pilih Akomodasi Yang anda Mau = ");
                            akomodasi = sc.nextInt();
                            if (akomodasi == 1) {
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                System.out.println("This package includes 4D3N Hotel & Transportation");
                                System.out.println("Your destination is Lombok");
                                System.out.println("You Choice Transportation BUS");
                                total7 = bus4 + hotel4 - ((bus4 + hotel4) * 0.1);
                                System.out.println("Departure 10-01-2019 (03.00)");
                                System.out.println("Your Total Pay = Rp" + total7);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                          
                            } else if (akomodasi == 2) {
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                System.out.println("This package includes 4D3N Hotel & Transportation");
                                System.out.println("Your destination is Lombok");
                                System.out.println("You Choice Transportation Plane");
                                total8 = pesawat4 + hotel4 - ((pesawat4 + hotel4) * 0.1);
                                System.out.println("Departure 10-01-2019 (10.00)");
                                System.out.println("Your Total Pay = Rp" + total8);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                    
                            } else {
                          
                            }

                        }
                        break;
                    }
                    
                    double member, bayar1 = 1200000, member2, member3, member4;
                    switch (tanggal) {
                        case 2:
                        System.out.println("       ====LIST TRAVEL====      ");
                        System.out.println("        =20 Januari 2019=        ");
                        System.out.println("       ==Departure Malang==        ");
                        System.out.println("1.Singapore");
                        System.out.println("2.Malaysia");
                        System.out.print("Choose The Trip You Want = ");
                        trip2 = sc.nextInt();
                        if (trip2 == 1) {
                            System.out.println("=================================");
                            System.out.println("1.Garuda Indonesia (Rp.1,2Jt)(09.00 Am)");
                            System.out.println("2.Garuda Indonesia (Rp.3,2Jt)(09.00 Am) + HOTEL");
                            System.out.println("3.Cathay Airlaines (Rp.1,5Jt)(15.00 Pm)");
                            System.out.println("4.Cathay Airlaines (Rp.3,5Jt)(15.00 Pm) + HOTEL");
                            System.out.print("Choose Your Airlines = ");
                            menu = sc.nextInt();
                            if (menu == 1) {
                                System.out.println("=================================");
                                System.out.println("       DETAILS OF YOUR ORDER      ");
                                System.out.println("Your destination is Singapore ");
                                System.out.println("You are Using Garuda Indonesia Airlines");
                                System.out.println("Departure 20-01-2019 (09.00)");
                                System.out.println("Your Total Pay Rp.1.200.000");
                                member = bayar1 * 0.1;
                                member2 = bayar1 - member;
                                System.out.println("(MEMBER)Your Total Pay Rp." + member2);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                         
                            } else if (menu == 2) {
                                System.out.println("=================================");
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                System.out.println("Your destination is Singapore 3D3N");
                                System.out.println("You are Using Garuda Indonesia Airlines");
                                System.out.println("Departure 20-01-2019 (09.00)");
                                System.out.println("Your Total Pay Rp.3.200.000");
                                member = 3200000 * 0.1;
                                member2 = 3200000 - member;
                                System.out.println("(MEMBER)Your Total Pay Rp." + member2);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                
                            } else if (menu == 3) {
                                System.out.println("=================================");
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                System.out.println("Your destination is Singapore 3D3N ");
                                System.out.println("You use the Cathay Airlaines airline");
                                System.out.println("Departure 20-01-2019 (15.00)");
                                System.out.println("Your Total Pay Rp.1.500.000");
                                member = 1500000 * 0.1;
                                member3 = 1500000 - member;
                                System.out.println("(MEMBER)Your Total Pay Rp." + member3);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                     
                            } else if (menu == 4) {
                                System.out.println("=================================");
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                System.out.println("Your destination is Singapore 3D3N");
                                System.out.println("You use the Cathay Airlaines airline");
                                System.out.println("Departure 20-01-2019 (15.00)");
                                System.out.println("Your Total Pay Rp.3.500.000");
                                member = 3500000 * 0.1;
                                member4 = 3500000 - member;
                                System.out.println("(MEMBER)Your Total Pay Rp." + member4);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                              
                            } else {
                         
                            }
                        } else {
                        
                        
                        }
                        double member7,member8,member10,member9;
                        if (trip2 == 2) {
                            System.out.println("=================================");
                            System.out.println("1.Garuda Indonesia (Rp.1,5Jt)(12.00 Am)");
                            System.out.println("2.Garuda Indonesia (Rp.3,7Jt)(12.00 Am) + HOTEL");
                            System.out.println("3.Cathay Airlaines (Rp.2,0Jt)(09.00 Pm)");
                            System.out.println("4.Cathay Airlaines (Rp.4,0Jt)(09.00 Pm) + HOTEL");
                            System.out.print("Choose Your Airlines = ");
                            menu = sc.nextInt();
                            if (menu == 1) {
                                System.out.println("=================================");
                                System.out.println("       DETAILS OF YOUR ORDER      ");
                                System.out.println("Your destination is Malaysia ");
                                System.out.println("You are Using Garuda Indonesia Airlines");
                                System.out.println("Departure 20-01-2019 (12.00)");
                                System.out.println("Your Total Pay Rp.1.500.000");
                                member7 =(1500000-(1500000 * 0.1));
                                System.out.println("(MEMBER)Your Total Pay Rp." + member7);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
         
                            } else if (menu == 2) {
                                System.out.println("=================================");
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                System.out.println("Your destination is Malaysia 3D3N");
                                System.out.println("You are Using Garuda Indonesia Airlines");
                                System.out.println("Departure 20-01-2019 (12.00)");
                                System.out.println("Your Total Pay Rp.3.700.000");
                                member8 =(3700000-(3700000 * 0.1));
                                
                                System.out.println("(MEMBER)Your Total Pay Rp." + member8);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                     
                            } else if (menu == 3) {
                                System.out.println("=================================");
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                System.out.println("Your destination is Malaysiae 3D3N ");
                                System.out.println("You use the Cathay Airlaines airline");
                                System.out.println("Departure 20-01-2019 (09.00)");
                                System.out.println("Your Total Pay Rp.2.000.000");
                                member9 =(2000000-(20000* 0.1));
                               
                                System.out.println("(MEMBER)Your Total Pay Rp." + member9);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                         
                            } else if (menu == 4) {
                                System.out.println("=================================");
                                System.out.println("       DETAILS OF YOUR ORDER       ");
                                System.out.println("Your destination is Singapore 3D3N");
                                System.out.println("You use the Cathay Airlaines airline");
                                System.out.println("Departure 20-01-2019 (09.00)");
                                System.out.println("Your Total Pay Rp.4.000.000");
                                member10 =(4000000-( 4000000 * 0.1));
                                System.out.println("(MEMBER)Your Total Pay Rp." + member10);
                                System.out.println("\u2764 PLEASE COME TO THE TRAVEL RR OFFICE ON TIME \u2764");
                       
                            } else {
                             
                            }
                        } else {

                        }
                     default: 

                    }

                

        }
    }


