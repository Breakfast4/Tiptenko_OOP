package ru.ivt5.v2;

import ru.ivt5.v2.Point;

public class Circle extends Figure {
    private int R;

    public Circle(Point center, int R) {
        super(center);
        this.R = R;
    }

    public Circle(int x, int y, int R){
        super(x,y);
        this.R = R;
    }

    public Circle(int R){
        super();
        this.R = R;
    }

    public Circle(){
        super();
        this.R = 1;
    }

    public int getR() {
        return this.R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public void moveTo(int x, int y){
        this.topLeft = new Point( x,y);
    }

    public void moveTo(Point point){
        this.topLeft = point;
    }

    public void resize(double ratio){
        this.R = (int)Math.round(this.R*ratio);
    }

    public  double getArea(){
        return Math.PI * this.R*this.R;
    }

    public double getPerimeter(){
        return 2 * Math.PI * R;
    }

    public boolean isInside(int x, int y){
        return (this.topLeft.getX()-x)*(this.topLeft.getX()-x) + (this.topLeft.getY() - y)*(this.topLeft.getY() - y) <= this.R * this.R;
    }

    public boolean isInside(Point point){
        return (this.topLeft.getX()- point.getX())*(this.topLeft.getX()- point.getX()) + (this.topLeft.getY() - point.getY())*(this.topLeft.getY() - point.getY()) <= this.R * this.R;
    }

    public void moveRel(int dx, int dy){
        this.topLeft = new Point(this.topLeft.getX()+dx,this.topLeft.getY()+dy);
    }
    public void stretch(double xRatio, double yRatio){};


}
