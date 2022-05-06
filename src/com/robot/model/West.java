package com.robot.model;

import com.robot.validator.ValidationEnums;
import com.robot.validator.Validator;

public class West implements Direction {
    @Override
    public void moveForward(Position currentPosition) {
        if(!Validator.alreadyTraversed(currentPosition, ValidationEnums.MOVE_BACKWARD_X)
                && Validator.checkForObstacle(currentPosition, ValidationEnums.MOVE_BACKWARD_X)) {
            currentPosition.setX(currentPosition.getX()-1);
            currentPosition.setDirectionChanged(false);
        } else{
            System.out.println("Position Outside Rectangular plane!!!\nCurrent position :"+currentPosition.toString());
            throw new RuntimeException("Position Outside Rectangular plane");
        }
    }

    @Override
    public void moveRight(Position currentPosition) {
        currentPosition.setDirection("N");
        currentPosition.setDirectionChanged(true);
    }

    @Override
    public void moveLeft(Position currentPosition) {
        currentPosition.setDirection("S");
        currentPosition.setDirectionChanged(true);
    }
}
