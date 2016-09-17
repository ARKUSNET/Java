package lesson05;

import org.junit.*;
import ru.webapp.WebAppException;

import static org.junit.Assert.*;

/**
 * Created by Айслу on 16.09.2016.
 */
public class CalculatorTest {

    static Calculator calc;

    static {
        calc = new Calculator();
    }

    @BeforeClass
    public static void setBefore() throws Exception {
        // the sample like static block
    }

    @Before
    public void setUp() throws Exception {

    }

    @Test(expected = WebAppException.class)
    public void abs() throws Exception {
        assertEquals(5, calc.abs(-5));
        throw new WebAppException("");
    }
}