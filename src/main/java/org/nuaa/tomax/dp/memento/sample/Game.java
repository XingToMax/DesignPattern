package org.nuaa.tomax.dp.memento.sample;

import java.util.List;

/**
 * Game
 *
 * @author tomax
 * @date 2019/2/4
 */
public class Game {
    private int level;
    private List<String> skills;

    private int currentBossBlood = 10000;

    public GameMemento createMemento() {
        return new GameMemento(level, skills);
    }

    public void restoreMemento(GameMemento memento) {
        this.level = memento.getLevel();
        this.skills = memento.getSkills();
    }
}
