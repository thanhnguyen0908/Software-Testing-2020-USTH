/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestinghomework;

import java.util.Vector;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oOo
 */
public class VectorUnionTest {
    
    public VectorUnionTest() {
    
    }
    
    @BeforeClass
    public static void setUpClass() {
        Vector A = new Vector();
        Vector B = new Vector();
        for(int i = 0;i<10;i++) A.add(i);
        for(int i = -10;i<0;i++) B.add(i);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of UnionAll method, of class VectorUnion.
     */
    @Test
    public void testUnionAll() {
        System.out.println("UnionAll");
        Vector A = new Vector();
        Vector B = new Vector();
        for(int i = 0;i<10;i++) A.add(i);
        for(int i = -10;i<0;i++) B.add(i);
        Vector c = VectorUnion.UnionAll(A,B );
        for(int i = -10;i<10;i++){
            assertTrue(c.contains(i));
        }
        assertFalse(c.contains(-10000));
        assertFalse(c.contains(10000));
        assertFalse(c.contains(20));
        assertFalse(c.contains(-20));
        assertFalse(c.contains("Abc"));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
