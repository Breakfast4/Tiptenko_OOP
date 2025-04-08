package ru.ivt5;

import processing.core.PApplet;
import ru.ivt5.v3.FigureManager;

public class Main extends PApplet {      //(String[] args) {
        private FigureManager FigureManager;
        private float prevMouseX, prevMouseY;
        long lastAddTime = 0;          // время последнего добавления
        int delay = 40;
        float mod = 1f;

    public void settings() {
            size(800, 500);
            FigureManager = new FigureManager(this);
            FigureManager.addCircle(width / 2f, height / 2f, 5, 5);
        }

        public void draw() {
            background(64);
            FigureManager.updateAndRender();
            prevMouseX = mouseX;
            prevMouseY = mouseY;
        }

        public void mouseDragged() {
            long now = millis(); // текущее время с начала скетча в миллисекундах

            if (now - lastAddTime > delay) {
                switch (Math.round(random(0.5f,3.5f))) {
                    case 1: {
                        FigureManager.addCircle(mouseX, mouseY, (mouseX - prevMouseX) * mod, (mouseY - prevMouseY) * mod);
                    break;}
                    case 2:{
                FigureManager.addRectangle(mouseX, mouseY, (mouseX-prevMouseX)*mod, (mouseY- prevMouseY)*mod);
                    break;}
                    case 3:{
                        FigureManager.addTriangle(mouseX, mouseY, (mouseX-prevMouseX)*mod, (mouseY- prevMouseY)*mod);
                    break;}}
                lastAddTime = now;
            }


        }

        public static void main(String[] args) {
            String[] processingArgs = {"MySketch"};
            Main mySketch = new Main();
            PApplet.runSketch(processingArgs, mySketch);
        }

//
//        Array array1 = new Array(10);
//        Array array2 = new Array(10);
//
//        for (int i = 0; i < 10; i++) {
//            array1.setElement(i, i + 1);
//            array2.setElement(i, (i + 2) * 2);
//        }
//
//        array1.printArray("1");
//        array2.printArray("2");
//
//        Array sumArray = array1.add(array2);
//        sumArray.printArray("сумма");
//
//        Array diffArray = array2.sub(array1);
//        diffArray.printArray("разность");
//
//        array1.multiplyByScalar(3);
//        array1.printArray("1 * 3");
//
//        array2.delByScalar(2);
//        array2.printArray("2 / 2");
//
//        System.out.println(array2.getElement(4));    // начинаются индексы с 0, так что вывелся 5 элемент по счёту!!
//
//    }

    }