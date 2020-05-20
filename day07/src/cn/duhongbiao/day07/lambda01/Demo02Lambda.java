package cn.duhongbiao.day07.lambda01;

/*需求：给定一个Cook接口，内含唯一的方法makeFood，无参数无返回值
* 使用lambda的标准格式调用invokeCook方法，打印吃饭啦字样*/
public class Demo02Lambda {
    public static void main(String[] args) {
        //调用invokeCook方法
        invokeCook(() -> {
            System.out.println("吃饭了");
        });
        //优化省略
        invokeCook(() -> System.out.println("吃饭了")
        );
    }
    //定义一个方法，传入Cook接口，方法内部调用接口中的makeFood方法
    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
