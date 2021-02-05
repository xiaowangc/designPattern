package com.chige.结构型模式.装饰者模式;

/**
 *  基础装饰器 - 拥有一个指向被封装对象的引用成员变量
 */
public class BaseDecorator implements Component {
    /**
     *  通用部件接口
     */
    private Component component;

    public BaseDecorator() {}
    public BaseDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void execute() {
        component.execute();
    }
}
