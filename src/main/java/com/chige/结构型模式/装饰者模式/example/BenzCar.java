package com.chige.结构型模式.装饰者模式.example;


/**
 *  具体组件类，是抽象组件Car的具体实现类
 */
public class BenzCar implements Car{

    @Override
    public void run() {
        System.out.println("奔驰开车了");
    }

//    public void AIRun() {
//        System.out.println("奔驰还有AI自动驾驶功能");
//    }
}
