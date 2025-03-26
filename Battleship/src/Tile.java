public class Tile {

    public boolean isShip;
    public boolean isHitted;
    public boolean partShip;

    public Tile(){
        this.partShip = false;
    }

    public void isPartShip(){
        partShip = true;
    }
}
