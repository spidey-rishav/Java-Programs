package packageone;

import java.io.*;

public class RemoveDuplicates {
    public static String removeDuplicateInString(boolean[] present, String str, int idx, StringBuilder word){
        if(idx == str.length()){
            return word.toString();
        }

        int i = str.charAt(idx) - 'a';
        if(!present[i]){
            present[i] = true;
            word.append(str.charAt(idx));
        }
        return removeDuplicateInString(present, str, idx+1, word);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.write(removeDuplicateInString(new boolean[26], str, 0, new StringBuilder("")));
        bw.flush();
    }
}
