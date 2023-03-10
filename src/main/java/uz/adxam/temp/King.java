package uz.adxam.temp;

import uz.adxam.Board;
import uz.adxam.Location;

public class King extends Piece{
    public King(String symbol, String color, Location location) {
        super(symbol, color, location);
    }

    public Piece clone() {
        return new King(symbol, color, new Location(location));
    }

    public boolean checkMove(Location to, Board b) {

        int x = location.x, y = location.y;

        if(Math.abs(x - to.x) > 1 || Math.abs(y - to.y) > 1)
            return false;

        return true;
    }
}
