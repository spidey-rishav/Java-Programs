import java.util.*;

public class MultiplesOf3and5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int count = 0;
//        for(int i=1; i<=n; i++){
//            if(i%3==0 && i%5==0){
//                count++;
//            }
//            else if (i%3==0) {
//                count++;
//            }
//            else if (i%5 == 0){
//                count++;
//            }
//        }
//        System.out.println(count);

        //Principle of Inclusion and Exclusion
        int three = n/3;
        int five = n/5;
        int com = n/(5*3);

        System.out.println(three + five - com);
    }
}
