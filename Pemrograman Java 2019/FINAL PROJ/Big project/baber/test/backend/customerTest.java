/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ARUM
 */
public class customerTest extends TestCase{
    customer instance;
    public customerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new customer();
        instance.setFirstname("Kelly");
        instance.setLastname("Lark");
        instance.setPhone("807977");
        instance.setGender("Woman");
        instance.setAddress("USA");
        instance.getServis().setId_service(3);
        System.out.format("Start testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish test $s\n", this.getName());
    }
    
    @Test
    public void testSave() {
        System.out.println("save test customer");
        this.instance.save();
        ArrayList<customer> expResult = instance.getByFullCust(instance.getFirstname(), instance.getLastname(), instance.getPhone(), instance.getGender(), instance.getAddress());
        assertTrue(expResult.size()>0);
    }
    
    @Test
    public void testSearch() {
        System.out.println("search");
        String keyword = "Kelly";
        ArrayList<customer> expResult = instance.search(keyword);
        ArrayList<customer> result = instance.getByFullCust(keyword, "", "", "", "");
    }
}
