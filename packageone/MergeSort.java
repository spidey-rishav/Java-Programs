package packageone;

import java.io.*;

public class MergeSort {
    public static void mergeSort(int[] ar, int low, int high){
        if(low>=high){
            return;
        }
        int mid = low + (high - low)/2;
        mergeSort(ar, 0, mid);
        mergeSort(ar, mid+1, high);

        merge(ar, low, high, mid);
    }

    public static void merge(int[] ar, int low, int high, int mid){
        int[] temp = new int[high-low+1];

        int p1 = low, p2 = mid+1, p3 = 0;
        while(p1<=mid && p2<=high){
            if(ar[p1]>ar[p2]){
                temp[p3] = ar[p2++];
            }
            else{
                temp[p3] = ar[p1++];
            }
            p3++;
        }

        while (p1<=mid){
            temp[p3++] = ar[p1++];
        }
        while (p2<=high){
            temp[p3++] = ar[p2++];
        }
        p3 = 0;
        for(int i=low; i<=high; i++){
            ar[i] = temp[p3++];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] ar = {6, 3, 9, 5, 2, 8};
        mergeSort(ar, 0, ar.length-1);

        for(int i=0; i< ar.length; i++){
            bw.write(String.valueOf(ar[i]) + " ");
        }
        bw.newLine();
        bw.flush();
    }
}
