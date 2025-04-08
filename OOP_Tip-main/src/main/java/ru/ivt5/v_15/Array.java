package ru.ivt5.v_15;

import javax.swing.*;

public class Array {
    private int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    public Array(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Размер массива должен быть больше 0");
        }
        this.arr = new int[size];
    }

    public void setElement(int index, int value) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Индекс вне допустимого диапазона: " + index);
        }
        arr[index] = value;
    }

     public int getElement(int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Индекс вне допустимого диапазона: " + index);
        }
        return arr[index];
    }

    public Array add(Array other) {
        if (this.arr.length != other.arr.length) {
            throw new IllegalArgumentException("Массивы должны быть одинаковой длины для сложения");
        }
        Array result = new Array(this.arr.length);
        for (int i = 0; i < arr.length; i++) {
            result.arr[i] = this.arr[i] + other.arr[i];
        }
        return result;
    }

    public Array sub(Array other) {
        if (this.arr.length != other.arr.length) {
            throw new IllegalArgumentException("Массивы должны быть одинаковой длины для вычитания");
        }
        Array result = new Array(this.arr.length);
        for (int i = 0; i < arr.length; i++) {
            result.arr[i] = this.arr[i] - other.arr[i];
        }
        return result;
    }

    public void multiplyByScalar(int scalar) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= scalar;
        }
    }

    public void delByScalar(int scalar) {
        if (scalar == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]/scalar;
        }
    }

    public void printElement(int index) {
        System.out.println("Элемент c индексом " + index + ": " + getElement(index));
    }

    public void printArray() {
        System.out.print("Массив: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void printArray(String name) {
        System.out.printf("Массив " + name + ":\n[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    }
