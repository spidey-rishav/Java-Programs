import java.util.*;

public class Strings {
    public static void main(String[] args){

//        char arr[] = {'a', 'b', 'c', 'd'};
//        String str = "abcd";
//        String str2 = new String("xyz");
//
//        //String are immutable.
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println(name);
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
