package Lesson70.JAVA.controller;

import Lesson70.JAVA.model.Board;
import Lesson70.JAVA.model.Player;
import Lesson70.JAVA.model.Symbol;

import java.util.Scanner;

public class GameController {
    Player player1;
    Player player2;

    Board board;

    {
        initPlayers();
    }

    private void initPlayers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of Player 1");
        String playerOne = in.nextLine();

        do {
            System.out.println("Choose a symbol for Player " + playerOne + " (X or O): ");
            String symbol = in.nextLine();
            if (symbol.length() == 1) {
                if (symbol.toUpperCase().equals("X")) {
                    player1 = new Player(playerOne, Symbol.X);
                } else {
                    player1 = new Player(playerOne, Symbol.O);
                }
            }
        } while (player1 == null);

        System.out.println("Enter the name of Player 2");
        String playerTwo = in.nextLine();
        if (Symbol.X == player1.getSymbol()) {
            player2 = new Player(playerTwo, Symbol.O);
        } else {
            player2 = new Player(playerTwo, Symbol.X);
        }
        //in.close();
    }

    public GameController() {
        board = new Board();
    }

    public void playGame() {
        Scanner in = new Scanner(System.in);
        Player currentPlayer = player1;
        while (true) {
            board.showCurrentState();
            System.out.println("Player " + currentPlayer.getName() + " enter your movie(row and column): ");
            int row = 0, column = 0;
            while ((row < 1 || row > 3) && (column < 1 || column > 3)) {
                row = in.nextInt();
                column = in.nextInt();
            }
            row--;
            column--;

            if (board.isCellEmpty(row, column)) {
                board.setCell(row, column, currentPlayer.getSymbol());
                board.showCurrentState();
            }

            if (board.isWinner(currentPlayer)) {
                System.out.println("The player " + currentPlayer.getName() + " is win!!! GAME OVER!!!");
                break;
            } else {
                currentPlayer = (currentPlayer == player1 ? player2 : player1);
            }
        }
    }
}
