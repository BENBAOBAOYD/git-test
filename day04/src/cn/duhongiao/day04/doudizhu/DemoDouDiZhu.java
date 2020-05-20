package cn.duhongiao.day04.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DemoDouDiZhu {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> color = List.of("♥", "♠", "♣", "♦");
        List<String> num = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        //1.创建扑克map和牌的索引
        // 先放大王
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        for (String col : num) {
            for (String n : color) {
                poker.put(index,col+n);
                pokerIndex.add(index);
                index++;
            }
        }
//        System.out.println(poker);
//        System.out.println(pokerIndex);
        //2.洗牌
        //打乱牌的索引集合
        Collections.shuffle(pokerIndex);
        //3.发牌
        //定义三个玩家的牌的索引的集合.和底牌索引的集合
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            int x = pokerIndex.get(i);
            if (i >= 51){
                diPai.add(x);
            }else if (i % 3 == 0){
                player1.add(x);
            }else if (i % 3 == 1){
                player2.add(x);
            }else if (i % 3 == 2){
                player3.add(x);
            }
        }
//        4,排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        /*定义一个方法提高牌的复用性
        * 参数:
        *   玩家名称
        *   扑克牌的map
        *   存储玩家和底牌索引的集合*/
        //5,看牌
        look("Player1",poker,player1);
        look("Player2",poker,player2);
        look("Player3",poker,player3);

    }
    private static void look(String name,HashMap<Integer, String> poker, ArrayList<Integer> pokerIndex) {
        //输出玩家名称
        System.out.print(name+":");
        for (Integer index : pokerIndex) {
            System.out.print(poker.get(index)+" ");
        }
        System.out.println();
    }
}
