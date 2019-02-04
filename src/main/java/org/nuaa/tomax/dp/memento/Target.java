package org.nuaa.tomax.dp.memento;

/**
 * Target
 *
 * @author tomax
 * @date 2019/2/4
 */
public class Target {
    private Object tempData;
    private Object data;

    public Memento createMemento() {
        return new Memento(data);
    }

    public void restoreMemento(Memento memento) {
        this.data = memento.getData();
    }
}
