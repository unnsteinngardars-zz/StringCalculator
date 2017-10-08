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
        assertEquals(1, StringCalculator.Add("1"));
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

    @Test
    public void testSeperateByCommaOrNewLine(){
        assertEquals(6, StringCalculator.Add("1\n2,3"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumber(){
        try{
            StringCalculator.Add("-1");
        }
        catch(IllegalArgumentException e){
            System.out.print(e.getMessage());
            throw(e);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumbers(){
        try{
            StringCalculator.Add("-1,-2,3,-4");
        }
        catch(IllegalArgumentException e){
            System.out.print(e.getMessage());
            throw(e);
        }
    }

    @Test
    public void testOneNumberAbove1000(){
        assertEquals(0, StringCalculator.Add("2000"));
    }

    @Test
    public void testTwoNumbersOneAbove1000(){
        assertEquals(2, StringCalculator.Add("2,2000"));
    }

    @Test
    public void testCustomDelimeterWithOneNumber(){
        assertEquals(2, StringCalculator.Add("//;\n2"));
    }

    @Test
    public void testCustomDelimeterWithTwoNumbers(){
        assertEquals(3, StringCalculator.Add("//;\n2;1"));
    }

    @Test
    public void testCustomDelimeterWithMultipleNumbers(){
        assertEquals(6, StringCalculator.Add("//;\n2;3;1"));
    }

    @Test
    public void testMultipleDelimeters(){
        assertEquals(10, StringCalculator.Add("//;\n4;3,2\n1"));
    }

}

