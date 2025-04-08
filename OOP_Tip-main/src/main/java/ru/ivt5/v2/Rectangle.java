package ru.ivt5.v2;

import ru.ivt5.v2.Point;

public class Rectangle extends Figure {
    private Point topLeft, bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        super(topLeft);
        this.bottomRight = bottomRight;
    }

    public Rectangle(int xLeft, int yTop, int xRight, int yBottom){
        super(xLeft,yTop);
        this.bottomRight = new Point( xRight, yBottom);
    }

    public Rectangle(int length, int width){
        this.topLeft = new Point(0, width);
        this.bottomRight = new Point( length, 0);

    }

    public Rectangle(){
        this.topLeft = new Point(0, 1);
        this.bottomRight = new Point( 1, 0);
    }

    public Point getBottomRight() {
        return this.bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getLength(){
        return bottomRight.getX() - topLeft.getX();
    }

    public int getWidth(){
        return topLeft.getY() - bottomRight.getY();
    }

    public void moveTo(int x, int y){
        this.bottomRight = new Point( x+getLength(), y-getWidth());
        this.topLeft = new Point(x,y);
    }

    public void moveTo(Point point){
        this.bottomRight = new Point(point.getX() + getLength(), point.getY()-getWidth());
        this.topLeft = point;
    }

    public void moveRel(int dx, int dy){
        this.topLeft = new Point(this.topLeft.getX()+dx,this.topLeft.getY()+dy);
        this.bottomRight = new Point(this.bottomRight.getX()+dx,this.bottomRight.getY()+dy);
    }

    public void resize(double ratio){
        this.bottomRight = new Point( topLeft.getX() + (int) Math.round(getLength()*ratio), topLeft.getY()-(int) Math.round(getWidth()*ratio));
    }

    public void stretch(double xRatio, double yRatio){
        this.bottomRight = new Point( topLeft.getX() + (int) Math.round(getLength()*xRatio), topLeft.getY()-(int) Math.round(getWidth()*yRatio));
    }

    public  double getArea(){
        return getLength()*getWidth();
    }

    public double getPerimeter(){
        return getLength()*2 + getWidth() * 2;
    }

    public boolean isInside(int x, int y){
        return x >= this.topLeft.getX() && x <= this.bottomRight.getX() && y >= this.bottomRight.getY() && y <= this.topLeft.getY();
    }

    public boolean isInside(Point point){
        return point.getX() >= this.topLeft.getX() && point.getX() <= this.bottomRight.getX() && point.getY() >= this.bottomRight.getY() && point.getY() <= this.topLeft.getY();
    }

    public boolean isIntersects(Rectangle rectangle){
        int x,y;
        if (this.getArea()<=rectangle.getArea())
           for( x = this.topLeft.getX();x<= this.bottomRight.getX();x++)
               for( y = this.topLeft.getY();y<=this.bottomRight.getY();y++)
                   if(rectangle.isInside(x,y))
                       return true;

        else for( x = rectangle.topLeft.getX();x<= rectangle.bottomRight.getX();x++)
            for( y = rectangle.topLeft.getY();y<=rectangle.bottomRight.getY();y++)
                if(this.isInside(x,y))
                    return true;
        return false;
    }

    public boolean isInside(Rectangle rectangle){
        return isInside(rectangle.topLeft) && isInside(rectangle.bottomRight);
    }


}
