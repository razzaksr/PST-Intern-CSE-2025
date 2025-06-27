package day7;
public class CoinChangeViaDC {
    public static int dispense(int[] arr, int required, int index, int count){
        if(required<=0||index<=0)
            return required>0?-1:count;
        if(required>=arr[index]){
            required -= arr[index];
            count++;
        }
        else{
            index--;
        }
        return dispense(arr, required, index, count);
    }
    public static void main(String[] args) {
        int[] available = {100,200,500};
        System.out.println(dispense(available, 8700, available.length-1,0));
        System.out.println(dispense(available, 8750, available.length-1,0));
    }
}
