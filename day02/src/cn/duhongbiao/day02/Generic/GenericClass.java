package cn.duhongbiao.day02.Generic;

/*
* 定义一个含有泛型的类
* 泛型是一个位置的数据类型，当我们不确定使用什么数据类型的时候就要使用泛型*/
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

}
