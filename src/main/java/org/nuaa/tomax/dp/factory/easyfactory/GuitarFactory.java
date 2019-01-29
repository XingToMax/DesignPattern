package org.nuaa.tomax.dp.factory.easyfactory;

import org.nuaa.tomax.dp.factory.GibsonGuitar;
import org.nuaa.tomax.dp.factory.AbstractGuitar;
import org.nuaa.tomax.dp.factory.MarTinGuitar;
import org.nuaa.tomax.dp.factory.TaylorGuitar;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2019/1/29 11:23
 */
public class GuitarFactory {
    public static AbstractGuitar produce(String type) {
        switch (type) {
            case "MarTin": return new MarTinGuitar();
            case "Taylor": return new TaylorGuitar();
            case "Gibson": return new GibsonGuitar();
            default: {
                System.out.println("unknown type of guitar, cannot produce");
                return null;
            }
        }
    }
}
