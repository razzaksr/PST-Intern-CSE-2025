package day2;

public class MissingInvoice {
    public static boolean isMatched(int[] arr,int temp){
        for(int hai:arr){
            if(temp==hai)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] invoices = {45,91,90,92,46};
        int missing = invoices[0];
        
        for(int each : invoices){
            if(missing>=each)
                missing=each;
        }
        while(true){
            int temp = missing+1;
            System.out.println(temp);
            if(isMatched(invoices, temp)){
                System.out.println("matched");
                missing = temp;
            }
            else{
                System.out.println(temp);
                break;
            }
        }
    }
}
