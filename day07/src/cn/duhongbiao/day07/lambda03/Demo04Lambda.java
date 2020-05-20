package cn.duhongbiao.day07.lambda03;

/*定义一个计算器接口，内含抽象方法calc可以将两个int数字相加得到和值
* */
public class Demo04Lambda {
    public static void main(String[] args) {

        invokeCalc(10, 20, (int a,int b) -> {
                    return a + b;
                }
        );
        //优化
        invokeCalc(10, 20, ( a, b) -> a + b

        );
    }
        /*定义一个方法，传递两个参数到Calculator接口
        * */
    private static void invokeCalc(int a, int b, Calculator calculator) {
        int sum = calculator.calc(a, b);
        System.out.println(sum);
    }
}
