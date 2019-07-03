package com.demotest.example.bean.静态工厂;

public class Cat implements Being {

    private String msg;

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    @Override
    public void testBeing(){
        System.out.println(msg+"=> 猫爱吃老鼠");
    }
}
