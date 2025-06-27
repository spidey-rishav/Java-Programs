import java.util.*;
public class ContainMostWater {
    public static int containMaxWater(int[] ar){
        int p1 = 0, p2 = ar.length-1;
        int ans = Integer.MIN_VALUE;
        while(p1<p2){
            int height = Math.min(ar[p1], ar[p2]);
            int length = p2-p1;
            ans = Math.max(ans, height*length);
            if(ar[p1] < ar[p2]){
                p1++;
            }
            else{
                p2--;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] ar = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(containMaxWater(ar));
    }
}
