package org.nuaa.tomax.dp.singleton;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/28 21:39
 */
public final class LazyEnumSingleton {
    private LazyEnumSingleton() {

    }

    private enum Holder {
        INSTANCE;
        private LazyEnumSingleton instance;
        Holder() {
            this.instance = new LazyEnumSingleton();
        }

        private LazyEnumSingleton getInstance() {
            return instance;
        }
    }

    public LazyEnumSingleton getInstance() {
        return Holder.INSTANCE.getInstance();
    }
}
