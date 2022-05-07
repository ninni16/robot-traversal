package main.java.com.robot.model;

import main.java.com.robot.validator.ValidationEnums;
import main.java.com.robot.validator.Validator;

public class East implements Direction {
    @Override
    public void moveForward(Position currentPosition) {
        if(!Validator.alreadyTraversed(currentPosition, ValidationEnums.MOVE_FORWARD_X)
                && Validator.checkForObstacle(currentPosition, ValidationEnums.MOVE_FORWARD_X)
                && (currentPosition.getX()+1)<=currentPosition.getM()) {
            currentPosition.setX(currentPosition.getX() + 1);
            currentPosition.setDirectionChanged(false);
        } else{
            System.out.println("Position Outside Rectangular plane!!!\nCurrent position :"+currentPosition.toString());
            throw new RuntimeException("Position Outside Rectangular plane");
        }
    }

    @Override
    public void moveRight(Position currentPosition) {
        currentPosition.setDirection("S");
        currentPosition.setDirectionChanged(true);
    }

    @Override
    public void moveLeft(Position currentPosition) {
        currentPosition.setDirection("N");
        currentPosition.setDirectionChanged(true);
    }
}
