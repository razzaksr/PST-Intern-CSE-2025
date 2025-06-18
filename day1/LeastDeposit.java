package day1;

import java.util.Scanner;

public class LeastDeposit{
    public static void main(String[] args) {
        // initialization
        int tokens = 0, cash = 0, least = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell us how many tokens are distributed for deposit's ");
        tokens = scanner.nextInt(); // 20
        // repeat get deposits from specified tokens
        while(tokens>0){
            System.out.println("Tell us the amount to be deposited ");
            cash = scanner.nextInt();
            if(cash<=least)
                least = cash;
            tokens--;
        }
        System.out.println("Least Deposited value is "+least);
        scanner.close();
    }
}