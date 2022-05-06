package com.robot.model;

import com.robot.validator.ValidationEnums;
import com.robot.validator.Validator;

public class North implements Direction{
    @Override
    public void moveForward(Position currentPosition) {
        if(!Validator.alreadyTraversed(currentPosition, ValidationEnums.MOVE_FORWARD_Y)
                && Validator.checkForObstacle(currentPosition, ValidationEnums.MOVE_FORWARD_Y)
                && (currentPosition.getY()+1)<currentPosition.getM()) {
            currentPosition.setY(currentPosition.getY() + 1);
            currentPosition.setDirectionChanged(false);
        } else{
            System.out.println("Position Outside Rectangular plane!!!\nCurrent position :"+currentPosition.toString());
            throw new RuntimeException("Position Outside Rectangular plane");
        }
    }

    @Override
    public void moveRight(Position currentPosition) {
        currentPosition.setDirection("E");
        currentPosition.setDirectionChanged(true);
    }

    @Override
    public void moveLeft(Position currentPosition) {
        currentPosition.setDirection("W");
        currentPosition.setDirectionChanged(true);
    }
}
