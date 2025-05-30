package ru.ivt5.v1;

import java.util.Objects;

public class ColoredRectangle extends Rectangle {
    private int color;

    public  ColoredRectangle(Point leftTop, Point rightBottom, int color){
        super(leftTop,rightBottom);
        this.color = color;
    }

    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, int color) {
        super(xLeft, yTop, xRight, yBottom);
        this.color = color;
    }

    public ColoredRectangle(int length, int width, int color) {
        super(length, width);
        this.color = color;
    }

    public ColoredRectangle(int color) {
        super();
        this.color = color;
    }

    public ColoredRectangle() {
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
        ColoredRectangle that = (ColoredRectangle) o;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }
}
