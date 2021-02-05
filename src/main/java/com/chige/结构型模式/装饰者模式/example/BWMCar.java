package com.chige.结构型模式.装饰者模式.example;

/**
 * 具体组件类，是抽象组件Car的具体实现类，实现自己的行为
 */
public class BWMCar implements Car{

    @Override
    public void run() {
        System.out.println("宝马开车了");
    }
}
