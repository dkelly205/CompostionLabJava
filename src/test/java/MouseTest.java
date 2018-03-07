import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void setUp() throws Exception {
        mouse = new Mouse("wireless", 2);
    }

    @Test
    public void testType(){
        assertEquals("wireless", mouse.getType());
    }

    @Test
    public void testNumberOfButtons(){
        assertEquals(2, mouse.getButtons());
    }

    @Test
    public void testMouseCanMove(){
        assertEquals("moving mouse", mouse.move());
    }

    @Test
    public void testCanClick(){
        assertEquals("Click", mouse.click());
    }
}
