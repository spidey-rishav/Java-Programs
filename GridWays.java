import java.io.*;
import java.util.*;

public class GridWays {
    public static int gridWays(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        else if(i==n-1 && j==m-1){
            return 1;
        }
        return gridWays(i+1, j, n, m) + gridWays(i, j+1, n, m);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int n = 3, m = 3;
        bw.write(String.valueOf(gridWays(0, 0, n, m)));
        bw.newLine();
        bw.flush();
    }
}
