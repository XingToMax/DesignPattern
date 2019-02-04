package org.nuaa.tomax.dp.prototype;

import java.io.*;

/**
 * Prototype
 *
 * @author tomax
 * @date 2019/2/4
 */
public class Prototype implements Cloneable, Serializable {
    private static final Long servialVersionUID = 1L;

    private Object data;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();
    }
}
