package org.nuaa.tomax.dp.memento.sample;

import java.util.List;

/**
 * GameMemento
 *
 * @author tomax
 * @date 2019/2/4
 */

public class GameMemento {
    private int level;
    private List<String> skills;

    public GameMemento(int level, List<String> skills) {
        this.level = level;
        this.skills = skills;
    }

    public int getLevel() {
        return this.level;
    }

    public List<String> getSkills() {
        return this.skills;
    }
}
