package day3;

import java.util.Arrays;

public class IRCTC {
    public static void main(String[] args) {
        // int[] tickets = {2,0,0,1,0,2,0,1};
        int[] tickets = {1,2,0,1,0,2,1,1,0};
        int start = 0, current = 0, end = tickets.length-1;
        while(current<=end){
            if(tickets[current]==0){
                // swap b/w current and start
                tickets[start]+=tickets[current];
                tickets[current]=tickets[start]-tickets[current];
                tickets[start]-=tickets[current];
                start++;current++;
            }
            else if(tickets[current]==1){
                current++;
            }
            else{
                // swap b/w current and end
                tickets[end]+=tickets[current];
                tickets[current]=tickets[end]-tickets[current];
                tickets[end]-=tickets[current];
                end--;
            }
        }
        System.out.println(Arrays.toString(tickets));
    }
}
