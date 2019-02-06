package org.nuaa.tomax.dp.flyweight;

/**
 * Client
 *
 * @author tomax
 * @date 2019/2/6
 */
public class Client {
    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();

        FlyWeight a = new ConcreteFlyWeight("a");

        FlyWeight b = new ConcreteFlyWeight("b");

        FlyWeight c = new ConcreteFlyWeight("c");

        FlyWeight aA = new ConcreteFlyWeight("a");

        FlyWeight aAA = new ConcreteFlyWeight("a");

        a.execute("a_");
        b.execute("b_");
        c.execute("c_");
        aA.execute("aA_");
        aAA.execute("aAA_");

    }
}
