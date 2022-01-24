package com.learnProgramming;

public class Point {
    private int x;
    private int y;

    //declare the constructor
    public Point(){
        this(0,0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // declare the setter and getter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Todo: Hotfix
    public double distance(){ //execute if no input insert
        double point = Math.sqrt((this.x - 0) * (this.x - 0) + (this.y - 0) * (this.y - 0));
        return point;
    }

    public double distance(int x, int y){ // Input will minus with 0
        double point = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        return point;
    }

    public double distance(Point second){ // Input will minus with 2
        double point = Math.sqrt((this.x - second.x) * (this.x - second.x) +
                       (this.y - second.y) * (this.y - second.y));
        return point;
    }


}
