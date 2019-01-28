package org.nuaa.tomax.dp.strategy;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 20:04
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.execute();
    }
}
