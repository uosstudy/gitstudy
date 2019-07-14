package sig.oss.mycalculator;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test; 

/**
 * Unit test for simple App.
 */
public class CalcTest 
//    extends TestCase
{
    @Test
    public void testAdd()
    {
    	Calc c = new Calc();
    	c.add(10,  20);
        assertEquals(30, c.getResult());
    }
    @Test
    public void testSub()
    {
    	Calc c = new Calc();
    	c.sub(10,  20);
        assertEquals(-10, c.getResult());
    }
}
