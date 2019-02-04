package org.nuaa.tomax.dp.memento.sample;

/**
 * GameStorage
 *
 * @author tomax
 * @date 2019/2/4
 */
public class GameStorage {
    private GameMemento memento;

    public GameStorage(GameMemento memento) {
        this.memento = memento;
    }

    public void save() {
        System.out.println("save memento");
    }

    public GameMemento getMemento() {
        return memento;
    }

    public void setMemento(GameMemento memento) {
        this.memento = memento;
    }
}
