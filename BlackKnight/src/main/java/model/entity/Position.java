package model.entity;

import javax.persistence.*;

@Embeddable
public class Position {

    @Column(name = "Position_x")
    private Byte x;

    @Column(name = "Position_y")
    private Byte y;

    public Position() {

    }

    public Position(byte x, byte y) {
        this.x = x;
        this.y = y;
    }

    public Byte setX(byte x) {
        return this.x = x;
    }

    public Byte getX() {
        return this.x = x;
    }

    public Byte setY(byte y) {
        return this.y = y;
    }

    public Byte getY() {
        return this.y = y;
    }

}
