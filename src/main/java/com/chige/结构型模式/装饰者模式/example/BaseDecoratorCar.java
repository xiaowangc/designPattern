package com.chige.结构型模式.装饰者模式.example;

/** 装饰基类
 *  作为装饰基类会直接将所有工作分配给被封装的组件Car。 具体的装饰类则可以新增一些额外的工作
 */
public class BaseDecoratorCar implements Car{
    // Car作为被封装的组件，负责处理一些基本的工作
    private Car car;

    public BaseDecoratorCar(Car car) {
        this.car = car;
    }

    /**
     *  基础的方法处理由被封装的组件负责
     */
    @Override
    public void run() {
        car.run();
    }
}
