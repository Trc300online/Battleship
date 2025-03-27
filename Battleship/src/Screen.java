import java.util.Scanner;

public class Screen {
    /* Ship types:
    * 1 carrier: size 5
    * 2 battleship: size 4
    * 3 destroyer: size 3
    * 4 submarine: size 3
    * 5 patrol boat: size 2
    * */

    public static char getShipType(){
        System.out.println("selecciona el tipus de barca que voleu colocar:");
        Scanner typeIn = new Scanner(System.in);
        System.out.println("[C] Carrier(5) | [B] Battleship(4) | [D] Destroyer(3) | [S] Submarine(3) | [P] Patrol boat(2)");
        return typeIn.next().toUpperCase().charAt(0);
    }

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

    public static char getDirection(){
        System.out.println("direcció de la barca:");
        Scanner dir = new Scanner(System.in);
        System.out.println("[N] North | [S] South | [E] East | [W] West");
        return dir.next().toUpperCase().charAt(0);
    }

    public static void printBoard(Board gameBoard){
        for (int i = 0; i < Board.getRows(); i++) {
            for (int j = 0; j < Board.getColumns(); j++) {
                System.out.print(Board.getGameBoard()[i][j]);
            }
            System.out.println();
        }
    }
}
