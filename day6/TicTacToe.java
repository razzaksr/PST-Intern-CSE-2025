package day6;

public class TicTacToe {
    public static int steps(String str){
        int counter = 0;
        for(int index = 0;index<str.length();){
            if(str.charAt(index)=='X'){
                index+=3;
                counter++;
            }
            else
                index++;
        }
        return counter;
    }
    public static void main(String[] args) {
        String src = "XOXX";
        System.out.println(steps(src));
        src = "XXX";
        System.out.println(steps(src));
        src = "OOOO";
        System.out.println(steps(src));
    }
}
