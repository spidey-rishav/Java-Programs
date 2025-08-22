package packageone;

class HashMap{
    int ar[];
    int state[];
    int count[];
    int size = 0;

    HashMap(int n){
        ar = new int[n];
        state = new int[n];
        count = new int[n];
    }
    int i=0;
    public void insert(int key){
        ar[i] = key;
        state[i] = 1;
        count[i]++;
        size++;
    }

    public boolean search(int key){
        for(int j=0; j<ar.length; j++){
            if(ar[j] == key){
                return true;
            }
        }
        return false;
    }

    public void delete(int key){
        for(int j=0; j<ar.length; j++){
            if(ar[j] == key){
                if(count[j] == 1){
                    ar[j] = 0;
                    state[j] = -1;
                }
                else{
                    count[j]--;
                }

            }
        }
        size--;
    }

    public int sizeOfAr(){
        return size;
    }
}
public class HashMapping {
    public static void main(String[] args){
//        packageone.HashMap<Integer> map = new packageone.HashMap<Integer>(5);

//        map.insert(5);
//        map.insert(2);
//        map.insert(7);
//        map.insert(3);
//        map.insert(9);
//
//        map.delete(2);
//        System.out.println(map);
    }
}
