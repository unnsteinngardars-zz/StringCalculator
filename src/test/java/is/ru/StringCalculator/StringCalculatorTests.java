package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTests{

    @Test
    public void testEmptyString(){
        assertEquals(0, StringCalculator.Add(""));
    }
}

