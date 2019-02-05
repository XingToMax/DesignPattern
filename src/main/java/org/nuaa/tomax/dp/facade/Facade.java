package org.nuaa.tomax.dp.facade;

/**
 * Facade
 *
 * @author tomax
 * @date 2019/2/5
 */
public class Facade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;

    public Facade(SubSystemA subSystemA, SubSystemB subSystemB) {
        this.subSystemA = subSystemA;
        this.subSystemB = subSystemB;
    }

    void method() {
        System.out.println("facade");
        System.out.println("other methods ...");
        subSystemA.methodA();
        subSystemB.methodB();
        System.out.println("other methods ...");
    }
}
