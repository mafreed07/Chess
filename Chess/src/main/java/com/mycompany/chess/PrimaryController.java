package com.mycompany.chess;

import java.io.IOException;
import javafx.fxml.FXML;



public class PrimaryController {
    private Board board;
    private Player[] players;
    private Player currentPlayer;

    public PrimaryController {
    
    }

    public void startGame() {
        
    }

    private boolean isGameOver() {
      
        return false;
    }
}

public class Board {
    private Square[][] squares;

    public Board() {
        
    }

    public void movePiece(Square start, Square end) {
       
    }

    public boolean isMoveValid(Square start, Square end) {
        
        return false;
    }

   
}

public class Square {
    private int row;
    private int col;
    private Piece piece;

    public Square(int row, int col) {
        
    }

    public boolean isEmpty() {
        
        return false;
    }

    public Piece getPiece() {
       
        return null;
    }
}

public enum PieceType {
    KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN
}

public enum PieceColor {
    WHITE, BLACK
}

public abstract class Piece {
    private PieceType type;
    private PieceColor color;

    public Piece(PieceType type, PieceColor color) {
     
    }

    public abstract boolean isValidMove(Square start, Square end);
}



class Player {
    private String name;
    private PieceColor color;

    public Player(String name, PieceColor color) {
  
    }

  
}

