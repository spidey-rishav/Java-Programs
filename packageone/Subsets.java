import java.io.*;

public class Subsets {
    public static void printSubsets(String str, int idx, String ans){
        if(idx == str.length()){
            System.out.println(ans);
            return;
        }
        printSubsets(str, idx+1, ans + str.charAt(idx));
        printSubsets(str, idx+1, ans);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "abc";
        printSubsets(str, 0, "");
    }
}
