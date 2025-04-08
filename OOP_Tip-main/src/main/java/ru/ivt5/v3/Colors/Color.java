package ru.ivt5.v3.Colors;

public enum Color {
    RED,BLUE,GREEN;

    public static Color colorFromString(String string) throws ColorException{
        try {
            return Color.valueOf(string);
        } catch (IllegalArgumentException e){
            throw new ColorException(ColorErrorsCode.WRONG_COLOR_STRING);
        } catch (NullPointerException e) {
            throw new ColorException(ColorErrorsCode.NULL_COLOR);
        }
    }
}
