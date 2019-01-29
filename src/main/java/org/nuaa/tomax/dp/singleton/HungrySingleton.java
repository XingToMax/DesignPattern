package org.nuaa.tomax.dp.singleton;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 20:53
 */
public final class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
