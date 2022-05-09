package main.java.com.robot.service;

import main.java.com.robot.model.RobotDetails;

public interface Direction {
    public void moveForward(RobotDetails currentPosition);
    public void moveRight(RobotDetails currentPosition);
    public void moveLeft(RobotDetails currentPosition);
    default public void countLeft(RobotDetails currentPosition){
        currentPosition.setCountLeft(currentPosition.getCountLeft()+1);
    }
}
