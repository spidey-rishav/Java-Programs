import java.util.*;
public class PairSum {
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        //loop
//        for(int i=0; i<list.size(); i++){
//            for (int j=i+1; j<list.size(); j++){
//                if(list.get(i) + list.get(j) == target){
//                    return true;
//                }
//            }
//        }

        //2 pointers
        int p1 = 0, p2 = list.size()-1;

        while(p1<p2){
            if(list.get(p1) + list.get(p2) == target){
                return true;
            }

            if(list.get(p1) + list.get(p2) < target){
                p1++;
            }
            else{
                p2--;
            }
        }

        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int pivot=0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                pivot = i+1;
                break;
            }
        }

        int lp = pivot, rp = pivot-1;

        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1)%list.size();
            }
            else{
                rp = (list.size() + rp - 1) % list.size();
            }
        }

        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list, target));
    }
}
