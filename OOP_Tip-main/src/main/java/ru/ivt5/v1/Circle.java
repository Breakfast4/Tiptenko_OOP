package ru.ivt5.v1;

import java.util.Objects;

public class Circle {

    private Point center;
    private int R;

    public Circle(Point center, int R) {
        this.center = center;
        this.R = R;
    }

    public Circle(int x,int y,int R){
        this.center = new Point( x, y);
        this.R = R;
    }

    public Circle(int R){
        this.center = new Point(0, 0);
        this.R = R;

    }

    public Circle(){
        this.center = new Point(0, 0);
        this.R = 1;
    }

    public Point getCenter() {
        return  this.center;
    }

    public int getR() {
        return this.R;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setR(int R) {
        this.R = R;
    }

    public void moveTo(int x, int y){
        this.center = new Point( x,y);
    }

    public void moveTo(Point point){
        this.center = point;
    }

    public void moveRel(int dx, int dy){
        this.center = new Point(this.center.getX()+dx,this.center.getY()+dy);
    }

    public void reSize(double ratio){
        this.R = (int)Math.round(this.R*ratio);
    }

    public  double getArea(){
        return Math.PI * this.R*this.R;
    }

    public double getPerimeter(){
        return 2 * Math.PI * R;
    }

    public boolean isInside(int x, int y){
        return (this.center.getX()-x)*(this.center.getX()-x) + (this.center.getY() - y)*(this.center.getY() - y) <= this.R * this.R;
    }

    public boolean isInside(Point point){
        return (this.center.getX()- point.getX())*(this.center.getX()- point.getX()) + (this.center.getY() - point.getY())*(this.center.getY() - point.getY()) <= this.R * this.R;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return R == circle.R && Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, R);
    }
}
