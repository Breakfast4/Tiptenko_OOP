package ru.ivt5.v3;

import ru.ivt5.v3.Colors.Color;
import ru.ivt5.v3.Colors.ColorErrorsCode;
import ru.ivt5.v3.Colors.ColorException;
import ru.ivt5.v3.iface.Colored;

import java.util.Objects;

import processing.core.PApplet;

public class ColoredRectangle extends Figure { //extends Circle implements Colored {
    private int color;
    protected float x, y, xSize, ySize, xSpeed, ySpeed;
    protected PApplet sketch;

    public ColoredRectangle(PApplet sketch, float x, float y,float dx,float dy) {
        this.sketch = sketch;
        this.x = x;
        this.y = y;
        this.xSize = sketch.random(10, 50);
        this.ySize = xSize + sketch.random(-5, 5);
        this.xSpeed = sketch.random(-5, 5)+dx;
        this.ySpeed = sketch.random(-5, 5)+dy;
        this.color = sketch.color(sketch.random(255), sketch.random(255), sketch.random(255));
        life = 500;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveRel(float dx, float dy) {
        x+= dx;
        y+= dy;
    }

    public void step() {
        moveRel(xSpeed, ySpeed);
        if (x < 0 ) {
            xSpeed = Math.abs(xSpeed);
            x = 0;}
        if(x > sketch.width - xSize) {
            xSpeed = -Math.abs(xSpeed);
            x = sketch.width-xSize;}

        if (y < 0 ) ySpeed = Math.abs(ySpeed);
        if (y > sketch.height - ySize) ySpeed = -Math.abs(ySpeed);
        life -=1;
    }

    public void render() {
        sketch.fill(color);
        sketch.rect(x, y, xSize, ySize);
    }

    @Override
    public boolean isInside(int x, int y) {
        return false;
    }

    //    private Color color;
//
//    public  ColoredRectangle(Point leftTop, Point rightBottom, Color color){
//        super(leftTop,rightBottom);
//        this.color = color;
//    }
//
//    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, Color color) {
//        super(xLeft, yTop, xRight, yBottom);
//        this.color = color;
//    }
//
//    public ColoredRectangle(int length, int width, Color color) {
//        super(length, width);
//        this.color = color;
//    }
//
//    public ColoredRectangle(Color color) {
//        this.color = color;
//    }
//
//    public ColoredRectangle() {
//        this.color = Color.RED;
//    }
//
//    public Color getColor(){
//        return this.color;
//    }
//
//    public void setColor(Color color) throws ColorException {
//        if(color == null){
//            throw new ColorException(ColorErrorsCode.NULL_COLOR);
//        } else this.color = color;
//    }
//
//    public void setColor(String color) throws ColorException{
//        this.color = Color.colorFromString(color);
//    }
//

}
