package cn.duhongiao.day04.Debug;

/*Debug调试程序
*   可以让代码逐行执行,查看代码执行的过程,调试程序中初选的bug
* 使用方式:
*   在行号左边,添加断点,
*   右键,选择Debug*/
public class DemoDebug {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int sum = a + b;
        System.out.println(sum);
    }
}
