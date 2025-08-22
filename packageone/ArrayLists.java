package packageone;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(8);

//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<list.size(); i++){
//            max = Math.max(max, list.get(i));
//        }
//        System.out.println(max);

        System.out.println(list);

        int idx1 = 1, idx2 = 3;
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.println(list);
    }
}
