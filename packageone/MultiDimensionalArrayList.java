import java.util.*;

public class MultiDimensionalArrayList {
    public static void main(String[] args){
//        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(1); list1.add(2);
//        mainList.add(list1);
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(2); list2.add(4);
//        mainList.add(list2);
//
//        ArrayList<Integer> list3 = new ArrayList<>();
//        list3.add(3); list3.add(6);
//        mainList.add(list3);
//
//        System.out.println(mainList);

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();


        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        for(ArrayList x : mainList){
            for(int i=0; i<x.size(); i++){
                System.out.print(x.get(i) + " ");
            }
            System.out.println();
        }
    }
}
