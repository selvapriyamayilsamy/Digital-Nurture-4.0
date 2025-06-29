import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);              // assertEquals
        assertTrue(5 > 3);                   // assertTrue
        assertFalse(5 < 3);                  // assertFalse
        assertNull(null);                   // assertNull
        assertNotNull(new Object());        // assertNotNull
    }
}
