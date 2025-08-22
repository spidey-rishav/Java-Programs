package packageone;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int result = 0;
        while (t>0){
            int digit = t%10;
            result += (digit*digit*digit);
            t /= 10;
        }
        if(result == n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

