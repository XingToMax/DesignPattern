package org.nuaa.tomax.dp.singleton;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 21:07
 */
public final class SychronizedLazySingleton {
    private static SychronizedLazySingleton instance = null;

    private SychronizedLazySingleton() {

    }

    public static synchronized SychronizedLazySingleton getInstance() {
        if (null == instance) {
            instance = new SychronizedLazySingleton();
        }
        return instance;
    }
}
