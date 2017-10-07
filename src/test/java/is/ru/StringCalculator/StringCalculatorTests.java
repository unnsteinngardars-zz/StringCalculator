package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTests{

    @Test
    public void testEmptyString(){
        assertEquals(0, StringCalculator.Add(""));
    }

    @Test
    public void testOneNumber(){
        assertEquals(1, StringCalculator.Add("2"));
    }

    @Test
    public void TestTwoNumbers(){
        assertEquals(3, StringCalculator.Add("1,2"));
    }

    @Test
    public void TestMultipleNumbers(){
        assertEquals(6, StringCalculator.Add("1,2,3"));
    }
}

