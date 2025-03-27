import java.util.Random;

public class Board {
    private static final int columns = 10;
    private static final int rows = 10;
    private static final Tile[][] gameBoard = new Tile[rows][columns];

    public Board(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                gameBoard[i][j] = new Tile();
            }
        }
        shipPlaceing();
    }

    public void shipPlaceing(){
        int rowPlace = new Random().nextInt(rows);
        int colPlace = new Random().nextInt(columns);
        int direction;
        int count = 0;

        while (count < Ship.shipAmountSizeing.length) {
            direction = new Random().nextInt(2);
            if (direction == 0) { // horizontal
                if (colPlace < (columns - Ship.shipAmountSizeing[count])) {
                    //if (!gameBoard[rowPlace][colPlace].partShip)
                    for (int j = 0; j < Ship.shipAmountSizeing[count]; j++) {
                        gameBoard[rowPlace][colPlace].isPartShip();
                        colPlace++;
                    }
                    count++;
                }
            } else { // vertical
                if (rowPlace < (rows - Ship.shipAmountSizeing[count])) {
                    for (int j = 0; j < Ship.shipAmountSizeing[count]; j++) {
                        gameBoard[rowPlace][colPlace].isPartShip();
                        rowPlace++;
                    }
                    count++;
                }
            }
        }
    }

    public boolean validPosition(int row, int col) {
        return true;
    }

    public static int getColumns() {
        return columns;
    }

    public static int getRows() {
        return rows;
    }

    public static Tile[][] getGameBoard() {
        return gameBoard;
    }

}
