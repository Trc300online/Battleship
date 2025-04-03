import java.util.Random;

public class Board {
    private static final int columns = 10;
    private static final int rows = 10;
    private final Tile[][] gameBoard = new Tile[rows][columns];

    public Board(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                gameBoard[i][j] = new Tile();
            }
        }
        shipPlaceing();
    }

    public boolean checkPosition(int barca, int direction, int rowPlace, int colPlace){
        int count = 0;

        if (direction == 0){
            if (colPlace > (columns - Ship.shipAmountSizeing[barca])) {
                return false;
            } else {
                for (int j = 0; j < Ship.shipAmountSizeing[barca]; j++) {
                    if (gameBoard[rowPlace][colPlace + j].isIsPartShip()){
                        return false;
                    } else {
                        count++;
                        if (count == Ship.shipAmountSizeing[barca]) {
                            return true;
                        }
                    }
                }
            }
        } else {
            if (rowPlace > (rows - Ship.shipAmountSizeing[barca])) {
                return false;
            } else {
                for (int j = 0; j < Ship.shipAmountSizeing[barca]; j++) {
                    if (gameBoard[rowPlace + j][colPlace].isIsPartShip()) {
                        return false;
                    } else {
                        count++;
                        if (count == Ship.shipAmountSizeing[barca]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void shipPlaceing(){
        int direction;
        int count = 0;

        while (count < Ship.shipAmountSizeing.length) {
            int rowPlace = new Random().nextInt(rows);
            int colPlace = new Random().nextInt(columns);
            direction = new Random().nextInt(2);

            if (checkPosition(count, direction, rowPlace, colPlace)){
                if (direction == 0){
                    for (int i = 0; i < Ship.shipAmountSizeing[count]; i++) {

                        gameBoard[rowPlace][colPlace+i].isPartShip();
                    }
                } else {
                    for (int i = 0; i < Ship.shipAmountSizeing[count]; i++) {

                        gameBoard[rowPlace][colPlace].isPartShip();
                        rowPlace++;
                    }
                }
                count++;
            }
        }
    }

    public boolean validPosition(int row, int col) {
        return (row >= 0 && row < gameBoard.length) && (col >= 0 && col < gameBoard[0].length);
    }

    public static int getColumns() {
        return columns;
    }

    public static int getRows() {
        return rows;
    }

    public Tile[][] getGameBoard() {
        return gameBoard;
    }

    public void toggleHidden(){
        for (int i = 0; i < Board.getRows(); i++) {
            for (int j = 0; j < Board.getColumns(); j++) {
                gameBoard[i][j].toggleReveal();
            }
        }
    }

    public void reveal(int row, int col) {
        gameBoard[row][col].toggleReveal();
        gameBoard[row][col].Hit();
    }

    public boolean hitted(int x, int y){
        return gameBoard[x][y].isIsPartShip();
    }

    public int totalShips() {
        int total = 0;

        for (int i = 0; i < Board.getRows(); i++) {
            for (int j = 0; j < Board.getColumns(); j++) {
                if (gameBoard[i][j].isIsPartShip() && gameBoard[i][j].isHitted()) {
                    total++;
                }
            }
        }
        return total;
    }

    public boolean winCond() {
        return totalShips() == 44;
    }

}
