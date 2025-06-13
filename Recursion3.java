import java.io.*;
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
        int pow = xPown2(x, n/2);
        if((n&1)==1){
            return pow * pow * x;
        }

        return pow*pow;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        String[] input = br.readLine().split(" ");

        int x = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        bw.write(String.valueOf(xPown(x, n)));
        bw.newLine();
        bw.write(String.valueOf(xPown2(x, n)));
        bw.newLine();
        bw.flush();

    }
}
