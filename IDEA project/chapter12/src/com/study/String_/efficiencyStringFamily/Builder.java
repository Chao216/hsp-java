package com.study.String_.efficiencyStringFamily;

public class Builder extends template {
    @Override
    public void job() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            stringBuilder.append(i);
        }


    }
}
