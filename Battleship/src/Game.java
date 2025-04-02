public class Game {

    public void startGame(){
        System.out.println("hola");


        Board board1 = new Board(); // substituir board1 i board2 per use of count
        board1.toggleHidden();
        Screen.printBoard(board1);
        System.out.println("|||||||||||||||||||||||||||||||||||||");

        Board board2 = new Board();
        Screen.printBoard(board2);

        boolean gameContinues = true;
        int count = 1;

        /*while (gameContinues) {


            int x = Screen.getRows();
            int y = Screen.getColumns();
            if (!board1.hitted(x, y)){ // --> in board: if hitted == water return false;
                Board.reveal();
                if (count == 1){
                    count = 2;
                } else {
                    count = 1;
                }
            } else {
                Board.revela(moves);
                if (ship.lastPart){
                    Screen.hundidoMsg();
                } else {
                    Screen.hitMsg();
                }
                // winCond
                if (Board.shipCount(count) == 0) {
                    Screen.winMsg;
                    gameContinues = false;
                }
            }

        }*/
    }
}
