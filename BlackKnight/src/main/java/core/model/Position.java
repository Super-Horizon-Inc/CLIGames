package core.model;

import javax.persistence.*;

@Embeddable
public class Position {

    @Column(name = "Position_x")
    private byte x;

    @Column(name = "Position_y")
    private byte y;

    public Position() {

    }

    public Position(byte x, byte y) {
        this.x = x;
        this.y = y;
    }

    public byte setX(byte x) {
        return this.x = x;
    }

    public byte getX() {
        return this.x = x;
    }

    public byte setY(byte y) {
        return this.y = y;
    }

    public byte getY() {
        return this.y = y;
    }

}
