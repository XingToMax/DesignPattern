package org.nuaa.tomax.dp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/30 17:43
 */
public class TargetProxyFactory {
    private Target target;

    public TargetProxyFactory(Target target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
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
                    void before() {
                        System.out.println("happen before target");
                    }

                    void after() {
                        System.out.println("happen after target");
                    }

                }
        );
    }
}
