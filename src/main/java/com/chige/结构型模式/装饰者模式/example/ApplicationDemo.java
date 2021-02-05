package com.chige.结构型模式.装饰者模式.example;

import com.fasterxml.jackson.databind.ser.Serializers;

/**
 * 客户端类负责创建 <被包装对象> 和 <装饰者>，并决定如何进行包装和执行：
 */
public class ApplicationDemo {

    public static void main(String[] args) {
        Car benzCar = new BenzCar();
        Car bwmCar = new BWMCar();
        // 创建自动驾驶的奔驰汽车
        BaseDecoratorCar autoBenzCar = new AutoCarDecorator(benzCar);
        autoBenzCar.run();
        // 创建飞行模式的奔驰汽车
        BaseDecoratorCar flyBenzCar = new FlyCarDecorator(benzCar);
        flyBenzCar.run();
        // 创建飞行模式的宝马汽车
        BaseDecoratorCar flyBwmCar = new FlyCarDecorator(bwmCar);
        flyBwmCar.run();
        // 创建自动驾驶的宝马汽车
        BaseDecoratorCar autoBwmCar = new AutoCarDecorator(bwmCar);
        autoBwmCar.run();
        // 创建自动驾驶和飞行模式的奔驰汽车
        BaseDecoratorCar autoAndFlyBenzCar = new AutoCarDecorator(new FlyCarDecorator(benzCar));
        autoAndFlyBenzCar.run();
        // 创建自动驾驶和飞行模式的宝马汽车
        BaseDecoratorCar flyAndAutoBwmCar = new FlyCarDecorator(new AutoCarDecorator(bwmCar));
        flyAndAutoBwmCar.run();

        // 创建自动驾驶、可以打开天窗的奔驰汽车
        BaseDecoratorCar autoAndOpenBwmCar = new AutoCarDecorator(new OpenDoorCarDecorator(bwmCar));
        autoAndOpenBwmCar.run();
    }
}
