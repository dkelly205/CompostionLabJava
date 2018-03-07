import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void setUp() throws Exception {
        keyboard = new Keyboard("Qwerty");

    }

    @Test
    public void testType(){
        assertEquals("Qwerty", keyboard.getType());
    }
}
