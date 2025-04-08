package ru.ivt5.v1;

import java.util.Objects;

public class Ellipse {
    private Point center;
    private int xAxis, yAxis;

    public Ellipse(Point center, int xAxis, int yAxis) {
        this.center = center;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis) {
        this.center = new Point(xCenter, yCenter);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(int xAxis, int yAxis) {
        this.center = new Point(0, 0);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse() {
        this.center = new Point(0, 0);
        this.xAxis = 1;
        this.yAxis = 1;
    }

    public Point getCenter() {
        return center;
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

    public void setCenter(Point center) {
        this.center = center;
    }

    public void moveTo(int x, int y) {
        this.center = new Point(x, y);
    }

    public void moveTo(Point point) {
        this.center = point;
    }

    public void moveRel(int dx, int dy) {
        this.center = new Point(this.center.getX() + dx, this.center.getY() + dy);
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return xAxis == ellipse.xAxis && yAxis == ellipse.yAxis && Objects.equals(center, ellipse.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, xAxis, yAxis);
    }
}

