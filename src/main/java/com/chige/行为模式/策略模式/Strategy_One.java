package com.chige.行为模式.策略模式;


public class Strategy_One implements Strategy {


    @Override
    public void doSomething(Integer param) {
        System.out.println("这是具体实现策略: " + param);
    }
}
