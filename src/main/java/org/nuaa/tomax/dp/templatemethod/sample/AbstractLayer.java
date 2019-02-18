package org.nuaa.tomax.dp.templatemethod.sample;

/**
 * @Name: AbstractLayer
 * @Description: TODO
 * @Author: tomax
 * @Date: 2019-02-18 23:05
 * @Version: 1.0
 */
public class AbstractLayer {
    protected int[][] weight;
    protected int[] bias;
    protected int input;
    protected int output;

    public AbstractLayer(int input, int output) {
        this.input = input;
        this.output = output;
        init();
    }

    public void calculate(int[][] data) {
        // ...
        System.out.println("weight * data + bias");
        activate();
    }

    protected void init() {

    }

    protected void activate() {

    }
}
