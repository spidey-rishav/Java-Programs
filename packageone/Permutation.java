package packageone;

import java.io.*;

public class Permutation {
    public static void permutation(String str, String ans){
        //base case
         if(str.length() == 0){
             System.out.println(ans);
             return;
         }
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutation(newStr, ans + curr);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        permutation(str, "");
    }
}
