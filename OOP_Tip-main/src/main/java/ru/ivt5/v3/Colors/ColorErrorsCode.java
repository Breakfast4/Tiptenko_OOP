package ru.ivt5.v3.Colors;

public enum ColorErrorsCode {

    NULL_COLOR("null color"),
    WRONG_COLOR_STRING("wrong color");

    String errorString;

    ColorErrorsCode(String errorString) {
        this.errorString = errorString;
    }

    public String getErrorString() {
        return errorString;
    }
}
