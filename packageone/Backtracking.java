import java.io.*;
import java.util.*;

public class Backtracking {

    public static void changeAr(int[] ar, int i, int val){
        //base case
        if(i==ar.length){
            printAr(ar);
            return;
        }
        //recursion
        ar[i] = val;
        changeAr(ar, i+1, val+1);
        ar[i] = ar[i] - 2; //or (val - 2)
    }

    public static void printAr(int[] ar){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] ar = new int[5];
        changeAr(ar, 0, 1);
        printAr(ar);
        bw.flush();
    }
}

