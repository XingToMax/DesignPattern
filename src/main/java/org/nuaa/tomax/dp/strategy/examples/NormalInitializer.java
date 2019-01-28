package org.nuaa.tomax.dp.strategy.examples;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 20:08
 */
public class NormalInitializer implements IInitializer {
    @Override
    public void init(Layer layer) {
        System.out.println("normal initial");
    }
}
