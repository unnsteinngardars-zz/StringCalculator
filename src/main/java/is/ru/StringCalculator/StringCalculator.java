package is.ru.stringcalculator;

public class StringCalculator{

    public static int Add(String text){
        if(text.equals(""))
            return 0;
        else{
            if(text.contains(",")){
                String numbers [] = text.split(",");
                return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
            }
        }
        return 1;
    }

    public static void main(String[] args){

    }

}