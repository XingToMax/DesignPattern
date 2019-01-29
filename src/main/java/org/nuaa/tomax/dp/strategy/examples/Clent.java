package org.nuaa.tomax.dp.strategy.examples;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 20:11
 */
public class Clent {
    public static void main(String[] args) {
        Layer layer1 = new Layer(new ReluActivation(), new RandomInitializer());
        Layer layer2 = new Layer(new ReluActivation(), new NormalInitializer());
        Layer layer3 = new Layer(new SigmoidActivation(), new RandomInitializer());
        Layer layer4 = new Layer(new SigmoidActivation(), new NormalInitializer());
    }
}
