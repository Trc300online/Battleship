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

    public boolean checkPosition(int barca, int direccio, int rowPlace, int colPlace){
        int count = 0;

        if (direccio == 0){
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
            if (rowPlace <= (rows - Ship.shipAmountSizeing[barca])) {
                for (int j = 0; j < Ship.shipAmountSizeing[barca]; j++) {
                    if (!gameBoard[rowPlace + j][colPlace].isIsPartShip()){
                        count++;
                        if (count == Ship.shipAmountSizeing[barca]) {
                            return true;
                        }
                    }
                    else return false;
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

                        gameBoard[rowPlace][colPlace+i].isPartShip(); ////////////////////////////
                    }
                } else {
                    for (int i = 0; i < Ship.shipAmountSizeing[count]; i++) {

                        gameBoard[rowPlace][colPlace].isPartShip(); ///////////////////////////////////
                        rowPlace++;
                    }
                }
            }

//            if (direction == 0) { // horizontal
//
//                if (colPlace <= (columns - Ship.shipAmountSizeing[count])) {
//
//                    for (int j = 0; j < Ship.shipAmountSizeing[count]; j++) {
//
//                        if (!gameBoard[rowPlace][colPlace].isIsPartShip()){
//
//
//                        }
//                    }
//
//                    // SI no hi ha cap vaixell a l'interval de posicions [] determinat per rowPlace, colPlace i el tamany i orientacio llavors
//
//                    for (int i = 0; i < Ship.shipAmountSizeing[count]; i++) {
//
//                        gameBoard[rowPlace][colPlace+i].isPartShip(); ////////////////////////////
//                    }
//                }
//            } else { // vertical
//
//                if (rowPlace <= (rows - Ship.shipAmountSizeing[count])) {
//
//                    for (int j = 0; j < Ship.shipAmountSizeing[count]; j++) {
//
//                        if (!gameBoard[rowPlace][colPlace].isIsPartShip()){ ////////////////////////////////
//
//                            for (int i = 0; i < Ship.shipAmountSizeing[count]; i++) {
//
//                                gameBoard[rowPlace][colPlace].isPartShip(); ///////////////////////////////////
//                                rowPlace++;
//                            }
//                        }
//                    }
//                }
//            }
            count++;
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

    public Tile[][] getGameBoard() {
        return gameBoard;
    }

    public void toggleHidden(){
        for (int i = 0; i < Board.getRows(); i++) {
            for (int j = 0; j < Board.getColumns(); j++) {
                //gameBoard.getGameBoard()
                gameBoard[i][j].toggleReveal();
            }
        }
    }

    public boolean hitted(int x, int y){
        return gameBoard[x][y].isIsPartShip();
    }

}
