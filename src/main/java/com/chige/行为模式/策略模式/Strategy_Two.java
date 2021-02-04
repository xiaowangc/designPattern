package com.chige.行为模式.策略模式;

public class Strategy_Two implements Strategy{

    @Override
    public void doSomething(Integer param) {
        System.out.println("具体实现策略: " + param);
    }
}
