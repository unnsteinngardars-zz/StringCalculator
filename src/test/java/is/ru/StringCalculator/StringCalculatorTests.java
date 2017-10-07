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
    public void testTwoNumbers(){
        assertEquals(3, StringCalculator.Add("1,2"));
    }

    @Test
    public void testMultipleNumbers(){
        assertEquals(6, StringCalculator.Add("1,2,3"));
    }

    @Test
    public void testSeparateByNewLine(){
        assertEquals(6, StringCalculator.Add("1\n2\n3"));
    }
}

