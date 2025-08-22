package packageone;

import java.io.*;

public class RotatedSortedArray {
    public static int search(int[] ar, int target, int si, int ei){
        if(si > ei){
            return -1;
        }
        int mid = si + (ei - si)/2;

        if(ar[mid] == target){
            return mid;
        }
        if(ar[si] < ar[mid]){
            //case a
            if(ar[si] <= target && target <= ar[mid]){
                return search(ar, target, si, mid-1);
            }
            else{
                return search(ar, target, mid+1, ei);
            }
        }
        else{
            //case b
            if(ar[mid] <= target && target <= ar[ei]){
                return search(ar, target, mid+1, ei);
            }
            else{
                return search(ar, target, si, mid-1);
            }
        }
    }
    public static int searching(int[] ar, int target){
        //iterative code of recursive code
        int si = 0;
        int ei = ar.length-1;

        while(si<=ei){
            int mid = si + (ei - si)/2;

            if(ar[mid] == target){
                return mid;
            }
            if(ar[si] < ar[mid]){
                //case a
                if(ar[si] <= target && target <= ar[mid]){
                    ei = mid - 1;
                }
                else{
                    si = mid + 1;
                }
            }
            else{
                //case b
                if(ar[mid] <= target && target <= ar[ei]){
                    si = mid + 1;
                }
                else{
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] ar = {4, 5, 6, 7, 9, 1, 2};
        int target = 0;
        bw.write(String.valueOf(search(ar, target, 0, ar.length-1)));
        bw.newLine();
        bw.write(String.valueOf(searching(ar, target)));
        bw.newLine();
        bw.flush();
    }
}
