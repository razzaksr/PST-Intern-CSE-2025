package day1;

import java.util.Scanner;

public class MaxPayers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = 0.0, firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE; 
        for(int payers = 1; payers <= 10; payers++){
            System.out.println("Tell us the income");
            income = scanner.nextDouble();
            if(firstMax<=income){
                secondMax = firstMax;
                firstMax = income;
            }
            else if(secondMax<=income&&income==firstMax){
                secondMax = income;
            }
        }
        System.out.println("Highest tax payers are "+firstMax+" and "+secondMax);
        scanner.close();
    }
}
