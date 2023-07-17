package com.study.interface_.DB_;

public class MySQL implements DBconnector{
    @Override
    public void connect() {
        System.out.println("Connected to mysql");
    }
    @Override
    public void close(){
        System.out.println("closed connection from mysql");
    }
}
