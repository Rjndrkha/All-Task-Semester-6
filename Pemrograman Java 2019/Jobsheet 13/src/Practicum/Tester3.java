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
public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp= new PermanentEmployee("Dodik", 500);
        InternshipEmpployee iEmp=new InternshipEmpployee("Sularto", 5);
        ElectricityBill eBill=new ElectricityBill(5, "A-1");
        Employee e[]={pEmp,iEmp};
        Payable p[]={pEmp,eBill};
        //Employee e2[]={pEmp,iEmp,eBill};
    }
}
