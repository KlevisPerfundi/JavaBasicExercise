package org.example.TicTacToeGame;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.example.TicTacToeGame.Exercise5.board;
import static org.example.TicTacToeGame.Exercise5.figure;


public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Exercise5 exercise5 = new Exercise5();
       figure="X";
        board =new String[9];
        String winner= null;
        for (int i=0;i<9;i++){
            board[i]=String.valueOf(i+1);
        }
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        exercise5.printBoard();

        System.out.println(
                "X will play first. Enter a slot number to place X in:");

        while (winner == null) {
            int numInput;

            // Exception handling.
            // numInput will take input from user like from 1 to 9.
            // If it is not in range from 1 to 9.
            // then it will show you an error "Invalid input."
            try {
                numInput = sc.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                            "Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                        "Invalid input; re-enter slot number:");
                continue;
            } // This game has two player x and O.
            // Here is the logic to decide the turn.
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = figure;

                if (figure.equals("X")) {
                    figure="O";
                }
                else {
                    figure="X";
                }

                exercise5.printBoard();
                winner = exercise5.checkForWinner();
            }
            else {
                System.out.println(
                        "Slot already taken; re-enter slot number:");
            }
        }

        // If no one win or lose from both player x and O.
        // then here is the logic to print "draw".
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's a draw! Thanks for playing.");
        }

        // For winner -to display Congratulations! message.
        else {
            System.out.println(
                    "Congratulations! " + winner
                            + "'s have won! Thanks for playing.");
        }
        sc.close();
    }
}
