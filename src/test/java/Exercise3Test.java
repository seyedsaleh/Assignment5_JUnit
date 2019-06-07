
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Exercise3Test {
    Exercise3 test = new Exercise3();
    @Test
    void StrCheckerTest() {
        assertEquals("A1B2C3D4", test.StrChecker("A1B2C3D4",""), "P2 is null");
        assertEquals("", test.StrChecker("A1B2C3D4", "A1B2C3D4"), "P1 and P2 are equal");
        assertEquals("1234", test.StrChecker("A1B2C3D4", "ABCD"), "Result is just numbers");
    }
}