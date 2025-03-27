public class Tile {

    public boolean isWater;
    public boolean isHitted;
    public boolean partShip;
    public boolean isReveal;

    public Tile(){
        this.partShip = false;
        this.isWater = true;
        this.isHitted = false;
        this.isReveal = false;
    }

    public void isPartShip(){
        partShip = true;
    }

    public String toString(){
        if (!this.isReveal) {
            return  " #";
        }
        if (this.isHitted) {
            return  " X";
        }
        if (this.isWater) {
            return  " ~";
        }
        if (this.partShip) {
            return  " =";
        }
        return null;
    }
}
