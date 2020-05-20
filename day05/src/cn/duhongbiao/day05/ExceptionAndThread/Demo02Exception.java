package cn.duhongbiao.day05.ExceptionAndThread;
/*分析异常产生的过程*/
public class Demo02Exception {
    public static void main(String[] args) {
        /*
        * 定义一个方法，获取数组指定索引处的元素*/
        Object[] arr = {1,2,3,4};

        getElement(arr,0);
    }
    private static Object getElement(Object[] obj, int index) {
        Object ele = obj[index];
        return ele;
    }
}
