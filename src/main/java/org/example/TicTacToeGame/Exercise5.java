package org.example.TicTacToeGame;


import java.util.Arrays;

public class Exercise5 {


    static String[] board;

    static String figure;
    private String line;

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String checkForWinner() {
        for (int i = 0; i < 8; i++) {
            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[0] + board[3] + board[6];
                    break;
                case 2:
                    line = board[0] + board[4] + board[8];
                    break;
                case 3:
                    line = board[2] + board[4] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[3] + board[4] + board[5];
                    break;
                case 7:
                    line = board[6] + board[7] + board[8];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                System.out.println("O");
                return "O";
            }
        }
        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
                break;
            } else if (i == 8) {
                return "draw";
            }
        }
        System.out.println(figure + "'s turn; enter a slot number to place " + figure + " in:");
        return null;
    }

    public void printBoard() {

              /*  .___.___.___.
                | 1 | 2 | 3 |
                .___.___.___.
                | 4 | 5 | 6 |
                .___.___.___.
                | 7 | 8 | 9 |
                .___.___.___.*/

        System.out.println(".___.___.___.");
        System.out.println("|" +" "+ board[0] +" "+ "|" +" "+ board[1] +" "+ "|" +" "+ board[2] +" "+ "|");
        System.out.println(".___.___.___.");
        System.out.println("|" +" "+ board[3] +" "+ "|" +" "+ board[4] +" "+"|" +" "+ board[5] +" "+ "|");
        System.out.println(".___.___.___.");
        System.out.println("|" +" "+ board[6] +" "+ "|" +" "+ board[7] +" "+ "|" +" "+ board[8] +" "+ "|");
        System.out.println(".___.___.___.");

    }
}



