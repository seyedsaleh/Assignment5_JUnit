
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Exercise2Test {
    Exercise2 test = new Exercise2();
    @Test
    void StrBuilderTest() {
        assertEquals("incorrect number", test.StrBuilder(-10), "This number is negative.");
        assertEquals("**********", test.StrBuilder(10), "This test should be 10 character of *");
    }
}