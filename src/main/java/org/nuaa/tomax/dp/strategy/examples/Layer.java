package org.nuaa.tomax.dp.strategy.examples;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 20:06
 */
public class Layer {
    // other params ...

    private IActivation activation;
    private IInitializer initializer;

    public Layer(IActivation activation, IInitializer initializer) {
        this.activation = activation;
        this.initializer = initializer;
    }

    // other methods ...
}
