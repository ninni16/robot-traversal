package main.java.com.robot.service;

import main.java.com.robot.model.Position;

public interface Direction {
    public void moveForward(Position currentPosition);
    public void moveRight(Position currentPosition);
    public void moveLeft(Position currentPosition);
}
