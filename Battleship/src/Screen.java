import java.util.Scanner;

public class Screen {

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
        System.out.println();
        System.out.println();
    }

    public static void missMsg() {
        System.out.println("no es torba cap vaixell a aquesta posició!");
    }

    public static void hitMsg() {
        System.out.println("vaixell ferit!");
    }

    public static void winMsg(){
        System.out.println("Has guanyat!");
    }
}
