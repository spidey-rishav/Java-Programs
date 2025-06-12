import java.util.*;
public class Interfaces {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("right, left, up, down");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("1 move in any direction");
    }
}