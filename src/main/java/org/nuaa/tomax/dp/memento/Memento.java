package org.nuaa.tomax.dp.memento;

/**
 * Memento
 *
 * @author tomax
 * @date 2019/2/4
 */
public class Memento {
    private Object data;

    public Memento(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
