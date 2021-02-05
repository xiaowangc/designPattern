package com.chige.结构型模式.装饰者模式.example;



public class FlyCarDecorator extends BaseDecoratorCar {
    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        super.run();
        fly();
    }

    private void fly() {
        System.out.println("开启飞行模式！");
    }
}
