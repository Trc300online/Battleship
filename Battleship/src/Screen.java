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
        char type = typeIn.next().toUpperCase().charAt(0);
        switch (type){
            case 'C':
                return 'C';
                break;
        }
    }
}
