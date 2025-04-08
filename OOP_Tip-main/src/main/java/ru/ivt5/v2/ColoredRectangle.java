package ru.ivt5.v2;

import ru.ivt5.v1.Point;
import ru.ivt5.v1.Rectangle;

public class ColoredRectangle extends Rectangle {
    private int color;

    public  ColoredRectangle(ru.ivt5.v1.Point leftTop, Point rightBottom, int color){
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
        this.color = color;
    }

    public ColoredRectangle() {
        this.color = 1;
    }

    public int getColor(){
        return this.color;
    }

    public void setColor(int color){
        this.color = color;
    }



}
