package org.nuaa.tomax.dp.templatemethod.sample;

/**
 * @Name: WorkLayer
 * @Description: TODO
 * @Author: tomax
 * @Date: 2019-02-18 23:11
 * @Version: 1.0
 */
public class WorkLayer extends AbstractLayer {
    public WorkLayer(int input, int output) {
        super(input, output);
    }

    @Override
    protected void activate() {
        System.out.println("relu activate");
    }

    @Override
    protected void init() {
        weight = new int[input][output];
        bias = new int[output];
        System.out.println("work random initialize");
    }
}
