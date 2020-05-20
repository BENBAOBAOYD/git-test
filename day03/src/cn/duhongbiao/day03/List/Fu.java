package cn.duhongbiao.day03.List;

import java.sql.SQLOutput;

public class Fu {
    int x = 10;
    public void print() {
        System.out.println("父类方法");
    }
    public void methodFu() {
        System.out.println("父类独有");
    }
    private void methodFuPrivate() {
        System.out.println("父类私有方法");
    }
}
