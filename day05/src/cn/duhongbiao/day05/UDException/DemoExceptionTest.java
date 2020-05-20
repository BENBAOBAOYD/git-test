package cn.duhongbiao.day05.UDException;

import java.util.Scanner;

/*要求，模拟注册操作，，如果用户名已经存在，则抛出异常并提示：亲，该用户名已经被注册
* 分析：
* 1，用数组保存已经注册过的用户名
* 2，使用scanner获取输入用户名
* 3，定义方法，遍历数组与输入的用户名进行比较
* */
public class DemoExceptionTest {
    private static String[] userNames = {"A","B","V"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册用户名");
        String input = sc.next();
        checkUsername(input);

    }

    private static void checkUsername(String str) {
        //遍历
        for (String userName : userNames) {
            try {
                if (userName.equals(str)) {
                    throw new RegisterException("亲，该用户名已经被注册");
                }
            }catch (Exception e){
                e.printStackTrace();
                return;//结束方法
            }
        }
        System.out.println("注册成功");
    }

}
