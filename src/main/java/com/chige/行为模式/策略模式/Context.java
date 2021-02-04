package com.chige.行为模式.策略模式;

/** 上下文 调用策略
 * 不关心策略具体怎么实现的
 */
public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 调用策略执行方法
     */
    public void executeStrategy(Integer paramA) {
        strategy.doSomething(paramA);
    }
}
