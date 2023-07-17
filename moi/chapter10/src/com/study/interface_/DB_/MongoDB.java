package com.study.interface_.DB_;

public class MongoDB implements DBconnector{
    @Override
    public void connect() {
        System.out.println("connected to MongoDB");
    }

    @Override
    public void close() {
        System.out.println("closed connection from MongoDB");
    }
}
