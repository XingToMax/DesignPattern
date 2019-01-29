package org.nuaa.tomax.dp.factory.abstractfactory;

import org.nuaa.tomax.dp.factory.AbstractGuitar;
import org.nuaa.tomax.dp.factory.AbstractPick;
import org.nuaa.tomax.dp.factory.AbstractString;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/29 11:31
 */
public interface IFactory {
    AbstractGuitar produceGuitar();

    AbstractString produceString();

    AbstractPick producePick();
}
