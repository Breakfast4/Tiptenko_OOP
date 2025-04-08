package ru.ivt5.v3.Colors;

public class ColorException extends Exception{

    private ColorErrorsCode colorErrorsCode;

    public ColorException(ColorErrorsCode colorErrorsCode) {
        super(colorErrorsCode.getErrorString());
        this.colorErrorsCode = colorErrorsCode;
    }

    public ColorException(Throwable cause) {
        super(cause);
    }

    public ColorErrorsCode getColorErrorsCode() {
        return colorErrorsCode;
    }
}
