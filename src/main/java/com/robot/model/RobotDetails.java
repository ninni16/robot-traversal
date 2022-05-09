package main.java.com.robot.model;

import java.util.HashSet;

public class RobotDetails {
    private Position position;
    private String direction;
    private Boolean isDirectionChanged=true;
    private int n;
    private int m;
    private HashSet<String> traversalHistory = new HashSet<>();
    private int countLeft=0;

    public RobotDetails(Position position, String direction, int m, int n) {
        this.position = position;
        this.direction = direction;
        this.n = n;
        this.m = m;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Boolean getDirectionChanged() {
        return isDirectionChanged;
    }

    public void setDirectionChanged(Boolean directionChanged) {
        this.isDirectionChanged = directionChanged;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getCountLeft() {
        return countLeft;
    }

    public void setCountLeft(int countLeft) {
        this.countLeft = countLeft;
    }

    public HashSet<String> getTraversalHistory() {
        return traversalHistory;
    }

    @Override
    public String toString() {
        return  position.getX() + " " + position.getY() + " " +direction+", Left rotation count : "+countLeft;
    }
}
