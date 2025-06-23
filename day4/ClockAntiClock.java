package day4;

import java.util.Arrays;
import java.util.Scanner;

public class ClockAntiClock {
    public static void main(String[] args) {
        int[] source = {111, 222, 333, 4444, 666};
        int size = source.length;
        int[] anti = new int[size];
        int[] clock = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell us rotation ");
        int shift = scanner.nextInt();
        int rotIndex = 0 ;
        // anti clock wise
        for(int index = 0; index < size;index++ ){
            rotIndex = (index - shift+size)%size;
            anti[index] = source[rotIndex];
        }
        System.out.println(Arrays.toString(anti));
        // clock wise
        for(int index = 0; index < size;index++ ){
            rotIndex = (index + shift+size)%size;
            clock[index] = source[rotIndex];
        }
        System.out.println(Arrays.toString(clock));
        scanner.close();
    }
}
