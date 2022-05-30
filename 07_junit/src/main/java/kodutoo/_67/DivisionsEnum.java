package kodutoo._67;

public enum DivisionsEnum {
    // Divisions
    INFANTRY,
    HORSE,
    TANK,
    // Attributes
    COMBATWIDTH,
    ATTACK,
    DEFENSE,
    HP,
    ORG;

    public int getCOMBATWIDTH(){
        switch(this){
            case INFANTRY:
                return 2;
            case HORSE:
                return 3;
            case TANK:
                return 4;
            default:
                return 0;
        }
    }

    public int getATTACK(){
        switch(this){
            case INFANTRY:
                return 15;
            case HORSE:
                return 13;
            case TANK:
                return 25;
            default:
                return 0;
        }
    }

    public int getDEFENSE(){
        switch(this){
            case INFANTRY:
                return 25;
            case HORSE:
                return 23;
            case TANK:
                return 45;
            default:
                return 0;
        }
    }

    public int getHP(){
        switch(this){
            case INFANTRY:
                return 10;
            case HORSE:
                return 12;
            case TANK:
                return 20;
            default:
                return 0;
        }
    }

    public int getORG(){
        switch(this){
            case INFANTRY:
                return 5;
            case HORSE:
                return 4;
            case TANK:
                return 2;
            default:
                return 0;
        }
    }
}
