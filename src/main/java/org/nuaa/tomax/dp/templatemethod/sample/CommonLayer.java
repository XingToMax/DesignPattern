package org.nuaa.tomax.dp.templatemethod.sample;

/**
 * @Name: CommonLayer
 * @Description: TODO
 * @Author: tomax
 * @Date: 2019-02-18 23:09
 * @Version: 1.0
 */
public class CommonLayer extends AbstractLayer {
    public CommonLayer(int input, int output) {
        super(input, output);
    }

    @Override
    protected void activate() {
        System.out.println("sigmoid activate");
    }

    @Override
    protected void init() {
        weight = new int[input][output];
        bias = new int[output];
        System.out.println("random initialize");
    }
}
