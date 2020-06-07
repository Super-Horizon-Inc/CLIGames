package core.model;

import javax.persistence.*;

/**
 * A class for position of Character
 */
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

    /**
     * Setter method for x-coordinate of position. This method can also be used as a combination of getter and setter.
     * @param x a byte number which is assigned to Position x-coordinate.
     * @return First, assign x-coordinate to Position x. Then, return a byte number which is Position x-coordinate.
     */
    public byte setX(byte x) {
        return this.x = x;
    }

    /**
     * Getter method for x-coordinate Position.
     * @return a byte number which is x-coordinate Position.
     */
    public byte getX() {
        return this.x = x;
    }

    /**
     * Setter method for y-coordinate of position. This method can also be used as a combination of getter and setter.
     * @param y a byte number which is assigned to Position y-coordinate.
     * @return First, assign y-coordinate to Position y. Then, return a byte number which is Position y-coordinate.
     */
    public byte setY(byte y) {
        return this.y = y;
    }

    /**
     * Getter method for y-coordinate Position.
     * @return a byte number which is y-coordinate Position.
     */
    public byte getY() {
        return this.y = y;
    }

}
