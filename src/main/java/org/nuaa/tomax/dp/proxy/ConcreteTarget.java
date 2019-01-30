package org.nuaa.tomax.dp.proxy;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/30 17:25
 */
public class ConcreteTarget implements Target {
    @Override
    public void execute() {
        System.out.println("target work");
    }
}
