package ru.ivt5.v2.iface;

import ru.ivt5.v2.Point;

public interface Movable {
    public void moveTo(int x, int y);

    void moveTo(Point point);

    void moveRel(int dx, int dy);
}
