package org.nuaa.tomax.dp.proxy;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/30 17:27
 */
public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        // 静态代理
        Target targetStaticProxy = new TargetStaticProxy(target);
        targetStaticProxy.execute();
        // 动态代理
        Target targetProxy = (Target) new TargetProxyFactory(target).getProxyInstance();
        targetProxy.execute();
        // cglib
        Target targetCglibProxy = (Target) new TargetCglibProxyFactory(target).getProxyInstance();
        targetCglibProxy.execute();
    }
}
