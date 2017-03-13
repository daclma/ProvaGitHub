/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2;

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
public class NumComplejosTest {
    private NumComplejos numCom1;
    private NumComplejos numCom2;
    private NumComplejos numCom3;
    
    public NumComplejosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        numCom1 = new NumComplejos(1.0, 0.0);
        numCom2 = new NumComplejos(0.0, 1.0);
        numCom3 = new NumComplejos(1.0, 1.0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getReal method, of class NumComplejos.
     */
    @Test
    public void testGetReal() {
        System.out.println("getReal");
        NumComplejos instance = numCom1;
        double expResult = 1.0;
        double result = instance.getReal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getImaginario method, of class NumComplejos.
     */
    @Test
    public void testGetImaginario() {
        System.out.println("getImaginario");
        NumComplejos instance = numCom2;
        double expResult = 1.0;
        double result = instance.getImaginario();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of suma method, of class NumComplejos.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        boolean expResult = true;
        NumComplejos resultSuma = numCom2.suma(numCom1);
        boolean result = numCom3.igual(resultSuma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class NumComplejos.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        boolean expResult = true;
        NumComplejos resultMultip = numCom2.multiplicacion(numCom1);
        boolean result = numCom2.igual(resultMultip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of igual method, of class NumComplejos.
     */
    @Test
    public void testIgual() {
        System.out.println("igual");
        //Object anObject = null;
        NumComplejos instance = numCom1;
        boolean expResult = false;
        boolean result = instance.igual(numCom2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
