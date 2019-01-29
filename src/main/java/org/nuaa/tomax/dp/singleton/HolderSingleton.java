package org.nuaa.tomax.dp.singleton;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 21:24
 */
public final class HolderSingleton {
    private HolderSingleton() {

    }

    private static class Holder {
        private static HolderSingleton instance = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.instance;
    }
}
