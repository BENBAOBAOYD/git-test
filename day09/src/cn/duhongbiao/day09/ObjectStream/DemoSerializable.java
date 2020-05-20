package cn.duhongbiao.day09.ObjectStream;

import java.io.*;

public class DemoSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java\\file\\files\\c.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Java\\file\\files\\c.txt"));
        Person person = new Person("赵丽颖", 10);
        oos.writeObject(person);
        Object o = ois.readObject();
        System.out.println(o);
        oos.close();
        ois.close();
        // 用transient关键字修饰
        // Person{name='赵丽颖', age=0}
    }
}
