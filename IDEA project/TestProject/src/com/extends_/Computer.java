package com.extends_;

public class Computer {
    private String Processor;
    private int RAM;
    private int Storage;

    public Computer(String processor, int RAM, int storage) {
        Processor = processor;
        this.RAM = RAM;
        Storage = storage;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int storage) {
        Storage = storage;
    }

    public String getInfo(){
        return "Processor = " + Processor + " RAM = " + RAM + " Storage = "+ Storage;
    }
}