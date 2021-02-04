package com.chige.行为模式.策略模式;

import sun.security.krb5.internal.PAData;

public class ApplicationRequest {

    private Context context = new Context();

    public void requestOne(Integer param, Strategy strategy) {
        context.setStrategy(strategy);
        this.responseOne(param);
    }

    public void responseOne(Integer param) {
        context.executeStrategy(param);
    }

    public void requestTwo(Integer paramB, Strategy strategy) {
        context.setStrategy(strategy);
        context.executeStrategy(paramB);
    }

    public static void main(String[] args) {
        ApplicationRequest request = new ApplicationRequest();
        // 1. 前端请求不同的行为时，对应不同的策略实现
        request.requestOne(1,new Strategy_One());
        request.requestTwo(2,new Strategy_Two());

    }


}
