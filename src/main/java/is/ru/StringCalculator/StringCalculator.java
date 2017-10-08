package is.ru.stringcalculator;

import edu.princeton.cs.algs4.Queue;

public class StringCalculator{

    public static int Add(String text){
        String sub = "";
        String delimeter = "";
        if(text.equals(""))
            return 0;
        else{  
            if(text.startsWith("//")){
                int index = text.indexOf("\n");
                delimeter = text.substring(2, index);
                sub = text.substring(index+1);
                text = sub;
            }
            String numbers [] = text.split("[\n,"+delimeter+"]");
            return sum(numbers);
            }
    }

    private static int validateNumber(int number){
        if(number > 1000) return 0;
        else return number;
    }

    private static int toInt(String number){
        return Integer.parseInt(number);
    }
    
    private static int sum(String [] numbers){
        Queue<String> negatives = new Queue<String>();
        int sum = 0;
        for(String number: numbers){
            if(number.charAt(0) == '-'){
                negatives.enqueue(number);
            }
            else{
                int num = validateNumber(toInt(number));
                sum += num;
            }
        }
        if(!negatives.isEmpty()){
            String negativeNumbers = "";
            while(!negatives.isEmpty()){
                negativeNumbers += negatives.dequeue();
                if(negatives.size() > 0) negativeNumbers += ", ";
            }
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
        }
        return sum;
    }

    public static void main(String[] args){

    }

}