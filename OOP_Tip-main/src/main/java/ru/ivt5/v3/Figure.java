package ru.ivt5.v3;

import ru.ivt5.v3.iface.HasArea;
import ru.ivt5.v3.iface.Movable;
import ru.ivt5.v3.iface.Resizable;
import ru.ivt5.v3.iface.Stretchable;

public abstract class Figure implements Movable { //, HasArea,  Resizable, Stretchable

    public Point topLeft;
    protected int life;

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

    public abstract void step();

    public abstract void render();


}
