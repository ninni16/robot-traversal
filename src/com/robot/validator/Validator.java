package com.robot.validator;

import com.robot.model.Position;

import java.util.HashSet;

public class Validator {

    public static Boolean checkForObstacle(Position position, ValidationEnums validationCriteria){
        if (validationCriteria.equals(ValidationEnums.MOVE_FORWARD_X)
                && position.isEmpty(position.getX()+1, position.getY())){
            return true;
        } else if (validationCriteria.equals(ValidationEnums.MOVE_BACKWARD_X)
                && position.isEmpty(position.getX()-1, position.getY())){
            return true;
        } else if (validationCriteria.equals(ValidationEnums.MOVE_FORWARD_Y)
                && position.isEmpty(position.getX(), position.getY()+1)){
            return true;
        } else if (validationCriteria.equals(ValidationEnums.MOVE_BACKWARD_Y)
                && position.isEmpty(position.getX()+1, position.getY()-1)){
            return true;
        } else {
            System.out.println("There is an obstacle ahead!!!\nCurrent position : "+position.toString());
            throw new RuntimeException("There is an obstacle ahead!!!");
        }
    }

    public static Boolean alreadyTraversed(Position position, ValidationEnums validationCriteria) {
        if (validationCriteria.equals(ValidationEnums.MOVE_FORWARD_X)) {
            if (position.getTraversalHistory().add("(" + (position.getX()+1) + ", " + position.getY() + ")")) {
                return false;
            } else {
                System.out.println("Cell is already traversed\nCurrent position : " + position.toString());
                throw new RuntimeException("Cell is already traversed");
            }
        } else if (validationCriteria.equals(ValidationEnums.MOVE_BACKWARD_X)) {
            if (position.getTraversalHistory().add("(" + (position.getX() - 1) + ", " + position.getY() + ")")) {
                return false;
            } else {
                System.out.println("Cell is already traversed\nCurrent position : " + position.toString());
                throw new RuntimeException("Cell is already traversed");
            }
        } else if (validationCriteria.equals(ValidationEnums.MOVE_FORWARD_Y)) {
        if (position.getTraversalHistory().add("(" + position.getX() + ", " + (position.getY()+1) + ")")) {
            return false;
        } else {
            System.out.println("Cell is already traversed\nCurrent position : " + position.toString());
            throw new RuntimeException("Cell is already traversed");
        }
        } else if (validationCriteria.equals(ValidationEnums.MOVE_BACKWARD_Y)) {
            if (position.getTraversalHistory().add("(" + position.getX() + ", " + (position.getY()-1) + ")")) {
                return false;
            } else {
                System.out.println("Cell is already traversed\nCurrent position : " + position.toString());
                throw new RuntimeException("Cell is already traversed");
            }
        } else {
            return true;
        }
    }

}
