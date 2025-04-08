package ru.ivt5.v2;

import ru.ivt5.v2.Point;

public class Square extends Figure {
    private Point bottomRight;

    public Square(Point topLeft, int size) {
        super(topLeft);
        this.bottomRight = new Point(this.topLeft.getX()+size,this.topLeft.getY()-size);
    }

    public Square(int xLeft, int yTop, int size){
        super(xLeft, yTop);
        this.bottomRight = new Point(xLeft+size ,yTop-size);
    }

    public Square(int size){
        super(0, size);
        this.bottomRight = new Point( size, 0);
    }

    public Square(){
        this.topLeft = new Point(0, 1);
        this.bottomRight = new Point( 1, 0);
    }

    public Point getBottomRight() {
        return this.bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getSize(){
        return bottomRight.getX() - topLeft.getX();
    }

    public void moveTo(int x, int y){
        this.bottomRight = new Point( x+getSize(), y-getSize());
        this.topLeft = new Point(x,y);
    }

    public void moveTo(Point point){
        this.bottomRight = new Point(point.getX() + getSize(), point.getY()-getSize());
        this.topLeft = point;
    }

    public void moveRel(int dx, int dy){
        this.topLeft = new Point(this.topLeft.getX()+dx,this.topLeft.getY()+dy);
        this.bottomRight = new Point(this.bottomRight.getX()+dx,this.bottomRight.getY()+dy);
    }

    public void resize(double ratio){
        this.bottomRight = new Point( topLeft.getX() + (int) Math.round(getSize()*ratio), topLeft.getY()-(int) Math.round(getSize()*ratio));
    }

    public void stretch(double xRatio, double yRatio){};

    public  double getArea(){
        return getSize()*getSize();
    }

    public double getPerimeter(){
        return getSize()*4;
    }

    public boolean isInside(int x, int y){
        return x >= this.topLeft.getX() && x <= this.bottomRight.getX() && y >= this.bottomRight.getY() && y <= this.topLeft.getY();
    }

    public boolean isInside(Point point){
        return point.getX() >= this.topLeft.getX() && point.getX() <= this.bottomRight.getX() && point.getY() >= this.bottomRight.getY() && point.getY() <= this.topLeft.getY();
    }

    public boolean isIntersects(Square square){
        int x,y;
        if (this.getArea()<=square.getArea())
            for( x = this.topLeft.getX();x<= this.bottomRight.getX();x++)
                for( y = this.topLeft.getY();y<=this.bottomRight.getY();y++)
                    if(square.isInside(x,y))
                        return true;

        else for( x = square.topLeft.getX();x<= square.bottomRight.getX();x++)
            for( y = square.topLeft.getY();y<=square.bottomRight.getY();y++)
                if(this.isInside(x,y))
                    return true;
        return false;
    }

    public boolean isInside(Square square){
        return isInside(square.topLeft) && isInside(square.bottomRight);
    }


}
