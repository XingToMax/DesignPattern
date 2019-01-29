package org.nuaa.tomax.dp.factory.abstractfactory;

import org.nuaa.tomax.dp.factory.*;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/29 11:33
 */
public class TaylorFactory implements IFactory {
    @Override
    public AbstractGuitar produceGuitar() {
        return new TaylorGuitar();
    }

    @Override
    public AbstractString produceString() {
        return new TaylorString();
    }

    @Override
    public AbstractPick producePick() {
        return new TaylorPick();
    }
}
