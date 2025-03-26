import java.util.Random;

public class Board {
    private int columns = 10;
    private int rows = 10;
    private Tile[][] gameBoard;

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
        int direction = -1;

        for (int i = 0; i < Ship.; i++){
            direction = new Random().nextInt(2);
            if (direction == 0) { // horizontal
                if (colPlace < (columns - ShipType.carrier.getSize())) {
                    for (int j = 0; j < ShipType.carrier.getSize(); j++) {
                        gameBoard[rowPlace][colPlace].isPartShip();
                        colPlace++;
                    }
                }
            } else { // vertical
                if (rowPlace < (rows - ShipType.carrier.getSize())) {
                    for (int j = 0; j < ShipType.carrier.getSize(); j++) {
                        gameBoard[rowPlace][colPlace].isPartShip();
                        rowPlace++;
                    }
                }
            }
        }
    }

    public boolean validPosition(int row, int col) {
        return true;
    }

}
