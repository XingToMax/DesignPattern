package org.nuaa.tomax.dp.templatemethod.sample;

/**
 * @Name: Client
 * @Description: TODO
 * @Author: tomax
 * @Date: 2019-02-18 23:12
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractLayer layer = new CommonLayer(10, 100);
        layer.calculate(new int[][]{{1}});

        layer = new WorkLayer(10, 100);
        layer.calculate(new int[][]{{1}});
    }
}
