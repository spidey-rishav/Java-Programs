package packageone;

import java.io.*;

public class BinaryString {
    public static void binaryString(int n, int lastPlace, String word){
        if(n==0){
            System.out.println(word);
            return;
        }
//        if(lastPlace==0){
//            binaryString(n-1, 0, word.append("0"));
//            binaryString(n-1, 1, word.append("1"));
//        }
//        else{
//            binaryString(n-1, 0, word.append("0"));
//        }

        binaryString(n-1, 0, word+"0");
        if(lastPlace==0){
            binaryString(n-1, 1, word+"1");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        binaryString(n, 0, "");
    }
}
