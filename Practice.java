import java.util.*;

//public class Practice {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0){
//            int n = sc.nextInt();
//            int[] ar = new int[n];
//            for(int i=0; i<n; i++){
//                ar[i] = sc.nextInt();
//            }
//            int count =0;
//            for(int i=0; i<n; i++){
//                if(ar[i] == 1){
//                    count++;
//                }
//            }
//            if(count == 0){
//                System.out.println("Yes");
//            } else if (count> n-1) {
//                System.out.println("Yes");
//            }
//            else{
//                System.out.println("No");
//            }
//        }
//
//    }
//}



//class Solution {
//        public static int sumOfDigit(int n){
//        int sum = 0;
//        while(n>0){
//            int digit = n%10;
//            sum += digit;
//            n/=10;
//        }
//        return sum;
//    }
//    public static int smallestIndex(int[] nums) {
//        for(int i=0; i<nums.length; i++){
//            if(sumOfDigit(nums[i]) == i){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(smallestIndex(arr));
//    }
//}



//class Solution1 {
//    public static int smallestIndex(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int t = nums[i];
//            int sum = 0;
//
//            while (t > 0) {
//                int digit = t % 10;
//                sum += digit;
//                t = t / 10;
//            }
//
//            if (sum == nums[i]) {
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(smallestIndex(arr));
//    }
//}




//public class Practice {
//    public static int factorial(int n){
//        if(n==1){
//            return 1;
//        }
//        int result = n*factorial(n-1);
//
//        return  result;
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        System.out.println(factorial(n));
//    }
//}


//import java.io.*;
//
//class Main{
//    public static void year(int n){
//        for(int i=0; i<=100; i++){
//            for(int j=0; j<=100; j++){
//                int sum = i+j;
//                if(sum * sum == n){
//                    System.out.println(i + " " + j);
//                    return;
//                }
//            }
//        }
//        System.out.println("-1");
//    }
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//
//        while (t --> 0){
//            int n = Integer.parseInt(br.readLine());
//
//            year(n);
//        }
//    }
//}


import java.util.*;
import java.io.*;


class Main
{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while(n!=42){
            System.out.println(n);
            n = Integer.parseInt(br.readLine());
        }
    }
}