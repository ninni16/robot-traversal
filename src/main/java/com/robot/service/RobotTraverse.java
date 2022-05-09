package main.java.com.robot.service;

import main.java.com.robot.factory.DirectionFactory;
import main.java.com.robot.model.Position;
import main.java.com.robot.model.RobotDetails;

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
        RobotDetails robotDetails = new RobotDetails(new Position(Integer.parseInt(inputArray[2]), Integer.parseInt(inputArray[3])), inputArray[4], Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[1]));
        robotDetails.getTraversalHistory().add("("+robotDetails.getPosition().getX()+", "+robotDetails.getPosition().getY()+")");
        String input = inputArray[5];
        DirectionFactory directionFactory = new DirectionFactory();
        Direction direction = null;
        for(int i=0;i<input.length();i++){
            if(robotDetails.getDirectionChanged()) {
                direction = directionFactory.getDirection(robotDetails.getDirection());
            }
            if(input.charAt(i)=='M')
                direction.moveForward(robotDetails);
            else if (input.charAt(i)=='R')
                direction.moveRight(robotDetails);
            else if ( input.charAt(i)=='L')
                direction.moveLeft(robotDetails);
        }
        System.out.println(robotDetails.toString());
    }

}
