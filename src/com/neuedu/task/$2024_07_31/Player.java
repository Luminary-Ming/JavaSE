package com.neuedu.task.$2024_07_31;

import com.neuedu.demo.I_collection.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Player {
    /**
     * 玩家id
     */
    private String id;

    /**
     * 玩家名
     */
    private String name;

    /**
     * 游戏身份（农民或者地主）
     */
    private String identity;

    /**
     * 拥有的手牌
     */
    Card[] cards = {};

    public Player() {
    }

    public Player(String id, String name, String identity) {
        this.id = id;
        this.name = name;
        this.identity = identity;
    }

    /**
     * 输出格式
     *
     * @return 玩家id，玩家名，游戏身份，手牌
     */
    @Override
    public String toString() {
        return id + "  " + name + identity + Arrays.toString(cards);
    }

    /**
     * 摸牌的方法
     *
     * @param card 每张牌
     */
    public void addCard(Card card) {
        // cards 数组扩容，每摸一张牌数组长度 +1
        cards = Arrays.copyOf(cards, cards.length + 1);
        cards[cards.length - 1] = card;
    }

    /**
     * 分配玩家游戏身份（地主或农民）
     */
    public void addIdentity(List<Player> player) {
        Player players = new Player();
        if ((player.get((int) (Math.random() * 4)).id).equals(players.id)) {
            System.out.println("A");
            players.identity = "地主\uD83D\uDE00";
        } else {
            players.identity = "农民\uD83D\uDC73";
        }
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void sortCard(){
        Arrays.sort(cards);
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

}