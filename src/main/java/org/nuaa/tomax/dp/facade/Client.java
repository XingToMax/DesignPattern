package org.nuaa.tomax.dp.facade;

/**
 * Client
 *
 * @author tomax
 * @date 2019/2/5
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade(new SubSystemA(), new SubSystemB());
        facade.method();
    }
}
