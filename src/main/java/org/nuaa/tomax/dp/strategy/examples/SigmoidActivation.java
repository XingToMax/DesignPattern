package org.nuaa.tomax.dp.strategy.examples;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 20:07
 */
public class SigmoidActivation implements IActivation {
    @Override
    public double activate(double x) {
        System.out.println("sigmoid activate");
        // TODO : activate
        return x;
    }
}
