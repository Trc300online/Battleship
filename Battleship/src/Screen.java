import java.util.Scanner;

public class Screen {
    /* Ship types:
    * 1 carrier: size 5
    * 2 battleship: size 4
    * 3 destroyer: size 3
    * 4 submarine: size 3
    * 5 patrol boat: size 2
    * */

    public static int getRows() {
        System.out.println("Row: ");
        Scanner rowScan = new Scanner(System.in);
        return Integer.parseInt(rowScan.next()) - 1;
    }

    public static int getColumns() {
        System.out.println("Column: ");
        Scanner colScan = new Scanner(System.in);
        return Integer.parseInt(colScan.next()) - 1;
    }

    public static void printBoard(Board gameBoard){
        for (int i = 0; i < Board.getRows(); i++) {
            for (int j = 0; j < Board.getColumns(); j++) {
                System.out.print(gameBoard.getGameBoard()[i][j] + " ");
            }
            System.out.println();
        }
    }
}
