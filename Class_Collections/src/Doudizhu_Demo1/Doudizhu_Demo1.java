package Doudizhu_Demo1;

import java.util.ArrayList;
import java.util.Collections;

/*案例：模拟斗地主
 * 需求：通过程序实现斗地主过程中的洗牌、发牌、看牌*/
public class Doudizhu_Demo1 {
    public static void main(String[] args) {
//        使用ArrayList集合，创建一个牌盒，用于放牌
        ArrayList<String> cardBox = new ArrayList<>();

        //往牌盒中装牌，也就是添加牌元素
        String[] colors = {"♣", "♦", "♥", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String nember : numbers) {
                cardBox.add(color + nember);
            }
        }
        cardBox.add("大王");
        cardBox.add("小王");

//        洗牌：使用Collections中的shuffle（）方法
        Collections.shuffle(cardBox);

//        发牌：创建三个玩家集合和一个底牌集合，发牌规则按除3张底牌之外的牌，对3取余分别发给3个人
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diCard = new ArrayList<>();
        for (int i = 0; i < cardBox.size(); i++) {
            if (i < cardBox.size() - 3) {
                if (i % 3 == 0) {
                    player1.add(cardBox.get(i));
                } else if (i % 3 == 1) {
                    player2.add(cardBox.get(i));
                } else if (i % 3 == 2) {
                    player3.add(cardBox.get(i));
                }
            } else {
                diCard.add(cardBox.get(i));
            }
        }

//      看牌：遍历4个集合
        lookCard("张三",player1);
        lookCard("李四",player2);
        lookCard("王五",player3);
        lookCard("底牌",diCard);

    }

//    定义看牌方法
    public static void lookCard(String name,ArrayList<String> array){
        System.out.print(name+"的牌是：");
        for (String s:array){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
