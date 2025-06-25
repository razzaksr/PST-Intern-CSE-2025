package day6;

public class IsSubsequence {
    public static int isSequence(String src,String phrase){
        int alpha = 0, beta = 0;
        while(alpha<src.length()&&beta<phrase.length()){
            if(src.charAt(alpha)==phrase.charAt(beta)){
                beta++;
            }
            alpha++;
        }
        return (beta==phrase.length())?1:0;
    }
    public static void main(String[] args) {
        String phrase = "TCS";
        String name = "Tata Consultancy Services";
        System.out.println(isSequence(name, phrase));
    }
}
