package ru.ivt5.v3.iface;
import ru.ivt5.v3.Colors.Color;
import ru.ivt5.v3.Colors.ColorException;
public interface Colored {

    void setColor(Color color) throws ColorException;

    Color getColor();
}
