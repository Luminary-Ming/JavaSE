package com.neuedu.task.$2024_07_31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 客户端
 */
public class CardSendClient {
    /**
     * 创建牌后洗牌的方法
     *
     * @return 洗完的牌
     */
    private static List<Card> createCards() {
        // 创建 54 张牌
        List<Card> cards = new ArrayList<>();
        for (int rank = 0; rank < 13; rank++) {
            for (int suit = 0; suit < 4; suit++) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
        // 小王加进扑克牌
        Card black = new Card(Card.JOKER, Card.BLACK);
        cards.add(black);
        // 大王加进扑克牌
        Card color = new Card(Card.JOKER, Card.COLOR);
        cards.add(color);
        // 洗牌（打乱顺序）
        Collections.shuffle(cards);
        System.out.println("洗完之后的扑克牌：⬇\uFE0F⬇\uFE0F⬇\uFE0F");
        System.out.println(cards + "\n");
        return cards;
    }

    /**
     * 添加玩家，分配手牌
     *
     * @param cards 洗完的牌
     */
    private static List<Player> createPlayers(List<Card> cards) {
        // 添加玩家

        List<Player> player = new ArrayList<>();
        player.add(new Player("\uD83D\uDD34玩家1", "特朗普", " \uD83D\uDC72地主"));
        player.add(new Player("\uD83D\uDD35玩家2", "拜登", "   \uD83D\uDC73农民"));
        player.add(new Player("\uD83D\uDFE2玩家3", "哈里斯", " \uD83D\uDC73农民"));
        // 分配手牌
        for (int i = 0; i < cards.size() - 3; i++) {
            Card card = cards.get(i);
            player.get(i % player.size()).addCard(card);
        }
        return player;
    }

    public static void play() {

        List<Card> cards = createCards();
        System.out.println("游戏开始后，每位玩家的手牌：⬇\uFE0F⬇\uFE0F⬇\uFE0F");
        List<Player> player = createPlayers(cards);
        player.forEach(System.out::println);
        System.out.println();

        System.out.println("底牌是：⬇\uFE0F");
        System.out.print(cards.get(cards.size() - 1) + "  ");
        System.out.print(cards.get(cards.size() - 2) + "  ");
        System.out.print(cards.get(cards.size() - 3) + "\n");
        System.out.println();

        System.out.println("把底牌给地主后：⬇\uFE0F");
        player.get(0).addCard(cards.get(cards.size() - 1));
        player.get(0).addCard(cards.get(cards.size() - 2));
        player.get(0).addCard(cards.get(cards.size() - 3));
        player.forEach(System.out::println);
        System.out.println();

        System.out.println("手牌排序后：⬇\uFE0F");
        // 对每一个 Player 对象调用 sortCard() 方法
        player.forEach(Player::sortCard);
        player.forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89欢迎来到斗地主小游戏！\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");
        System.out.println("快点击开始游戏吧！\uD83D\uDC49\uD83C\uDFAE\uD83C\uDFAE\uD83C\uDFAE" + "\n");
        // 开始游戏
        play();
    }
}
