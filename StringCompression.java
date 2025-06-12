import java.util.*;

public class StringCompression {
    public static String stringCompress(String str){
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                sb.append(str.charAt(i-1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1));
        sb.append(count);
        return sb.toString();
    }
    //hi i am rishav
    //Hi I Am Rishav

    public static String compress(String str){
        String newStr = "";

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args){
        String str = "aaabbcccdd";
        System.out.println(stringCompress(str));
        System.out.println(compress(str));
    }
}