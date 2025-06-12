import java.util.*;
public class Recursion {
    public static void printNumber(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        printNumber(n-1);
        System.out.println(n);
    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int sumOfNnatualNumbers(int n){
        if(n==0){
            return 0;
        }
        return n + sumOfNnatualNumbers(n-1);
    }

    public static int fibonacciNumber(int n){  //Space Complexity -> O(n) , Time Complexity -> O(2^n)
        if(n==0 || n==1){
            return n;
        }

        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }
    public static void main(String[] args){
//        printNumber(10);
//        System.out.println(factorial(10));
//        System.out.println(sumOfNnatualNumbers(10));
        System.out.println(fibonacciNumber(8));
    }
}
