package com.study.String_.efficiencyStringFamily;

public class Buffer extends template {
    @Override
    public void job() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 10000000; i++) {
            stringBuffer.append(i);
        }


    }
}
