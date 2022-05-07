package main.java.com.robot.model;

public interface Direction {
    public void moveForward(Position currentPosition);
    public void moveRight(Position currentPosition);
    public void moveLeft(Position currentPosition);
}
