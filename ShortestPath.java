import java.util.*;

public class ShortestPath {
    public static float getShortestPath(String path){
        int x=0, y=0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'W'){
                x--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'N') {
                y++;
            }
            else{
                y--;
            }
        }
        int x2 = x*x, y2 = y*y;

        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
        String path = "WNEENESENNN";

        System.out.println(getShortestPath(path));
    }
}
