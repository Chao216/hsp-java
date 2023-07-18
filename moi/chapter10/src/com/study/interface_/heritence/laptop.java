package com.study.interface_.heritence;

public class laptop implements multiHub{
    @Override
    public void connectEthernet() {
        System.out.println("connected to Ethernet");

    }

    @Override
    public void closeEthernet() {
        System.out.println("lost connection from ethernet");

    }

    @Override
    public void plugin() {

    }

    @Override
    public void unplug() {

    }

    @Override
    public void connectheadphone() {

    }

    @Override
    public void closeheadphone() {

    }

    @Override
    public void PD() {

    }
}
