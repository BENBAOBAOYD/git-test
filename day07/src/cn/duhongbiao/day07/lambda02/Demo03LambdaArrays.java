package cn.duhongbiao.day07.lambda02;

import java.util.Arrays;
import java.util.Comparator;

/*需求
* 使用数组存储多个person对象
* 对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排列*/
public class Demo03LambdaArrays {
    public static void main(String[] args) {
        Person[] arrays = {
                new Person("0",18),
                new Person("1",29),
                new Person("2",10)};
        //进行排序
//        Arrays.sort(arrays, new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.getAge() - p2.getAge();
//            }
//        });
        //使用lambda表达式简化匿名内部类
        Arrays.sort(arrays,(p1, p2) -> p1.getAge() - p2.getAge()
        );
        //优化省略
        Arrays.sort(arrays,(Person p1, Person p2) -> {
            return p1.getAge() - p2.getAge();
        });

        //遍历数组
        for (Person person : arrays) {
            System.out.println(person);
        }
    }
}
