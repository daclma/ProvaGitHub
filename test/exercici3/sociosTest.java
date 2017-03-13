/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici3;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class sociosTest {
    
    public sociosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of introduirDades method, of class socios.
     */
    @Test
    public void testIntroduirDades() throws Exception {
        System.out.println("introduirDades");
        socios instance = new socios();
        instance.introduirDades();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarSoci method, of class socios.
     */
    @Test
    public void testMostrarSoci() throws IOException {
        System.out.println("mostrarSoci");
        String[] dades = {"Barcelona", "Barcelona", "08032", "Victor Cantizano Fernandez", 
            "12345678M", "Calle Valencia, 10, Atico", "638222273", "0", "vicafe@bemen3.cat", 
            "12/01/1993", "001", "21/09/2016", "10", "100", "0", "5", "10", "29/01/2017", "Correcto"};
        socios instance = new socios();
        instance.mostrarSoci(dades);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class socios.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        socios.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
