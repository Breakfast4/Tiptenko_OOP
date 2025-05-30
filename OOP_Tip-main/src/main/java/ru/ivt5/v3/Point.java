package ru.ivt5.v3;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public void moveTo(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public void moveRel(int dx,int dy){
        this.x += dx;
        this.y += dy;
    }
}
