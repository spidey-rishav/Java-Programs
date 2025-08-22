package packageone;

import java.io.*;

public class TilingPrice {
    public static int tilingWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int vertical =  tilingWays(n-1);

        //horizontal choice
        int horizontal = tilingWays(n-2);

        return  vertical + horizontal;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(tilingWays(n)));
        bw.newLine();
        bw.flush();
    }
}
