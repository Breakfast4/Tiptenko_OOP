package ru.ivt5.v3.iface;

import ru.ivt5.v3.Point;

public interface Movable {
    void moveTo(int x, int y);

//    void moveTo(Point point);

    void moveRel(float dx, float dy);
}
