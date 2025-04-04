public class Game {

    public void startGame(){

        Board[] boards = { new Board(), new Board()};

        int count = 0;

        boards[(count + 1) % 2].toggleHidden();

        while (!boards[(count + 1) % 2].winCond()) {

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

            if (!boards[(count) % 2].hitted(x, y)) {

                Screen.missMsg();
                boards[(count) % 2].reveal(x, y);
                boards[(count + 1) % 2].toggleHidden();
                count++;
                boards[(count + 1) % 2].toggleHidden();


            } else {

                boards[(count) % 2].reveal(x, y);
                boards[(count) % 2].giveHit(x, y);
                Screen.hitMsg();
            }
        }
        Screen.winMsg();
    }
}
