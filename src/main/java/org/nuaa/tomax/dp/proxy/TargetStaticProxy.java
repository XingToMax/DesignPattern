package org.nuaa.tomax.dp.proxy;

import java.util.Random;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/30 17:25
 */
public class TargetStaticProxy implements Target{
    private Target target;

    public TargetStaticProxy(Target target) {
        this.target = target;
    }

    @Override
    public void execute() {
        before();
        Random random = new Random();
        int control = random.nextInt(100);
        if (control > 50) {
            target.execute();
        } else {
            System.out.println("target reject");
        }
        after();
    }

    private void before() {
        System.out.println("happen before target");
    }

    private void after() {
        System.out.println("happen after target");
    }
}
