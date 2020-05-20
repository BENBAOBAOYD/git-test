package cn.duhongiao.day04.MapTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
* 练习:计算一个字符串中每个字符出现的次数
* 使用*/
public class Demo01 {
    public static void main(String[] args) {
        method01();//我的方法
//        method02();
    }

    private static void method02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String string = scanner.next();
        HashMap<Character, Integer> map = new HashMap<>();
        long l1 = System.currentTimeMillis();

        for (char c :string.toCharArray()) {
            if(map.containsKey(c)) {
                Integer sum = map.get(c);
                sum ++;
                map.put(c,sum);
            }else {
                map.put(c,1);
            }
        }
        long l2 = System.currentTimeMillis();
        System.out.println(map);
        System.out.println(l2-l1);
    }



    private static void method01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String string = scanner.next();
        char[] chars = string.toCharArray();
        int sum = 0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        long l1 = System.currentTimeMillis();
        for (char ziFu = 'A'; ziFu <= 'z'; ziFu++) {
            for (int i = 0; i < chars.length; i++) {
                if (ziFu == chars[i]){
                    sum++;
                }
            }
            hashMap.put(ziFu,sum);
            sum = 0;
        }
        long l2 = System.currentTimeMillis();
        System.out.println(hashMap);
        System.out.println(l2-l1);
    }
}
