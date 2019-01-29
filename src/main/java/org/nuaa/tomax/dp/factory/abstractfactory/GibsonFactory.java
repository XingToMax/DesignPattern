package org.nuaa.tomax.dp.factory.abstractfactory;

import org.nuaa.tomax.dp.factory.*;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/29 11:32
 */
public class GibsonFactory implements IFactory {
    @Override
    public AbstractGuitar produceGuitar() {
        return new GibsonGuitar();
    }

    @Override
    public AbstractString produceString() {
        return new GibsonString();
    }

    @Override
    public AbstractPick producePick() {
        return new GibsonPick();
    }
}
