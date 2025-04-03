public class Game {

    public void startGame(){

        Board[] boards = { new Board(), new Board()};

        int count = 0;

        while (!boards[(count + 1) % 2].winCond()) {

            boards[(count + 1) % 2].toggleHidden();

            for (int k = 0; k < 2; k++) {

                Screen.printBoard(boards[k]);
            }

            int x;
            int y;

            do {
                x = Screen.getRows();
                y = Screen.getColumns();

            } while (!boards[(count + 1) % 2].validPosition(x, y));

            // processar dispar

            // si no he endivinat ==> canvi de player ==> cont++

            // calcul condicio d'acabament

            if (!boards[(count + 1) % 2].hitted(x, y)) {

                Screen.missMsg();
                boards[(count + 1) % 2].reveal(x, y);
                boards[(count + 1) % 2].toggleHidden();
                count++;


            } else {

                boards[(count + 1) % 2].reveal(x, y);
                Screen.hitMsg();
            }
        }
        Screen.winMsg();
    }
}
