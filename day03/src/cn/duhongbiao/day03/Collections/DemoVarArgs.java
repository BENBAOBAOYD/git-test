package cn.duhongbiao.day03.Collections;

/*定义计算0-n证书和的方法，
* 已知计算整数的和，数据类型已经确定int，但是参数的个数不确定，就可以使用可变参数
* 注意事项：
*       1，一个方法的参数列表，只能由一个可变参数
*       2，如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
*       3，可变参数最终写为Objects... o*/
public class DemoVarArgs {
    public static void main(String[] args) {

        int result = methodAdd(12,23,43,54,12);
        System.out.println(result);
    }

    private static int methodAdd(int a, int... ints) {
        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }
        System.out.println(ints+","+ints.length);//打印的是这个数组的地址值，且长度为0
        return sum;
    }


}
