package hdt8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gerardo
 */
public class VectorHeapTest {
    
    public VectorHeapTest() {
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
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        Object num1 = 205;
        Object num2 = 105;
        Object num3 = 158;
        instance.add((Comparable) num1);
        instance.add((Comparable) num2);
        instance.add((Comparable) num3);
        Object result = instance.remove();
        Object expResult = 105;
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object value = "Value";
        VectorHeap instance = new VectorHeap();
        instance.add((Comparable) value);
    }
    
}
