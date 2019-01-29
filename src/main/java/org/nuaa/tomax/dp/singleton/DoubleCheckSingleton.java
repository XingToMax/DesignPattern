package org.nuaa.tomax.dp.singleton;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 21:09
 */
public final class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if(null == instance) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == instance) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
