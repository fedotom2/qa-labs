import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerExceptionTest {
    static ManagerException ex;

    @BeforeAll
    public static void init() {
        ex = new ManagerException();
        ex.addList(Critical.class.getCanonicalName());
    }

    @Test
    void isCritical() {
        Critical critical = new Critical();

        boolean isCritical = ex.isCritical(critical);
        assertTrue(isCritical);
    }
    @Test
    void isNoCritical() {
        NonCritical critical = new NonCritical();

        boolean isCritical = ex.isCritical(critical);
        assertFalse(isCritical);
    }

}