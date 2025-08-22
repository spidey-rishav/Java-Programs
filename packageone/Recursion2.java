package packageone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion2 {
//    public static boolean sortedArray(int[] ar, int n, int idx){ //Time Complexity -> O(n), Space Complexity -> O(n)
//        if(idx == n-1){
//            return true;
//        }
////        return (ar[idx]<=ar[idx+1]) && (sortedArray(ar, n, idx+1));
//        //OR
//        if(ar[idx] > ar[idx+1]){
//            return false;
//        }
//        return sortedArray(ar, n, idx+1);
//
//    }

    public static int firstOccurence(int[] ar, int n, int x, int idx){
        if(idx == n){
            return -1;
        }

        if(ar[idx] == x){
            return idx;
        }

        return firstOccurence(ar, n, x, idx+1);
    }
    public static int lastOccurence(int[] ar, int n, int x, int idx){
        if(idx == -1){
            return -1;
        }

        if(ar[idx] == x){
            return idx;
        }

        return lastOccurence(ar, n, x, idx-1);
    }

    public static int lastOccurence2(int[] ar, int n, int x, int idx){
        if(idx == ar.length){
            return -1;
        }
        int isFound = lastOccurence2(ar, n, x, idx+1);
        if(isFound == -1 && ar[idx] == x){
            return idx;
        }

        return isFound;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] ar = new int[n];

        for(int i=0; i<n; i++){
            ar[i] = Integer.parseInt(input[i]);
        }

        int x = Integer.parseInt(br.readLine());

        System.out.println(firstOccurence(ar, n, x, 0));
        System.out.println(lastOccurence(ar, n, x, n-1));
        System.out.println(lastOccurence2(ar, n, x, 0));


//        System.out.println(sortedArray(ar, n, 0));

    }
}
