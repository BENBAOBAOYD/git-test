package cn.duhongiao.day04.JDK9;

import java.util.List;

/*
* JDK9新特性,
* of静态方法
* List接口,Set接口,Map接口,可以一次性给集合添加多个元素
* 使用前提:
*   当前集合中存储的元素的个数已经确定了,
* 注意:
*  1,只适用于List接口,Set接口,Map接口,不适用于接口的实现类
*  2,不能在使用add,和put,方法添加元素
*  3,Set和Map在调用of方法的时候,不能有重复的元素*/
public class Of {
    public static void main(String[] args) {
        List<Object> list = List.of();
    }
}
