package org.nuaa.tomax.dp.singleton;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 21:22
 */
public final class VolatileDoubleCheckSingleton {
    private volatile static VolatileDoubleCheckSingleton instance = null;

    private VolatileDoubleCheckSingleton() {

    }

    public static VolatileDoubleCheckSingleton getInstance() {
        if(null == instance) {
            synchronized (VolatileDoubleCheckSingleton.class) {
                if (null == instance) {
                    instance = new VolatileDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
