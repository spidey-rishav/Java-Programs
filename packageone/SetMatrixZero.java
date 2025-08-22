import java.util.*;

public class SetMatrixZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 0){
                    for(int k=0; k<n; k++){
                        if(arr[k][j] != 0){
                            arr[k][j] = Integer.MIN_VALUE;
                        }
                        else{
                            continue;
                        }
                    }
                    for(int k=0; k<m; k++){
                        if(arr[i][k] != 0){
                            arr[i][k] = Integer.MIN_VALUE;
                        }
                        else{
                            continue;
                        }
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == Integer.MIN_VALUE){
                    arr[i][j] = 0;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
