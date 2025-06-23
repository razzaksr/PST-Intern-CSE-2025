package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortOddEven {
    public static void main(String[] args) {
        // original
        // int[] source = {1, 2, 3, 5, 4, 7, 10};
        int[] source = {0, 4, 5, 3, 7, 2, 1};
        // odd
        List<Integer> oddList = new ArrayList<>();
        // even
        List<Integer> evenList = new ArrayList<>();
        // spli and save odd abd evens 
        for(int each:source){
            if(each%2!=0)
                oddList.add(each);
            else
                evenList.add(each);
        }
        // sort odd into reverese and even into ascending
        oddList.sort(Collections.reverseOrder());
        Collections.sort(evenList);
        // replace original with odd and even
        for(int index = 0;index<source.length;index++){
            if(index<oddList.size())
                source[index] = oddList.get(index);
            else
                source[index] = evenList.get(index-evenList.size()-1);
        }
        System.out.println(Arrays.toString(source));
    }
}
