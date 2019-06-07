
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Exercise1Test {
    Exercise1 test = new Exercise1();
    @Test
    void loginTest() {
        assertFalse(test.login("",""));
        assertFalse(test.login("user",""));
        assertFalse(test.login("","pass"));
        assertFalse(test.login("user**************************","pass"));
        assertFalse(test.login("user","pass**************************"));
        assertFalse(test.login("user**************************","pass**************************"));
        assertFalse(test.login("wrong_user","wrong_pass"));
        assertTrue(test.login("user","pass"));
    }

    @Test
    void checkLogininDBTest() {
        assertFalse(test.checkLogininDB("wrong_user", "wrong_pass"));
        assertTrue(test.checkLogininDB("user", "pass"));
    }
}