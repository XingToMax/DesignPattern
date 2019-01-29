package org.nuaa.tomax.dp.factory.easyfactory;

import org.nuaa.tomax.dp.factory.AbstractGuitar;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/29 11:51
 */
public class Client {
    public static void main(String[] args) {
        AbstractGuitar guitar = null;

        guitar = GuitarFactory.produce("MarTin");
        assert null != guitar;
        guitar.play();

        guitar = GuitarFactory.produce("Taylor");
        assert null != guitar;
        guitar.play();

        guitar = GuitarFactory.produce("Gibson");
        assert null != guitar;
        guitar.play();

        guitar = GuitarFactory.produce("...");
        assert null != guitar;
        guitar.play();
    }
}
