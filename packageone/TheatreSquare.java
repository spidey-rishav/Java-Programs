package packageone;

import java.util.*;

public class TheatreSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Read inputs
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        // Calculate the number of flagstones needed in each direction
        long tilesLength = (n + a - 1) / a;  // Equivalent to ceil(n / a)
        long tilesWidth = (m + a - 1) / a;   // Equivalent to ceil(m / a)

        // Total number of tiles
        long totalTiles = tilesLength * tilesWidth;

        // Print the result
        System.out.println(totalTiles);
    }
}
