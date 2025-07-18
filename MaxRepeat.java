import java.util.*;

public class MaxRepeat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int []arr = {1,1,1,0,0,1,0,0,0,1,0,1,1,1,1,1,0,1,1,1};
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(count,max);
            }
            else{
                count = 0;
            }
        }
        System.out.println(max);
    }
}

