import static org.junit.Assert.*;
import org.junit.*;

public class skillDemo1Tester {
    @Test 
    public void testMultiply(){
        assertEquals(skillDemo1.multiply(3, 4), 12);
    }
}
