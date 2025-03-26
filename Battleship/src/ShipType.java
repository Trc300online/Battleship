public enum ShipType {
    carrier (5),
    battleship (4),
    destroyer (3),
    submarine (3),
    patrol_boat (2);

    ShipType(int size) {
    }

    public int getSize(){
        switch (this){
            case carrier:
                return 5;
            case battleship:
                return 4;
            case destroyer:
                return 3;
            case submarine:
                return 3;
            case patrol_boat:
                return 2;
            default:
                return 0;
        }    }
}
