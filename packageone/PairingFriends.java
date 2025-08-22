package packageone;

import java.io.*;

public class PairingFriends {
    public static int pairingFriends(int n){
        if(n==1 || n==2){
            return n;
        }

        return pairingFriends(n-1) + (n-1)*pairingFriends(n-2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(pairingFriends(n)));
        bw.flush();
    }
}
