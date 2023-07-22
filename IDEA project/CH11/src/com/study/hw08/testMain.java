package com.study.hw08;

public class testMain {
    public static void main(String[] args) {
        Color.RED.show();
        int key = (int) (Math.random() * 10 + 1);
        System.out.println(key);
        switch (key) {
            case 1:
                Color.RED.show();
                break;
            case 2:
                Color.BLUE.show();
                break;
            case 3:
                Color.BLACK.show();
                break;
            case 4:
                Color.GREEN.show();
                break;
            case 5:
                Color.YELLOW.show();
                break;
            default:
                System.out.println("out of color index");
                break;
        }


    }
}

enum Color {
    RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public void show() {
        System.out.println("rgb values " + this.redValue + " " + this.greenValue + " " + this.blueValue);
    }
}