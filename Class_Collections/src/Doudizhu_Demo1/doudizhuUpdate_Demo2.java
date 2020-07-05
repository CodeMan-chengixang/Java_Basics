package Doudizhu_Demo1;

import java.util.*;

/*案例：模拟斗地主升级版
 * 需求：通过程序实现斗地主过程中的洗牌、发牌、看牌；
 * 要求对牌进行排序*/
public class doudizhuUpdate_Demo2 {
    public static void main(String[] args) {
//使用HashMap集合作为牌盒存储牌，键为牌的编号（0-53），值为对应的牌（最小牌-最大牌）
// 创建花色和牌值数组，往HashMap集合添加元素
//用ArrayList集合存储编号，用编号洗牌调用Collections的shuffle（）方法洗牌
//发牌给3个玩家，用TreeSet集合存储编号，实现从小到大的自然排序
//调用看牌方法，通过键得到Map集合中的值，实现看牌
        //装牌
        HashMap<Integer, String> cardBox = new HashMap<>();
        ArrayList<Integer> cardId = new ArrayList<>();
        String[] colors = {"♥", "♠", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int key = 0;
        for (String number : numbers) {
            for (String color : colors) {
                cardBox.put(key, color + number);
                cardId.add(key);
                key++;
            }
        }
        cardBox.put(key, "小王");
        cardId.add(key);
        key++;
        cardBox.put(key, "大王");
        cardId.add(key);

        //洗牌
        Collections.shuffle(cardId);

        //发牌
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();
        for (int i = 0; i < cardId.size(); i++) {
            if (i < cardId.size() - 3) {
                if (i % 3 == 0) {
                    player1.add(cardId.get(i));
                } else if (i % 3 == 1) {
                    player2.add(cardId.get(i));
                } else if (i % 3 == 2) {
                    player3.add(cardId.get(i));
                }
            } else {
                dipai.add(cardId.get(i));
            }
        }

        //看牌
        lookCard("张三", player1, cardBox);
        lookCard("李四", player2, cardBox);
        lookCard("王五", player3, cardBox);
        lookCard("底牌", dipai, cardBox);


    }

    public static void lookCard(String name, TreeSet<Integer> ts, HashMap<Integer, String> cardBox) {
        System.out.print(name + "的牌是：");
        for (Integer key : ts) {
            String s = cardBox.get(key);
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
