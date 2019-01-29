package org.nuaa.tomax.dp.factory.fatorymethods;

import org.nuaa.tomax.dp.factory.AbstractGuitar;
import org.nuaa.tomax.dp.factory.MarTinGuitar;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/29 11:30
 */
public class MarTinGuitarFactory implements IGuitarFactory {
    @Override
    public AbstractGuitar produce() {
        return new MarTinGuitar();
    }
}
