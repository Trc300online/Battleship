public class Game {

    public void startGame(){
        System.out.println("hola");


        Board board1 = new Board();
        Screen.printBoard(board1);

        Board board2 = new Board();
        //Screen.printBoard(baord2);

        boolean gameContinues = true;
        int count = 1;

        /*while (gameContinues) {


            Screen.askMove;
            if (!Board.hitted(moves)){ // --> in board: if hitted == water return false;
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
