package com.chige.结构型模式.装饰者模式.example;

/**
 *  具体装饰实现类-功能扩展类
 */
public class AutoCarDecorator extends BaseDecoratorCar {

    public AutoCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        super.run();
        autoRun();
    }

    private void autoRun() {
        System.out.println("自动驾驶！");
    }
}
