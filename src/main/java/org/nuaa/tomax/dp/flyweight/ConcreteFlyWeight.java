package org.nuaa.tomax.dp.flyweight;

/**
 * ConcreteFlyWeight
 *
 * @author tomax
 * @date 2019/2/6
 */
public class ConcreteFlyWeight implements FlyWeight {
    private Object intrinsicState;

    public ConcreteFlyWeight(Object intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void execute(String state) {
        System.out.println("intrinstic state : " + intrinsicState);
        System.out.println("extrinstic state : " + state);
    }
}
