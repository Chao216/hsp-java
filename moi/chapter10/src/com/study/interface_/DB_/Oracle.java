package com.study.interface_.DB_;

public class Oracle implements DBconnector{
    @Override
    public void connect() {
        System.out.println("Connected to Oracle");

    }

    @Override
    public void close() {
        System.out.println("closed connection from Oracle");
    }
}
