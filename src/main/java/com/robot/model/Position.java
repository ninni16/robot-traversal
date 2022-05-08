package main.java.com.robot.model;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashSet;

public class Position {

    private int x;
    private int y;
    private String direction;
    private Boolean isDirectionChanged=true;
    private int n;
    private int m;
    private HashSet<String> traversalHistory = new HashSet<>();

    public Position(int x, int y, String direction, int m, int n) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.n = n;
        this.m = m;
    }

    public Boolean isEmpty(int x, int y){
        return (this.x!=x || this.y!=y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
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

    public HashSet<String> getTraversalHistory() {
        return traversalHistory;
    }

    @Override
    public String toString() {
        return  x + " " + y + " " +direction;
    }
}
