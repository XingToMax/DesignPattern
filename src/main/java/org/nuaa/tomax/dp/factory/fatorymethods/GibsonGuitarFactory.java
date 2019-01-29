package org.nuaa.tomax.dp.factory.fatorymethods;

import org.nuaa.tomax.dp.factory.GibsonGuitar;
import org.nuaa.tomax.dp.factory.AbstractGuitar;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/29 11:29
 */
public class GibsonGuitarFactory implements IGuitarFactory {
    @Override
    public AbstractGuitar produce() {
        return new GibsonGuitar();
    }
}
