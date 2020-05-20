package cn.duhongbiao.day03.Set;

import cn.duhongbiao.day03.Collections.Person;

/*哈希值，是一个十进制的整数，由系统随机给出（就是对昂的地址值，是一个逻辑地址
是模拟出来的地址，不是数据实际存储的地址）
在Object类中有个方法，可以获取对象的哈希值
int hashCode（）
hashCode源码：
public native int hashCode();
native：代表调用的是本地操作系统的方法*/
public class Demo01HashCode {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        int i = person1.hashCode();
        System.out.println(i);//381259350
        int i1 = person2.hashCode();
        System.out.println(i1);//2129789493
        /*toString源码：
        *     public String toString() {
        return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
    }*/
        System.out.println(person1);//cn.duhongbiao.day03.Collections.Person@16b98e56
        System.out.println(person2);//cn.duhongbiao.day03.Collections.Person@7ef20235
    /*
    * String类重写了hashCode方法
    * */
    }
}
