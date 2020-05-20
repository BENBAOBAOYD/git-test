package cn.duhongbiao.day01.Data;

import java.util.Arrays;

public class DemoSystem {
    public static void main(String[] args) {
//        method01();
        method02();
    }

    /* public static native void arraycopy(Object var0, int var1, Object var2, int var3, int var4);
     * 将数组中的指定数据拷贝到另一个数组中
     * 原数组，原数组的起始位置，目标数组，目标数组中的起始位置，要复制的数组元素的数量
     * [1,2,3,4,5]复制到
     * [6,7,8,9,10]
     * 结果是
     * [1,2,3,9,10]*/
    private static void method02() {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        System.out.println("复制前"+ Arrays.toString(array2));
        System.arraycopy(array1,0,array2,0,3);
        System.out.println("复制后"+ Arrays.toString(array2));

    }

    /*
    * public static long currentTimeMills()返回以毫秒为单位的当前时间
    * 用来验证程序效率
    * 验证for循环打印数字1-9999所需时间*/
    private static void method01() {
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long over = System.currentTimeMillis();
        System.out.println("==================");
        System.out.println("此方法耗时" + (over-begin));
    }
}
