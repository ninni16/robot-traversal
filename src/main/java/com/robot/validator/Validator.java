package main.java.com.robot.validator;

import main.java.com.robot.model.RobotDetails;

public class Validator {

    public static Boolean checkForObstacle(RobotDetails robotDetails, ValidationEnums validationCriteria){
        if (validationCriteria.equals(ValidationEnums.MOVE_FORWARD_X)
                && robotDetails.getPosition().isEmpty(robotDetails.getPosition().getX()+1, robotDetails.getPosition().getY())){
            return true;
        } else if (validationCriteria.equals(ValidationEnums.MOVE_BACKWARD_X)
                && robotDetails.getPosition().isEmpty(robotDetails.getPosition().getX()-1, robotDetails.getPosition().getY())){
            return true;
        } else if (validationCriteria.equals(ValidationEnums.MOVE_FORWARD_Y)
                && robotDetails.getPosition().isEmpty(robotDetails.getPosition().getX(), robotDetails.getPosition().getY()+1)){
            return true;
        } else if (validationCriteria.equals(ValidationEnums.MOVE_BACKWARD_Y)
                && robotDetails.getPosition().isEmpty(robotDetails.getPosition().getX()+1, robotDetails.getPosition().getY()-1)){
            return true;
        } else {
            System.out.println("There is an obstacle ahead!!!\nCurrent position : "+robotDetails.toString());
            throw new RuntimeException("There is an obstacle ahead!!!");
        }
    }

    public static Boolean alreadyTraversed(RobotDetails robotDetails, ValidationEnums validationCriteria) {
        if (validationCriteria.equals(ValidationEnums.MOVE_FORWARD_X)) {
            if (robotDetails.getTraversalHistory().add("(" + (robotDetails.getPosition().getX()+1) + ", " + robotDetails.getPosition().getY() + ")")) {
                return false;// (0,0), (0,1) (2,3) Boolean
            } else {
                System.out.println("Cell is already traversed\nCurrent position : " + robotDetails.toString());
                throw new RuntimeException("Cell is already traversed");
            }
        } else if (validationCriteria.equals(ValidationEnums.MOVE_BACKWARD_X)) {
            if (robotDetails.getTraversalHistory().add("(" + (robotDetails.getPosition().getX() - 1) + ", " + robotDetails.getPosition().getY() + ")")) {
                return false;
            } else {
                System.out.println("Cell is already traversed\nCurrent position : " + robotDetails.toString());
                throw new RuntimeException("Cell is already traversed");
            }
        } else if (validationCriteria.equals(ValidationEnums.MOVE_FORWARD_Y)) {
        if (robotDetails.getTraversalHistory().add("(" + robotDetails.getPosition().getX() + ", " + (robotDetails.getPosition().getY()+1) + ")")) {
            return false;
        } else {
            System.out.println("Cell is already traversed\nCurrent position : " + robotDetails.toString());
            throw new RuntimeException("Cell is already traversed");
        }
        } else if (validationCriteria.equals(ValidationEnums.MOVE_BACKWARD_Y)) {
            if (robotDetails.getTraversalHistory().add("(" + robotDetails.getPosition().getX() + ", " + (robotDetails.getPosition().getY()-1) + ")")) {
                return false;
            } else {
                System.out.println("Cell is already traversed\nCurrent position : " + robotDetails.toString());
                throw new RuntimeException("Cell is already traversed");
            }
        } else {
            return true;
        }
    }

}
