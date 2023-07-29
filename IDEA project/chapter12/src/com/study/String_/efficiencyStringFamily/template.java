package com.study.String_.efficiencyStringFamily;

public abstract class template {


    public abstract void job();



    public void result(){
        long start_time = System.currentTimeMillis();
        job();
        long end_time = System.currentTimeMillis();

        System.out.println(end_time - start_time);
    }

}
