import java.util.ArrayList;

public class Ship {
    public int[] carrier = {1};
    public int[] battleship = {2};
    public int[] destroyer = {3};
    public int[] submarine = {4};
    public int[] patrol_boat = {5};

    private int[][] positions;
    private int size;
    private String nom;

    public Ship(){
    }

    public static int[] shipAmountSizeing = {ShipType.carrier.getSize(), ShipType.battleship.getSize(), ShipType.battleship.getSize(),
                                                ShipType.destroyer.getSize(), ShipType.destroyer.getSize(), ShipType.destroyer.getSize(),
                                                ShipType.submarine.getSize(), ShipType.submarine.getSize(), ShipType.submarine.getSize(),
                                                ShipType.submarine.getSize(), ShipType.patrol_boat.getSize(), ShipType.patrol_boat.getSize(),
                                                ShipType.patrol_boat.getSize(), ShipType.patrol_boat.getSize(), ShipType.patrol_boat.getSize()};

    public static ArrayList<Ship> ships = new ArrayList<>();

    public static ArrayList<Ship> getShips() {
        return ships;
    }
}
