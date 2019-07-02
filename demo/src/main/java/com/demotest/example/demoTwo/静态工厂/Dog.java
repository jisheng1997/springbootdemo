package com.demotest.example.demoTwo.静态工厂;

public class Dog implements Being {

    private String msg;

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    @Override
    public void testBeing(){
        System.out.println(msg+"=> 狗爱啃骨头");
    }
}
