package ru.ivt5.v3;

import ru.ivt5.v3.Colors.Color;
import ru.ivt5.v3.Colors.ColorErrorsCode;
import ru.ivt5.v3.Colors.ColorException;
import ru.ivt5.v3.iface.Colored;

import java.util.Objects;

import processing.core.PApplet;

public class ColoredTriangle extends Figure { //extends Circle implements Colored {
    private int color;
    protected float x, y, xSize, ySize, xSpeed, ySpeed;
    protected PApplet sketch;

    public ColoredTriangle(PApplet sketch, float x, float y, float dx, float dy) {
        this.sketch = sketch;
        this.x = x;
        this.y = y;
        this.xSize = sketch.random(20, 70);
        this.ySize = xSize + sketch.random(-15, 20);
        this.xSpeed = sketch.random(-5, 5) + dx;
        this.ySpeed = sketch.random(-5, 5) + dy;
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
        x += dx;
        y += dy;
    }

    public void step() {
        moveRel(xSpeed, ySpeed);
        if (x < xSize/2) {
            xSpeed = Math.abs(xSpeed);
            x = xSize/2;
        }
        if (x > sketch.width - xSize/2) {
            xSpeed = -Math.abs(xSpeed);
            x = sketch.width - xSize/2;
        }

        if (y < 0) ySpeed = Math.abs(ySpeed);
        if (y > sketch.height - ySize) ySpeed = -Math.abs(ySpeed);
        life -= 1;
    }

    public void render() {
        sketch.fill(color);
        sketch.triangle(x, y, x - xSize/2, y + ySize, x + xSize/2, y + ySize);
    }

    @Override
    public boolean isInside(int x, int y) {
        return false;
    }
}