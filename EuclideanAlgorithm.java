import java.io.BufferedReader;
import java.util.*;
public class EuclideanAlgorithm {
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else {
            return gcd(b, a%b);
        }
    }
    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);

//        BufferedReader bf = new BufferedReader();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
    }
}
