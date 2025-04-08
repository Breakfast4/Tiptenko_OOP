package ru.ivt5.v2;

import ru.ivt5.v2.iface.Colored;

public class ColoredCircle extends Circle implements Colored {
    private int color;

    public ColoredCircle(Point center, int R, int color) {
        super(center, R);
        this.color = color;
    }

    public ColoredCircle(int x, int y, int R, int color) {
        super(x, y, R);
        this.color = color;
    }

    public ColoredCircle(int R, int color) {
        super(R);
        this.color = color;
    }

    public ColoredCircle(int color) {
        super();
        this.color = color;
    }

    public ColoredCircle() {
        super();
        this.color = 1;
    }

    public int getColor(){
        return this.color;
    }

    public void setColor(int color){
        this.color = color;
    }


}
