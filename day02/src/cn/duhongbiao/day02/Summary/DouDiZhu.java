package cn.duhongbiao.day02.Summary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
* 1,准备牌
* 2，洗牌
* 3，发牌
* 4，看牌*/
public class DouDiZhu {
    public static void main(String[] args) {
        //1,准备牌
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个存储牌号，一个存储花色
        String[] colors = {"♥","♠","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王和小王存储到poker
        poker.add("大王");
        poker.add("小王");
        //循环嵌套两个数组，组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color+number);
            }
        }
        //2,洗牌
        Collections.shuffle(poker);//收纳柜shuffle方法打乱顺序
//        System.out.println(poker);
        //3,发牌
        //定义三个玩家的手牌集合和底牌集合
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        /*遍历poker集合使用索引%3给三个玩家轮流发牌*/
        for (int i = 0; i < poker.size(); i++) {
            if (i < 51) {
                int index = i % 3;
                String pai = poker.get(i);
                switch (index) {
                    case 0:
                        player01.add(pai);break;
                    case 1:
                        player02.add(pai);break;
                    case 2:
                        player03.add(pai);break;
                }
            }else {
                diPai.add(poker.get(i));
            }
        }
        System.out.println("第一位玩家的手牌："+player01+"   剩余手牌数量："+player01.size());
        System.out.println("第二位玩家的手牌："+player02+"   剩余手牌数量："+player02.size());
        System.out.println("第三位玩家的手牌："+player03+"   剩余手牌数量："+player03.size());
        System.out.println("底牌："+diPai);
    }

}
