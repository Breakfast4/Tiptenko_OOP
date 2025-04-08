package ru.ivt5.v3;

import ru.ivt5.v3.Colors.Color;
import ru.ivt5.v3.Colors.ColorErrorsCode;
import ru.ivt5.v3.Colors.ColorException;
import ru.ivt5.v3.iface.Colored;

import java.util.Objects;

import processing.core.PApplet;

public class ColoredCircle extends Figure { //extends Circle implements Colored {
    private int color;
    protected float x, y, Diameter, xSpeed, ySpeed;
    protected PApplet sketch;

    public ColoredCircle(PApplet sketch, float x, float y,float dx,float dy) {
        this.sketch = sketch;
        this.x = x;
        this.y = y;
        this.Diameter = sketch.random(10, 100);
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
        if (x < Diameter/2 ) {
            xSpeed = Math.abs(xSpeed);
            x = Diameter/2;}
        if(x > sketch.width - Diameter/2) {
            xSpeed = -Math.abs(xSpeed);
            x = sketch.width-Diameter/2;}

        if (y < Diameter/2 ) ySpeed = Math.abs(ySpeed);
        if (y > sketch.height - Diameter/2) ySpeed = -Math.abs(ySpeed);
        life -=1;
    }

    public void render() {
        sketch.fill(color);
        sketch.ellipse(x, y, Diameter, Diameter);
    }

    @Override
    public boolean isInside(int x, int y) {
        return false;
    }


//    private Color color;
//
//    public ColoredCircle(Point center, int R, Color color) {
//        super(center, R);
//        this.color = color;
//    }
//
//    public ColoredCircle(int x, int y, int R, Color color) {
//        super(x, y, R);
//        this.color = color;
//    }
//
//    public ColoredCircle(int R, Color color) {
//        super(R);
//        this.color = color;
//    }
//
//    public ColoredCircle(Color color) {
//        super();
//        this.color = color;
//    }
//
//    public ColoredCircle() {
//        super();
//        this.color = Color.RED;
//    }
//
//    public Color getColor(){
//        return this.color;
//    }
//
//
//    public void setColor(String color) throws ColorException {
//        this.color = Color.colorFromString(color);
//    }
//
//    @Override
//    public void setColor(Color color) throws ColorException {
//        if(color == null){
//            throw new ColorException(ColorErrorsCode.NULL_COLOR);
//        } else this.color = color;
//    }


   }
