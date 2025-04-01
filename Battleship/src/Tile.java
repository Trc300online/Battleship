public class Tile {

    private boolean isWater;
    private boolean isHitted;
    private boolean partShip;
    private boolean isReveal;

    public Tile(){
        this.partShip = false;
        this.isWater = true;
        this.isHitted = false;
        isReveal = false;
    }

    public void isPartShip(){
        partShip = true;
    }
    
    public boolean isIsReveal() {
        return this.isReveal;
    }

    public boolean setIsReveal(boolean isReveal) {
        this.isReveal = isReveal;
        return isReveal;
    }

    public String toString(){
        if (!isReveal) {
            return  " \uD83C\uDF2B\uFE0F";
        }
        if (this.isHitted) {
            return  " \uD83D\uDCA5";
        }
        if (this.partShip) {
            return  " ⛵";
        }
        if (this.isWater) {
            return  " \uD83C\uDF0A";
        }
        return null;
    }
}
