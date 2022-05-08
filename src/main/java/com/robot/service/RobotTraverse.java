package main.java.com.robot.service;

import main.java.com.robot.factory.DirectionFactory;
import main.java.com.robot.model.Position;

import java.io.*;

public class RobotTraverse {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("request")));
            String line;
            while ((line=br.readLine())!=null){
                sb.append(line);
                sb.append(" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error in reading input");
            e.printStackTrace();
        }
        String[] inputArray = sb.toString().split(" ");
        Position position = new Position(Integer.parseInt(inputArray[2]), Integer.parseInt(inputArray[3]), inputArray[4], Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[1]));
        position.getTraversalHistory().add("("+position.getX()+", "+position.getY()+")");
        String input = inputArray[5];
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
