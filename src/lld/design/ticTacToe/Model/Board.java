package lld.design.ticTacToe.Model;

//import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.List;
//import org.apache.commons.lang3.tuple;

public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece){

        if(row >= size || column >= size)
            return false;

        if (board[row][column] != null){
            return false;
        }

        board[row][column] = playingPiece;
        return true;
    }

    public List<ArrayList> getFreeCells() {
        List<ArrayList> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j] == null) {
                    ArrayList<Integer> rowColumn = new ArrayList<>(List.of(i, j));
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
    }

    public void printBoard(){

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j] != null){
                    System.out.print(board[i][j].piece.name() + " ");
                } else {
                    System.out.print("  ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
