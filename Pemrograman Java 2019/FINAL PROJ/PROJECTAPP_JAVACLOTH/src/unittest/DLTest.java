/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author Njol~
 */
public class DLTest {
    private String username;
    private String password;
    
    public DLTest() {
        username = "admin";
        password = "admin123";
    }
    
    public String formMessage(){
        String message;
        
        message = username + " " + password;
        
        return message;
    }
    
    public static void main(String[] args) {
        DLTest dl = new DLTest();
        
        System.out.println(dl.formMessage());
    }
    
}
