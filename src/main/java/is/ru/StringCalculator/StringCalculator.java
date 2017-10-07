package is.ru.stringcalculator;

public class StringCalculator{

    public static int Add(String text){
        if(text.equals(""))
            return 0;
        else{
            if(text.contains(",")){
                String numbers [] = text.split(",");
                int sum = 0;
                for(String number: numbers){
                    sum += toInt(number);
                }
                return sum;
            }
        }
        return 1;
    }

    private static int toInt(String number){
        return Integer.parseInt(number);
    }

    public static void main(String[] args){

    }

}