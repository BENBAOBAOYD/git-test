package cn.duhongbiao.day09.ObjectStream;

import java.io.*;
import java.util.ArrayList;

/*
* 练习：序列化集合
* 当我们想在文件中保存多个对象的时候，我们要把对象存储到一个集合当中
* 对集合进行序列化和反序列化
* 分析：
* 1，定义一个存储Person对象的集合
* 2，往ArrayList集合中存储对象
* 3，创建一个序列化流的对象
* 4，使用writeObject方法对集合进行序列化
* 5，创建一个反序列化对象
* 6，使用readObject方法读取文件中保存的集合
* 7，把Object类型的集合向下转型为ArrayList
* 8，取出对象，
* 9，释放资源*/
public class DemoSerializableCollection {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1，
        ArrayList<Person> arrayList1 = new ArrayList<>();
        //2,
        arrayList1.add(new Person("赵丽颖",11));
        arrayList1.add(new Person("林志颖",11));
        arrayList1.add(new Person("林志玲",11));
        //3，
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java\\file\\files\\c.txt"));
        //4,
        oos.writeObject(arrayList1);
        //5,
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Java\\file\\files\\c.txt"));
        //6,
        Object o = ois.readObject();
        //7,
        ArrayList<Person> arrayList2 = (ArrayList<Person>) o;
        //8,
        for (Person person : arrayList2) {
            System.out.println(person);
        }
        //9,
        oos.close();
        ois.close();
    }
}
