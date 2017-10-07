package is.ru.stringcalculator;

public class StringCalculator{

    public static int Add(String text){
        if(text.equals(""))
            return 0;
        else{
            if(text.contains(",")){
                String numbers [] = text.split(",");
                return sum(numbers);
            }
        }
        return 1;
    }

    private static int toInt(String number){
        return Integer.parseInt(number);
    }
 
    private static int sum(String [] numbers){
        int sum = 0;
        for(String number: numbers){
            sum += toInt(number);
        }
        return sum;
    }

    public static void main(String[] args){

    }

}