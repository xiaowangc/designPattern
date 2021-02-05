package com.chige.结构型模式.装饰者模式;

/**
 *  具体部件类
 */
public class ConcreteComponent implements Component{

    @Override
    public void execute() {
        System.out.println("实现具体部件类方法1");
    }
}
