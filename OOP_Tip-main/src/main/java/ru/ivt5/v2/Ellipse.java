package ru.ivt5.v2;

import ru.ivt5.v2.Point;

public class Ellipse extends Figure {
    private Point topLeft;
    private int xAxis, yAxis;

    public Ellipse(Point center, int xAxis, int yAxis) {
        super(center);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis) {
        super(xCenter,yCenter);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(int xAxis, int yAxis) {
        super();
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse() {
        super();
        this.xAxis = 1;
        this.yAxis = 1;
    }

    public int getXAxis() {
        return xAxis;
    }

    public int getYAxis() {
        return yAxis;
    }

    public void setXAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public void setYAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public void moveTo(int x, int y) {
        this.topLeft = new Point(x, y);
    }

    public void moveTo(Point point) {
        this.topLeft = point;
    }

    public void moveRel(int dx, int dy) {
        this.topLeft = new Point(this.topLeft.getX() + dx, this.topLeft.getY() + dy);
    }

    public void resize(double ratio) {
        this.xAxis = (int) Math.round(this.xAxis * ratio);
        this.yAxis = (int) Math.round(this.yAxis * ratio);
    }

    public void stretch(double xRatio, double yRatio) {
        this.xAxis = (int) Math.round(this.xAxis * xRatio);
        this.yAxis = (int) Math.round(this.yAxis * yRatio);
    }

    public double getArea() {
        return Math.PI * xAxis * yAxis;
    }

    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(xAxis, 2) + Math.pow(yAxis, 2)) / 8);
    }

    public boolean isInside(int x, int y) {
        return Math.pow(x, 2) / Math.pow((int) (xAxis / 2), 2) + Math.pow(y, 2) / Math.pow((int) (yAxis / 2), 2) <= 1;
    }

    public boolean isInside(Point point) {
        return Math.pow(point.getX(), 2) / Math.pow((int) (xAxis / 2), 2) + Math.pow(point.getY(), 2) / Math.pow((int) (yAxis / 2), 2) <= 1;
    }


}

