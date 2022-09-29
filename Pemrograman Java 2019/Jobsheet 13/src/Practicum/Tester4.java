/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicum;

/**
 *
 * @author Rajendra Rakha
 */
public class Tester4 {

    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill);//pay for electrical bill
        System.out.println("---------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dodik", 500);
        ow.pay(pEmp);//pay for permanent Employee

        InternshipEmpployee iEmp = new InternshipEmpployee("Sularto", 5);
        ow.showMyEmployee(iEmp);//show permanent employee info
        System.out.println("--------------------------------");
        ow.showMyEmployee(iEmp);//show internship employee info
        
    }
}
