package com.chige.结构型模式.装饰者模式;

/**
 *  具体装饰器 - 继承自基础装饰器
 *  可实现额外的扩展功能
 */
public class ConcreteDecorator extends BaseDecorator{

    @Override
    public void execute() {
        super.execute();
    }

    /**
     *  扩展方法
     */
    public void extra() {
        System.out.println("实现了扩展功能");
    }
}
