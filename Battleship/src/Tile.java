public class Tile {

    private boolean isWater;
    private boolean isHitted;
    private boolean partShip;
    private boolean isReveal;

    public Tile(){
        this.partShip = false;
        this.isWater = true;
        this.isHitted = false;
        this.isReveal = false;
    }

    public void isPartShip(){
        partShip = true;
    }
    
    public boolean isIsPartShip() {
        return this.partShip;
    }

    public boolean toggleReveal() {
        return isReveal = !isReveal;
    }

    public void Hit(){
        isHitted = true;
    }

    public boolean isHitted() {
        return this.isHitted;
    }


    public String toString(){

        if (this.isHitted && this.partShip) {
            return  " \uD83D\uDCA5";
        }
        if (!isReveal) {
            return  " \uD83C\uDF2B\uFE0F";
        }
        if (this.partShip) {
            return  " ⛵";
        }
        if (this.isWater && this.isHitted) {
            return " \uD83E\uDEE7";
        }
        if (this.isWater) {
            return  " \uD83C\uDF0A";
        }
        return null;
    }
}
