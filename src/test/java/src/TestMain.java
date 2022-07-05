package src;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class TestMain {
    
    @Test
    public void TestInputIsEven() {
        assertTrue(Main.EvenChecker(23));
    }
}
