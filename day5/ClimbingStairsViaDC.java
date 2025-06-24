package day5;

public class ClimbingStairsViaDC {
    public static int climb(int number){
        if(number<=0)
            return 0;
        else if(number==1)
            return 1;
        else if(number==2)
            return 2;
        else
            return climb(number-1)+climb(number-2);
    }
    public static void main(String[] args) {
        System.out.println(climb(-1));
    }
}
