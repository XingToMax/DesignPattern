package org.nuaa.tomax.dp.facade;

/**
 * Facade
 *
 * @author tomax
 * @date 2019/2/5
 */
public class Facade {
    void method() {
        System.out.println("facade");
        System.out.println("other methods ...");
        new SubSystemA().methodA();
        new SubSystemB().methodB();
        System.out.println("other methods ...");
    }
}
