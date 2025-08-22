package packageone;

import java.io.*;

public class QuickSort {
    public static void quickSort(int[] ar, int low, int high){
        if(low>=high){
            return;
        }

        int idx = partition(ar, low, high);
        quickSort(ar, low, idx-1);
        quickSort(ar, idx+1, high);
    }

    public static int partition(int[] ar, int low, int high){
        int pivot = ar[high];
        int i = low-1; //to make place for element smaller than pivot

        for(int j=low; j<high; j++){
            if(ar[j] <= pivot){
                i++;
                int temp = ar[j];
                ar[j] = ar[i];
                ar[i] = temp;
            }
        }
        i++;
        int temp = ar[high];
        ar[high] = ar[i];
        ar[i] = temp;

        return i;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] ar = {6, 3, 9, 5, 2, 8};
        quickSort(ar, 0, ar.length-1);

        for(int i=0; i< ar.length; i++){
            bw.write(String.valueOf(ar[i]) + " ");
        }
        bw.newLine();
        bw.flush();
    }
}
