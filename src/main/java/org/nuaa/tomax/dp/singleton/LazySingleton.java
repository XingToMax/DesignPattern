package org.nuaa.tomax.dp.singleton;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 21:00
 */
public final class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
