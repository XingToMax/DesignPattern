package org.nuaa.tomax.dp.factory.abstractfactory;

import org.nuaa.tomax.dp.factory.*;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/29 11:32
 */
public class MarTinFactory implements IFactory {
    @Override
    public AbstractGuitar produceGuitar() {
        return new MarTinGuitar();
    }

    @Override
    public AbstractString produceString() {
        return new MarTinString();
    }

    @Override
    public AbstractPick producePick() {
        return new MarTinPick();
    }
}
