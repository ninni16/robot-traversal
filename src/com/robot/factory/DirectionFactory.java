package com.robot.factory;

import com.robot.model.*;

public class DirectionFactory {

    public Direction getDirection(String direction){
        if(direction == null){
            return null;
        }
        if(direction.equalsIgnoreCase("N")){
            return new North();

        } else if(direction.equalsIgnoreCase("S")){
            return new South();

        } else if(direction.equalsIgnoreCase("E")){
            return new East();

        } else if(direction.equalsIgnoreCase("W")){
        return new West();
        }
        return null;
    }
}
