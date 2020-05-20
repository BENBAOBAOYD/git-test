package cn.duhongbiao.day05.ExceptionAndThread;

/*throw
* 作用：
*   可以使用throw关键字，在指定打方法中抛出指定的异常
* 使用格式：
*   throw new xxxException("异常产生的原因")
* 注意：
* 1,throw必须卸载方法的内部
* 2,throw后边new的对象必须是Exception或者Exception的子类对象
* 3,throw抛出指定的异常对象，我们就必须处理这个异常对象
*   throw后边创建的是RuntimeException或者是RuntimeException的子类对象，我们就可以不处理，
*   默认交给JVM处理
*   反之我们必须处理这个异常，要么throws，要么try...catch
* */
public class Demo03Throw {
    public static void main(String[] args) {
        /*
        * 以后我们首先必须对方法传递过来的参数进行合法性校验
        * 如果参数不合法，我们就必须抛出异常的方式，告知方法的调用者，传递的参数有问题
        * 注意
        * NullPointerException就是一个运行期异常，我们不用处理，默认交给JVM处理
        * ArrayIndexOutOfBoundsException是一个运行期异常，我们不用处理，默认交给JVM处理/

        /*进行合法性校验
        * 如果arr进来的是null，
        * 那么我就抛出空指针异常，告知方法的调用者，传递的数组的值是null
       * */
        int[] arr = {1, 2, 3};
    }
    private static int getElement ( int[] arr, int index){
        if (arr == null) {
            throw new NullPointerException("传递数组的值为null");
        }
        if (index < 0 || index > arr.length) {
            throw new ArrayIndexOutOfBoundsException("传递的数组超出了数组的使用范围");
        }
        /*对index进行合法性校验
         * 如果其范围不再数组索引范围内，那么我们就抛出数组索引越界异常
         * 告知方法的调用者传递的索引，超出了数组的使用范围*/
        int ele = arr[index];
        return ele;
    }
}
