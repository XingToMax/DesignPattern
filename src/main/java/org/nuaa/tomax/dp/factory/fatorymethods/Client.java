package org.nuaa.tomax.dp.factory.fatorymethods;

import org.nuaa.tomax.dp.factory.AbstractGuitar;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/29 11:56
 */
public class Client {
    public static void main(String[] args) {
        IGuitarFactory guitarFactory = new GibsonGuitarFactory();
        AbstractGuitar guitar = guitarFactory.produce();
        guitar.play();
    }
}
