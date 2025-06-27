import java.util.*;
public class ContainMostWater {

    public static int containMostWater(ArrayList<Integer> poles){
        //bruteforce => O(n^2)
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<poles.size(); i++){
            for(int j=i+1; j<poles.size(); j++){
                int height = Math.min(poles.get(i), poles.get(j));
                int width = j-i;
                ans = Math.max(ans, height*width);
            }
        }
        return ans;
    }

    public static int containMaxWater(int[] ar){
        //Two Pointers => O(n)
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

        ArrayList<Integer> poles = new ArrayList<>();

        for(int x : ar){
            poles.add(x);
        }
        System.out.println(containMaxWater(ar));
        System.out.println(containMostWater(poles));
    }
}
