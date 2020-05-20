package cn.duhongbiao.day02.Generic;

/*含有泛型的接口，
第二种使用方式:定义接口的实现类，不指定接口的泛型，创建对象的时候决定泛型的类型*/
public class GenericInterfaceImpl2<E> implements GenericInterface<E>{


    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
