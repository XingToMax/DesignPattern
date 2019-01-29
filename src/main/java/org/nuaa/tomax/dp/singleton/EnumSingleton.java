package org.nuaa.tomax.dp.singleton;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 21:29
 */
public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {

    }

    public static void method() {

    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
