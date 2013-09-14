
package NICtest;
import nicPackage.NicInterpreter;
import junit.framework.TestCase;

public class NicInterpreterTest extends TestCase{

    @Override
    
    protected void setUp() throws Exception {
        super.setUp();
        
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
                
    }

    public void testGetYear()throws Exception {
        System.out.println("getYear");
        NicInterpreter instance = new NicInterpreter("920112862V");
        int expResult = 1992;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    public void testGetMonth()throws Exception {
        System.out.println("getMonth");
        NicInterpreter instance = new NicInterpreter("920112862V");
        int expResult = 1;
        int result = instance.getMonth();
        assertEquals(expResult, result);
       
    }

    public void testGetDate()throws Exception {
        System.out.println("getDay");
        NicInterpreter instance = new NicInterpreter("920112862V");
        int expResult = 11;
        int result = instance.getDate();
        assertEquals(expResult, result);

    }

    public void testGetGender()throws Exception {
        System.out.println("getGender");
        NicInterpreter instance = new NicInterpreter("920112862V");
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);

    }

    public void testIsVoter()throws Exception {
        System.out.println("isVoter");
        NicInterpreter instance = new NicInterpreter("920112862V");
        String expResult = "True";
        String result = instance.isVoter();
        assertEquals(expResult, result);

    }

}
