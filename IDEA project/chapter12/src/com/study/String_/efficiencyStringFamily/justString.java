package com.study.String_.efficiencyStringFamily;

public class justString extends template {
    @Override
    public void job() {
        String string = "";
        for (int i = 0; i < 100000; i++) {
            string += i;

        }

    }
}
