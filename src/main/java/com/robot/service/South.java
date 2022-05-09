package main.java.com.robot.service;

import main.java.com.robot.model.RobotDetails;
import main.java.com.robot.validator.ValidationEnums;
import main.java.com.robot.validator.Validator;

public class South implements Direction{
    @Override
    public void moveForward(RobotDetails robotDetails) {
        if(!Validator.alreadyTraversed(robotDetails, ValidationEnums.MOVE_BACKWARD_Y)
                && Validator.checkForObstacle(robotDetails, ValidationEnums.MOVE_BACKWARD_Y)
                && (robotDetails.getPosition().getY()-1)>=0) {
            robotDetails.getPosition().setY(robotDetails.getPosition().getY()-1);
            robotDetails.setDirectionChanged(false);
        } else{
            System.out.println("Position Outside Rectangular plane!!!\nCurrent position :"+robotDetails.toString());
            throw new RuntimeException("Position Outside Rectangular plane");
        }
    }

    @Override
    public void moveRight(RobotDetails robotDetails) {
        robotDetails.setDirection("W");
        robotDetails.setDirectionChanged(true);
    }

    @Override
    public void moveLeft(RobotDetails robotDetails) {
        robotDetails.setDirection("E");
        robotDetails.setDirectionChanged(true);
        countLeft(robotDetails);
    }
}
