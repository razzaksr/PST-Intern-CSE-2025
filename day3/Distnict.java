package day3;

public class Distnict {
    public static void main(String[] args) {
        // int[] numbers = {131, 11, 48};
        int[] numbers = {111, 222, 333, 4444, 666};
        boolean[] digits = new boolean[10];
        int reminder = 0;
        for(int each : numbers){
            while(each>0){
                reminder = each%10;
                digits[reminder] = true;
                each/=10;
            }
        }
        for(int index=0;index<digits.length;index++){
            if(digits[index])
                System.out.print(index+" ");
        }
    }
}
