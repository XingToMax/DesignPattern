package org.nuaa.tomax.dp.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/30 18:27
 */
public class TargetCglibProxyFactory implements MethodInterceptor{
    private Object target;

    public TargetCglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        Random random = new Random();
        int control = random.nextInt(100);
        Object retVal = null;
        if (control > 50) {
            retVal = method.invoke(target, args);
        } else {
            System.out.println("target reject");
        }
        after();
        return retVal;
    }
    private void before() {
        System.out.println("happen before target");
    }

    private void after() {
        System.out.println("happen after target");
    }
}
