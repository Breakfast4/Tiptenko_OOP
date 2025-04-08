package ru.ivt5.v1;

import java.util.Objects;

public class ColoredCircle extends Circle{
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ColoredCircle that = (ColoredCircle) o;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
