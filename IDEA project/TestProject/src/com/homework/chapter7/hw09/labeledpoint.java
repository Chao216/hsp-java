package com.homework.chapter7.hw09;

public class labeledpoint extends point{
    private String label;

    public labeledpoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
