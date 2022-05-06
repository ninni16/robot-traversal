package com.robot.service;

import com.robot.factory.DirectionFactory;
import com.robot.model.Direction;
import com.robot.model.Position;

public class RobotTraverse {

    public static void main(String[] args) {
        int X_Cor = 0;
        int Y_Cor = 0;
        String dir = "N";
        String input = "MMMRMMLMRMMMLMRMMRMRMLMRMMMLMMMRMMRMM";
        int n = 9;
        int m = 6;
        Position position = new Position(X_Cor, Y_Cor, dir, n, m);
        position.getTraversalHistory().add("("+position.getX()+", "+position.getY()+")");
        DirectionFactory directionFactory = new DirectionFactory();
        Direction direction = null;
        for(int i=0;i<input.length();i++){
            if(position.getDirectionChanged()) {
                direction = directionFactory.getDirection(position.getDirection());
            }
            if(input.charAt(i)=='M')
                direction.moveForward(position);
            else if (input.charAt(i)=='R')
                direction.moveRight(position);
            else if ( input.charAt(i)=='L')
                direction.moveLeft(position);
        }
        System.out.println(position.toString());
    }

}
