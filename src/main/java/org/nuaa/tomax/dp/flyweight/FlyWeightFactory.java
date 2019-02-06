package org.nuaa.tomax.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyWeightFactory
 *
 * @author tomax
 * @date 2019/2/6
 */
public class FlyWeightFactory {
    private Map<String, FlyWeight> flyWeightMap = new HashMap<>();

    public FlyWeight factory(String state) {
        if (flyWeightMap.containsKey(state)) {
            return flyWeightMap.get(state);
        } else {
            FlyWeight flyWeight = new ConcreteFlyWeight(state);
            flyWeightMap.put(state, flyWeight);
            return flyWeight;
        }
    }
}
