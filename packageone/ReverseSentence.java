package packageone;

import java.io.*;
import java.util.*;

public class ReverseSentence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        String[] input = word.trim().split("\\s+");
        Stack<String> str = new Stack<>();

        for(int i=0; i<input.length; i++){
            str.push(input[i]);
        }
        while(!str.isEmpty()){
            bw.write(str.pop() + " ");
        }
        bw.newLine();
        bw.flush();
    }
}
