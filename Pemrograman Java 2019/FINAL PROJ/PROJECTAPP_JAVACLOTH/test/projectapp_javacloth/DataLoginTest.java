/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapp_javacloth;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import unittest.DLTest;

/**
 *
 * @author Njol~
 */
public class DataLoginTest {
    DLTest DataLoginInstance; 
    
    public DataLoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("* DataLoginTest: Before method setUp()");
        DataLoginInstance = new DLTest();
    }
    
    @After
    public void tearDown() {
        System.out.println("* DataLoginTest: After method setUp()");
    }

//    /**
//     * Test of setKoneksi method, of class DataLogin.
//     */
//    @Test
//    public void testSetKoneksi() {
//        System.out.println("setKoneksi");
//        DataLogin instance = new DataLogin();
//        Connection expResult = null;
//        Connection result = instance.setKoneksi();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of Validasi method, of class DataLogin.
//     */
//    @Test
//    public void testValidasi() {
//        System.out.println("Validasi");
//        String username = "admin";
//        String password = "admin123";
//        DataLogin instance = new DataLogin();
//        boolean expResult = false;
//        boolean result = instance.Validasi(username, password);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
    /**
     * Test of cekData method, of class DataLogin.
     */
    @Test
    public void testCekData() {
        System.out.println("cekData");
        String username = "admin";
        String password = "admin123";
        DataLogin instance = new DataLogin();
        boolean expResult = true;
        boolean result = instance.cekData(username, password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFormMessage() {
        String expResult = "admin admin123";
        String result = DataLoginInstance.formMessage();
        System.out.println("* DataLoginTest: test method 1 testFormMessage()");
        assertEquals(expResult, result);
    }
    
}
