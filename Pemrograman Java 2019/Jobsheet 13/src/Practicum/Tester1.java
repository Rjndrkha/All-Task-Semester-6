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
public class Tester1 {
    public static void main(String args[]){
        PermanentEmployee pEmp=new PermanentEmployee("Dodik", 500);
        InternshipEmpployee iEmp=new InternshipEmpployee("Sularto", 5);
        ElectricityBill eBll=new ElectricityBill(5, "A-1");
        Employee e;
        Payable p;
        
        e=pEmp;
        e=iEmp;
        p=pEmp;
        p=eBll;
    }
}
