package day8;

import java.util.Arrays;

public class CoinChangeViaDP {
    public static int dispense(int[] denom, int required){
        int[] possiblity = new int[required+1];
        Arrays.fill(possiblity, required+1);
        possiblity[0]=0;
        for(int currency:denom){
            for(int index = currency;index<=required;index++){
                possiblity[index] = Math.min(possiblity[index],possiblity[index-currency]+1);
            }
        }

        return (possiblity[required]<required+1)?possiblity[required]:-1;
    }
    public static void main(String[] args) {
        System.out.println(dispense(new int[]{100,500,200}, 200));
        System.out.println(dispense(new int[]{100,500,200}, 300));
        System.out.println(dispense(new int[]{100,500,200}, 8700));
        System.out.println(dispense(new int[]{100,500,200}, 250));
    }
}
