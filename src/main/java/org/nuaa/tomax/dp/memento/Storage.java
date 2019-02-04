package org.nuaa.tomax.dp.memento;

/**
 * Storage
 *
 * @author tomax
 * @date 2019/2/4
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
