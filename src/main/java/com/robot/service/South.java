package main.java.com.robot.service;

import main.java.com.robot.model.Position;
import main.java.com.robot.validator.ValidationEnums;
import main.java.com.robot.validator.Validator;

public class South implements Direction{
    @Override
    public void moveForward(Position currentPosition) {
        if(!Validator.alreadyTraversed(currentPosition, ValidationEnums.MOVE_BACKWARD_Y)
                && Validator.checkForObstacle(currentPosition, ValidationEnums.MOVE_BACKWARD_Y)
                && (currentPosition.getY()-1)>=0) {
            currentPosition.setY(currentPosition.getY()-1);
            currentPosition.setDirectionChanged(false);
        } else{
            System.out.println("Position Outside Rectangular plane!!!\nCurrent position :"+currentPosition.toString());
            throw new RuntimeException("Position Outside Rectangular plane");
        }
    }

    @Override
    public void moveRight(Position currentPosition) {
        currentPosition.setDirection("W");
        currentPosition.setDirectionChanged(true);
    }

    @Override
    public void moveLeft(Position currentPosition) {
        currentPosition.setDirection("E");
        currentPosition.setDirectionChanged(true);
    }
}
