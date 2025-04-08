package ru.ivt5.v2.gen;

import ru.ivt5.v2.Figure;
import ru.ivt5.v2.iface.HasArea;

public class Box<T extends Figure> implements HasArea {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public double getArea() {
        return content.getArea();
    }

    public boolean isAreaEqual(Box<?> other) {
        return this.getArea() == other.getArea();
    }

    public static boolean isAreaEqual(Box<?> box1, Box<?> box2) {
        return box1.getArea() == box2.getArea();
    }
}