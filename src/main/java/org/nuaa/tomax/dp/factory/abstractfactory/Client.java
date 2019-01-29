package org.nuaa.tomax.dp.factory.abstractfactory;

import org.nuaa.tomax.dp.factory.AbstractGuitar;
import org.nuaa.tomax.dp.factory.AbstractPick;
import org.nuaa.tomax.dp.factory.AbstractString;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/29 11:46
 */
public class Client {
    public static void main(String[] args) {
        // just need change different factory to get different products series
        IFactory factory = new MarTinFactory();

        AbstractGuitar guitar = factory.produceGuitar();
        AbstractString string = factory.produceString();
        AbstractPick pick = factory.producePick();

        guitar.play();
        string.display();
        pick.display();
    }
}
