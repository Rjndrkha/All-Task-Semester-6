/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapp_javacloth;

import java.sql.Connection;
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
 * @author ASUS
 */
public class INVENTORYTest extends TestCase{
    INVENTORY instance;
    
    public INVENTORYTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new INVENTORY("nama", "celana","7","1","3","2");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setKoneksi method, of class INVENTORY.
     */
    /**
     * Test of simpan method, of class INVENTORY.
     */
    @Test
    public void testSimpan() {
        System.out.println("simpan");
        this.instance.simpan();
        ArrayList expResult = instance.getData("nama");
        assertTrue(expResult.size()>0);
    }
}
