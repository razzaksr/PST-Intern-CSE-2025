package day2;

import java.util.Arrays;

public class IPL {
    public static void main(String[] args) {
        int[] overs = {20,0,19,5,0,3,10,0,2};
        int index=0, valid =0, size = overs.length;

        while(index<size){
            if(overs[index]!=0){
                overs[valid]=overs[index];
                valid++;
            }
            index++;
        }

        Arrays.fill(overs,valid,size,0);
        System.out.println(Arrays.toString(overs));

    }
}
