package com.chige.结构型模式.装饰者模式.example;

public class OpenDoorCarDecorator extends BaseDecoratorCar{
    public OpenDoorCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        super.run();
        open();
    }
    private void open() {
        System.out.println("可以打开天窗");
    }

}
