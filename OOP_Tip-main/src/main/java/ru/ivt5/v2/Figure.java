package ru.ivt5.v2;

import ru.ivt5.v2.iface.HasArea;
import ru.ivt5.v2.iface.Movable;
import ru.ivt5.v2.iface.Resizable;
import ru.ivt5.v2.iface.Stretchable;

public abstract class Figure implements Movable, HasArea, Resizable, Stretchable {

    protected int life;

    public Point topLeft;

    public Figure(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Figure(int x, int y) {
        this.topLeft = new Point(x,y);
    }

    public Figure() {
        this.topLeft = new Point(0,0);
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public abstract boolean isInside(int x, int y);

    public abstract double getPerimeter();



}
