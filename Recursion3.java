import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Recursion3 {
    public static int xPown(int x, int n){
        if (n==0){
            return 1;
        }

        return x * xPown(x, n-1);
    }
    public static int xPown2(int x, int n){
        if (n==0){
            return 1;
        }
        int pow = xPown(x, n/2);
        if((n&1)==1){
            return pow * pow * n;
        }

        return pow*pow;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int x = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        System.out.println(xPown(x, n));
        System.out.println(xPown2(x, n));


    }
}
