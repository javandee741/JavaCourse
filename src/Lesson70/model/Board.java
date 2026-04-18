package Lesson70.model;

public class Board {

    private Symbol[][] content;

    private static final int MAX_ROW = 3;
    private static final int MAX_COL = 3;

    public Board() {
        this.content = new Symbol[MAX_ROW][MAX_COL];
    }

    public void setCell(int row, int column, Symbol symbol) {
        content[row][column] = symbol;
    }

    public void showCurrentState() {
        System.out.println("---------------------------------");

        for (int i = 0; i < MAX_ROW; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                System.out.print(content[i][j] != null ? content[i][j] : " ");
                if (j < MAX_COL - 1) System.out.print("|");
            }
            System.out.println();
            if (i < MAX_ROW - 1) System.out.println("---------------------------------");
        }
        System.out.println("---------------------------------");
    }

    public boolean isCellEmpty(int row, int column) {
        return content[row][column] == null;
    }

    public boolean isWinner(Player currentPlayer) {
        Symbol symbol = currentPlayer.getSymbol();
        for (int i = 0; i < MAX_ROW; i++) {
            if (content[i][0] == symbol && content[i][1] == symbol && content[i][2] == symbol) {
                return true;
            } 
        }

        for (int j = 0; j < MAX_COL; j++) {
            if (content[j][0] == symbol && content[j][1] == symbol && content[j][2] == symbol) {
                return true;
            }
        }

        if (content[0][0]==symbol&&content[1][1]==symbol&&content[2][2]==symbol) return true;
        if (content[0][2]==symbol&&content[1][1]==symbol&&content[2][0]==symbol) return true;

        return false;
    }

}

