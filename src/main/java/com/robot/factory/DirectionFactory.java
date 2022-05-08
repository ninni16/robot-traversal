package main.java.com.robot.factory;

import main.java.com.robot.model.*;
import main.java.com.robot.model.*;

import java.util.HashMap;
import java.util.Map;

public class DirectionFactory {

    Map<String, Direction> directions =  new HashMap<String,Direction>(){
        {   put("N",new North());
            put("S",new South());
            put("E",new East());
            put("W",new West());
        }
    };

    public Direction getDirection(String direction){
        if(direction == null){
            return null;
        } else {
            return directions.get(direction);
        }
    }
}
